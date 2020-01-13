package Quiz;

import java.util.Scanner;

import Quiz.TimeTable.DAYS;

public class TimeTableApp {

	public static DAYS dayCheck(String day)
	{
		DAYS day_Enum=null;
		if(day.equalsIgnoreCase("monday"))
			day_Enum = day_Enum.MONDAY;
		else if (day.equalsIgnoreCase("tuesday"))
			day_Enum = day_Enum.TUESDAY;
		else if (day.equalsIgnoreCase("wednesday"))
			day_Enum = day_Enum.WEDNESDAY;
		else if (day.equalsIgnoreCase("thirsday"))
			day_Enum = day_Enum.THIRSDAY;
		else if (day.equalsIgnoreCase("friday"))
			day_Enum = day_Enum.FRIDAY;
		else{
			System.out.println("Wrong Input.");
		}
		return day_Enum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int num,period;
		DAYS day_Enum=null;
		String name,day,tutor,room,timeTablePrint;
		Scanner input = new Scanner(System.in);
		TimeTable timetable = new TimeTable();
		timeTablePrint=timetable.toString();
		System.out.println(timeTablePrint);
		while(true)
		{
			System.out.println("======================================Main Menu======================================");
			System.out.println("(1) Add a class to my time table: ");
			System.out.println("(2) View the class at a specific time: ");
			System.out.println("(3) Print the time table");
			System.out.println("(4) Exit the program");
			System.out.println("======================================Main Menu======================================");
			num = input.nextInt();
			
			if (num == 1)
			{
				System.out.println("Please enter the day to add the class: ");
				day = input.nextLine();
				day = input.nextLine();
				day_Enum = dayCheck(day);
				if(day_Enum.equals(null))
					break;
				System.out.println("Please enter the period to add the class: ");
				period = input.nextInt();
				System.out.println("Please enter the name of the class: ");
				name = input.nextLine();
				name = input.nextLine();
				System.out.println("Please enter the name of tutor: ");
				tutor = input.nextLine();
				System.out.println("Please enter the name of room: ");
				room = input.nextLine();
				
				
				if(timetable.setSchedule(day_Enum, period, name, tutor, room))
					System.out.println("Class successfully added");
				else
					System.out.println("Class was NOT successfully added");
			}
			else if (num == 2)
			{
				System.out.println("Please enter the day of the class: ");
				day = input.nextLine();
				day = input.nextLine();
				day_Enum = dayCheck(day);
				if(day_Enum.equals(null))
					break;
				System.out.println("Please enter the period of the class: ");
				period = input.nextInt();
				
				timetable.getSchedule(day_Enum, period);
				
				
			}
			else if (num == 3)
			{
				timeTablePrint=timetable.toString();
				System.out.println(timeTablePrint);
			}
			else if (num == 4)
			{
				break;
			}
			
		}
	}

}
