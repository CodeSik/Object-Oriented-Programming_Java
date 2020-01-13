package pizza;

public class Bacon extends Topping{
	private PizzaOrTopping pizzaOrTopping;
	double cost;
	int cookingTime;
	public Bacon(PizzaOrTopping pizzaOrTopping) {
		super(pizzaOrTopping.getOrderNum());
		this.pizzaOrTopping = pizzaOrTopping;
		this.cost = 0.75;
		this.cookingTime = 2000;
	}
	
	public String toString()
	{
		return "\tBacon\n";
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
