package program1;

public class LibraryAccount {
	
	private String name;
	private int idNumber;
	
	private String book1,book2,book3;
	
	public String lastID;
	
	
	public LibraryAccount(String name){
		this.name = name;
		this.book1 = null;
		this.book2 = null;
		this.book3 = null;
	}
	

	public LibraryAccount(String name,String book){
		this.name =name;
		this.book1 = book;
		this.book2 = null;
		this.book3 = null;
	}
	
	//copy
	
	

	public String getName() {
		return name;
	}

	public int getIdNumber() {
		return idNumber;
	}


	public String getBook1() {
		return book1;
	}

	public String getBook2() {
		return book2;
	}

	public String getBook3() {
		return book3;
	}


	public void setBook1(String book1) {
		this.book1 = book1;
	}

	public void setBook2(String book2) {
		this.book2 = book2;
	}

	public void setBook3(String book3) {
		this.book3 = book3;
	}

	@Override
	public String toString() {
		return "LibraryAccount [name=" + name + ", book1=" + book1 + ", book2=" + book2
				+ ", book3=" + book3 + "]";
	}
	
	public boolean borrow(String book)
	{
		
		if(this.book1 == null)
		{
			setBook1(book);
			return true;
		}
		else if (this.book2 == null)
		{
			setBook2(book);
			return true;
		}
		else if (this.book3 == null)
		{
			setBook3(book);
			return true;
		}
		else{
			return false;
	}
	}
	public boolean replace(String book){
		if(this.book3 != null && this.book3 == book)
		{
			setBook3(null);
			return true;
		}
		else if (this.book2 != null && this.book2 == book)
		{
			setBook2(null);
			return true;
		}
		else if (this.book1 != null && this.book1 == book)
		{
			setBook1(null);
			return true;
		}
		else{
			return false;
	}
	}
	
}