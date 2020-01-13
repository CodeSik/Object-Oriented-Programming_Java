package pizza;

public class Pineapple extends Topping {

	private PizzaOrTopping pizzaOrTopping;
	double cost;
	int cookingTime;
	
	
	public Pineapple(PizzaOrTopping pizzaOrTopping) {
		super(pizzaOrTopping.getOrderNum());
		this.pizzaOrTopping = pizzaOrTopping;
		this.cost = 1.00;
		this.cookingTime = 3500;
	}

	public String toString()
	{
		return "\tPineapples\n";
	}

	public String getDescription() {
		return pizzaOrTopping.getDescription() + this.toString();
	}

	public double cost() {
		return pizzaOrTopping.cost() + this.cost;
	}

	public long getCookingTime() {
		return pizzaOrTopping.getCookingTime()+this.cookingTime;
	}
	
	
}
