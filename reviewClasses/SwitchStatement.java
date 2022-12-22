public class SwitchStatement {
	public static void main(String[] args) {
		
		// The switch statement is a multi-way branch statement.
		// In simple word, the Java switch statement executes one statement from multiple conditions.
		// It is like "if-else-if" ladder statement.
		
		// Syntax for switch statement:
		
		//switch (expression) {
		// case statements
		// values must be of same type of expression
		//case 1:
			// Statements
		//	break; // break is optional
	//	case 2:
			// Statements
	//		break; // break is optional
		// We can have any number of case statements
		// below is default statement, used when none of the cases is true.
		// No break is needed in the default case.
	//	default:
			// Statements
			
		// The break statement is used inside the switch to terminate  a statement sequence.
		// The break is optional. If omitted, execution will continue on into next case.
			
		int day = 7;
		String dayString;
		
		switch (day) {
		case 1:
			dayString = "Monday";
			break;
		case 2:
			dayString = "Tuesday";
			break;
		case 3:
			dayString = "Wednesday";
			break;
		case 4:
			dayString = "Thursday";
			break;
		case 5:
			dayString = "Friday";
			break;
		default:
			dayString = "Invalid day";
			}
			System.out.println(dayString);
		}
	}















