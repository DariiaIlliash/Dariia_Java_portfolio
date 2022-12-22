package homework;

public class validate_floorMats {

	public static void main(String[] args) {
		
		// FROM CUSTOMER Searching for Floor Mats & Liners
		select_Parts("Interior");

		
	}
	
	public static void select_Parts(String parts) {
		//TODO write a switch statement add cases 
		switch(parts) {
		case "Auto Body Parts & Mirrors":
			break;
		case "Headlights & Lighting":
			break;
		case "Engine & Drivetrain":
			break;
		case "Brakes, Suspension & Steering":
			break;
		case "Interior":
			System.out.println("Floor Mats & Liners");
			break;
		case "Exterior":
			break;
		case "Tools & Garage":
			break;
		case "Wheels & Tires":
			break;
			default: System.out.println("Parts you search for is not available");
		}
	}
}














