package pizza;

public class Pepperoni extends Topping {
	private PizzaOrTopping pizzaOrTopping;
	double cost;
	int cookingTime;
	public Pepperoni(PizzaOrTopping pizzaOrTopping) {
		super(pizzaOrTopping.getOrderNum());
		this.pizzaOrTopping = pizzaOrTopping;
		this.cost = 2.00;
		this.cookingTime = 2500;
	}
	
	public String toString()
	{
		return "\tPepperoni\n";
	}

	public String getDescription() {
		return pizzaOrTopping.getDescription() + this.toString();
	}


	public long getCookingTime() {
		return pizzaOrTopping.getCookingTime()+ this.cookingTime;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return pizzaOrTopping.cost()+this.cost;
	}
	
}
