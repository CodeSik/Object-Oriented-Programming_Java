package program1;




public class mainactivity {

	public static void main(String[] args) {
		LibraryAccount ac1,ac2,ac3,ac4;
		ac1 = new LibraryAccount ("John Doe", "Sherlock Holmes");
		ac2 = new LibraryAccount ("Lisa Smith", "Moby Dick"); 
		ac3 = new LibraryAccount ("Phillip James"); 
		ac4 = new LibraryAccount ("Jane Andersen","Php programming"); 
		
		System.out.println(ac1.toString());
		System.out.println(ac2.toString());
		System.out.println(ac3.toString());
		System.out.println(ac4.toString());
		
		boolean bool;
		bool = ac3.borrow("20000 leagues under the sea");
		System.out.println(bool);
		bool = ac3.borrow( "Tales from Shakespeare" );
		System.out.println(bool);
		bool = ac4.borrow("Java Programming");
		System.out.println(bool);
		bool = ac4.borrow("HTMP Design");
		System.out.println(bool);

		bool = ac4.borrow("C++ programming");
		System.out.println(bool);
		bool = ac4.replace("HTMP Design");
		System.out.println(bool);

		bool = ac4.borrow("C++ programming");
		System.out.println(bool);

		System.out.println(ac1.toString());
		System.out.println(ac2.toString());
		System.out.println(ac3.toString());
		System.out.println(ac4.toString());
		
	}
	

}
