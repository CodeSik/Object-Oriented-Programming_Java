package pizza;

public class Order implements Observer {
	private int orderNum;
	private boolean collected;
	private Subject pizzaOven;
	@Override
	public void update(PizzaOrTopping pizza) {
		// TODO Auto-generated method stub
		if(this.orderNum == pizza.getOrderNum())
		{
			this.collected = true;
			//this.pizzaOven.removeObserver();
			//remove this from the pizzaOven's observer's list.?? ¹«½¼¸»..
		}
	}
	public Order(int orderNum, Subject pizzaOven) {
		super();
		this.orderNum = orderNum;
		this.pizzaOven = pizzaOven;
		this.collected = false;
	}
	
	
	
}
