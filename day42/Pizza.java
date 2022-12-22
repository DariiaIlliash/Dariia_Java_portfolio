package day42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pizza {
	public final String[] AVAILABLE_TOPPINGS = {"cheese", "chicken", "veggie", "mushrooms"};
	
	private double price;
	private List<String> toppings;
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		if (price < 0) {
			throw new IllegalArgumentException("Price cannot be negative");
		}
		this.price = price;
	}
	
	public List<String> getToppings() {
		return toppings;
	}
	
	public void setToppings(List<String> toppings) {
		for (String topping: toppings) {
			if (topping == null || !Arrays.asList(AVAILABLE_TOPPINGS).contains(topping)) {
				throw new IllegalArgumentException("This topping is not available: " + topping);
			}
		}
		
		// it is good!
		// get copy of mutable Object
		// this.toppings = toppings;
		this.toppings = new ArrayList<>(toppings);
	}
}

