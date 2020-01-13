package pizza;

public class Cheese extends Topping {

	private PizzaOrTopping pizzaOrTopping;
	double cost;
	int cookingTime;
	public Cheese(PizzaOrTopping pizzaOrTopping) {
		super(pizzaOrTopping.getOrderNum());
		this.pizzaOrTopping = pizzaOrTopping;
		this.cost = 1.00;
		this.cookingTime = 3000;
	}
	
	public String toString()
	{
		return "\tExtra Cheese\n";
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
