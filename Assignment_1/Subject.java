package Quiz;

public class Subject {

	private String name,tutor,room,fullname;

	public Subject(String name, String tutor, String room) {
		
		this.name = name;
		this.tutor = tutor;
		this.room = room;
	}

	public Subject(String name) {
		super();
		this.name = name;
	}

	public Subject(Subject a) //copy constructor
	{
		if(a == null)
		{
			System.out.println("Fatal Error.");
			System.exit(0);
		}
		a.name = this.name;
		a.tutor = this.tutor;
		a.room = this.room;
	}

	public String getName() { //getter
		return name;
	}

	public String getTutor() {
		return tutor;
	}


	public String getRoom() {
		return room;
	}

	public void setRoom(String room) { //setter
		this.room = room;
	}
	
	public void setname(String name) { 
		if(name.length()<9){
			this.fullname = name;
			this.name="";
			for(int i=0 ; i< 9-name.length() ; i++)
			{
				this.name += " ";
			}
			this.name+=name;
		}
		else if (name.length()>9)	{
			this.fullname = name;
			this.name = name.substring(0, 9);
		}
		else {	
			this.name=name;
			this.fullname = name;
		}
	}
	
	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public boolean equals(Subject anObject) {
		if(anObject.name== this.name && anObject.tutor == this.tutor && anObject.room == this.room )
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		
		return name;
	}
	
	public void getDetails(){
		System.out.println("Name: " + this.fullname);
		System.out.println("Tutor: "+this.tutor);
		System.out.println("Room: "+this.room);
	}
	
	
	
	

	
	
	
	
	
	
}
