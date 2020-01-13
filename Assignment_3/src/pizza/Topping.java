package pizza;

public abstract class Topping extends PizzaOrTopping {

	public Topping(int orderNum) {
		super(orderNum);
		// TODO Auto-generated constructor stub
	}
	
	public abstract String getDescription();
	
	

	
}
