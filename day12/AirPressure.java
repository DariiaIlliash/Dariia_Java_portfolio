package day12;

import util.InputFromUser;

public class AirPressure {
	public static final double NORMAL_PRESSURE_START = 13.5;
	public static final double NORMAL_PRESSURE_END = 15.5;
	public static void main(String[] args) {
		
Double.parseDouble(InputFromUser.getInput("Enter pressure:"));
		
		if (pressure >= NORMAL_PRESSURE_START && pressure <= NORMAL_PRESSURE_END) {
			System.out.println("normal pressure");
			
		} else if (pressure < NORMAL_PRESSURE_START) {
			System.out.println("low pressure");
			
		} else if (pressure > NORMAL_PRESSURE_END) {
			System.out.println("high pressure");
			
		} else {
			System.out.println("Undefined pressure");
		}
	}
}


