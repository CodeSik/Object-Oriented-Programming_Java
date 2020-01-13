package pizza;

public class DeepPanPizza extends PizzaOrTopping {
	
	double cost;
	long cookingTime;
	
	public DeepPanPizza(int orderNum) {
		super(orderNum);
		super.description = "Deep Pan\n";
		this.cost = 4.50;
		this.cookingTime = 15000;
	}

	public double cost() {
		return cost;
	}

	public long getCookingTime() {
		return cookingTime;
	}
	
	

}
