package pizza;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Oven implements Subject{

	private PizzaOrTopping finishedPizza;
	private ArrayList<PizzaOrTopping> pizzas;
	private ArrayList<Observer> observers;
	
	public Oven()
	{
		pizzas = new ArrayList<PizzaOrTopping>();
		observers = new ArrayList<Observer>();
		
		
	}
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(int i=0; i<observers.size() ; i++)
		{
			observers.get(i).update(finishedPizza);
		}
		
	}
	
	public String toString()
	{
		String a="";
		
		for(int i=0; i<pizzas.size() ; i++)
		{
			a += pizzas.get(i).getDescription();
			a+= "\n";
		}
		return a;
	}
	
	public void removePizza(PizzaOrTopping pizza)
	{
		pizzas.remove(pizza);
	}
	
	public void addPizza(PizzaOrTopping pizza)
	{
		pizzas.add(pizza);
		
		Timer pizzaTimer = new Timer();
		pizzaTimer.schedule(new TimerTask(){
			public void run(){
				pizza.finish();
				finishedPizza = pizza;
				removePizza(pizza);
				notifyObservers();
			}
		},pizza.getCookingTime());
			
		
	}
	
	
	
	

}
