package pizza;

public class OriginalPizza extends PizzaOrTopping {


	double cost;
	long cookingTime;

	public OriginalPizza(int orderNum) {
		super(orderNum);
		super.description = "Original Pizza\n";
		this.cost = 3.75;
		this.cookingTime = 10000;
	}

	public long getCookingTime() {
		return cookingTime;
	}

	public double cost() {
		return cost;
	}
	
	
}
