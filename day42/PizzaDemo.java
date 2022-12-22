package day42;

import java.util.ArrayList;
import java.util.List;

public class PizzaDemo {
	public static void main(String[] args) {
		Pizza pizza = new Pizza();
		pizza.setPrice(19.5);
		
		List<String> myToppings = new ArrayList<>();
		myToppings.add("cheese");
		myToppings.add("chicken");
		// myToppings.add("broccoli");
		pizza.setToppings(myToppings);
		
		myToppings.add("broccoli");
		
		System.out.println(pizza.getPrice());
		System.out.println(pizza.getToppings());
	}
}

