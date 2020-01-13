package pizza;

public abstract class PizzaOrTopping {
	protected String description;
	private boolean isFinished;
	private int orderNum;
	


	public PizzaOrTopping(int orderNum) {
		// TODO Auto-generated constructor stub
		this.description = "Unknown Pizza";
		this.isFinished = false;
		this.orderNum = orderNum;
		
	}

	public String getDescription() {
		return description;
	}



	public boolean isFinished() {
		return isFinished;
	}


	public int getOrderNum() {
		return orderNum;
	}


	public void finish()
	{
		this.isFinished = true;
	}

	@Override
	public String toString() {
		return "description=" + description ;
	}
	
	
	public abstract long getCookingTime();
	public abstract double cost();
	
}
