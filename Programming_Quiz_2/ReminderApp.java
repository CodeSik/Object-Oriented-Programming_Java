package Quiz2;

import java.util.Arrays;

public class ReminderApp {
	private Memo[] memos;
	private int memoCount;
	public ReminderApp() {
		super();
		memoCount = 0;
		memos = new Memo[10];
	}
	
	public void addMemo(Memo memo)
	{
		memos[memoCount] = memo;
		memoCount++;
	}
	
	public void removeMemo()
	{
		memos[memoCount] = null;
		memoCount --;
	}
	
	public String toString()
	{
		String a="";
		Arrays.sort(memos,0,memoCount);
		for (int i=0; i<memoCount ; i++)
		{
			a+=memos[i].toString();
		}
		
		
		return a;
		
	}
	
	
}
