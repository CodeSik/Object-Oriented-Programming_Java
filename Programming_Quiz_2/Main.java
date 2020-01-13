package Quiz2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReminderApp reminder = new ReminderApp();
		reminder.addMemo(new Memo("Quiz","Dont forget to study for Quiz 2","24","05","2017"));
		reminder.addMemo(new Memo("Cat Food","Dont forget to buy cat food.","15","05","2017"));
		reminder.addMemo(new Memo("Dog Food","Dont forget to buy dog food","18","05","2017"));
		reminder.addMemo(new Memo("Assignment 2","Dont forget to do Assignment 2","05","05","2017"));
		
		System.out.println(reminder.toString());
	}

}
