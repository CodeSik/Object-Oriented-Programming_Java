package Quiz2;

import java.lang.*;


public class Memo implements Comparable<Memo> {
	private String title;
	private String memo;
	private Date rDate;
	private class Date
	{
		String day;
		String month;
		String year;
		
		public Date(String day,String month, String year)
		{
			this.day = day;
			this.month = month;
			this.year = year;
		}

		@Override
		public String toString() {
			return day+"/"+month+"/"+year;
		}
		public int compareTo(Date day)
		{
			if(day.day == this.day && day.month == this.month&& day.year == this.year)
				return 1;
			else
				return 0;
			
		}
	
	}
	public Memo(String title, String memo, String day, String month, String year) {
		super();
		this.title = title;
		this.memo = memo;
		rDate = this.new Date(day,month,year);
		
	}
	@Override
	public String toString() {
		return "-------------Memo-------------\n"
				+ "Title:" + title +"\n"
				+ "Memo:" + memo +"\n"
				+ "Date:" + rDate+"\n"
				+"============================\n";
	}
	
	public int compareTo(Date o) {
		if(this.rDate.day == o.day && this.rDate.month == o.month && this.rDate.year == o.year)
			return 1;
		else
			return 0;
	}
	@Override
	public int compareTo(Memo o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//comp
	
}
