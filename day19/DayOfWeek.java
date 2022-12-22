package day19;

public class DayOfWeek {
	public static void main(String[] args) {
    printDayMsg(Day.Wed);
	}
	
	
	public static void printDayMsg(Day day) {
 if (day.equals(Day.Mon)) {
System.out.println("Homework day!");
}else if (day.equals(Day.Tue)|| day.equals(Day.Thur)) {
	System.out.println("Study day");
}else if (day.equals(Day.Wed)){
		System.out.println("Relaxing day!");
	} else if (day.equals(Day.Fri)) {
		System.out.println("Coding day!");
	} else if (day.equals(Day.Sat)) {
		System.out.println("Java epic day!");
	} else if (day.equals(Day.Sun)) {
		System.out.println("Kahoot day!");
	} else {
		System.out.println("Undefined day");
	}
}
}
