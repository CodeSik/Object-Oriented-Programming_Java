package Quiz;

import java.util.Arrays;

public class TimeTable {
	public enum DAYS {MONDAY,TUESDAY,WEDNESDAY,THIRSDAY,FRIDAY} ;
	public Subject [][] timeTable = new Subject[10][5] ;
	public int period;
	public void initialize()
	{
		for (int i=0 ; i<10 ; i++)
		{
			for(int j=0 ; j<5 ; j++)
				timeTable[i][j] = new Subject(null,null,null);
		}
		for(int i=0 ; i< 5 ; i++)
		{
			timeTable[3][i].setname("Break");
			timeTable[7][i].setname("LUNCH");
		}
		
		for (int i=0; i<10; i++)
		{
			if(i ==3 || i ==7)
				continue;
			else
			{
				for(int j=0;j<5;j++)
				{
				timeTable[i][j].setname("----");
				}
			}
		}
	}
	
	public TimeTable(){
		this.initialize();
	}

	
	public Subject getSchedule(DAYS day , int period ) {
		
		System.out.println("At that time you have: ");
		timeTable[period-1][day.ordinal()].getDetails();
		return timeTable[period-1][day.ordinal()];
	}
	
	public boolean setSchedule(DAYS day, int period, String name, String tutor , String room)
	{
		if(period == 4 || period == 8 ){
			return false;
		}
		else{
			
			timeTable[period-1][day.ordinal()].setname(name);
			timeTable[period-1][day.ordinal()].setTutor(tutor);
			timeTable[period-1][day.ordinal()].setRoom(room);
			return true;
		}
		
	}
	
	@Override
	public String toString() {
		String result ="            MONDAY         TUESDAY        WEDNESDAY       THURSDAY         FRIDAY\n";
		for(int i=0 ; i < 10; i ++){
			result += i+1;
			for(int j=0 ; j< 5 ; j++)
			{
				result+="\t";
				result+=timeTable[i][j];
			}
			result += "\n";
		}
		
		return result;
	}
}
