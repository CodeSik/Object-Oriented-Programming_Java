package pizza;

import java.util.ArrayList;

public class PizzaShop {
	private static PizzaShop singlePizzaShop; // singleton;
	private int orderCounter;
	private ArrayList<Order> orders;
	private Oven pizzaOven;
	
	public PizzaShop()
	{
		super();
		orders = new ArrayList<Order>();
		pizzaOven = new Oven();
		orderCounter = 1;
	}
	
	public static PizzaShop getInstance()
	{
		if(singlePizzaShop == null)
			singlePizzaShop = new PizzaShop();
		return singlePizzaShop;
	}
	
	
	public void placeOrder(PizzaOrTopping pizza)
	{
		Order order = new Order(orderCounter, pizzaOven);
		this.orderCounter ++;
		orders.add(order);
		pizzaOven.registerObserver(order);
		pizzaOven.addPizza(pizza);
	}
	
	public int getOrderCounter()
	{
		return this.orderCounter;
	}
	
	public Oven getPizzaOven()
	{
		return this.pizzaOven;
	}
	
	public String toString(){
		return pizzaOven.toString();
	}
	
	
	
	
	
}
