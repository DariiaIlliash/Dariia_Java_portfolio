package day47;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StrToDatesTask2 {
	public static void main(String[] args) {
		String str = "Deleted date is 12/01/2022";
		
		// TODO Make sure deleted date is today's date
		// 1. Get date part from str
		str = str.split("time")[1].trim();
		System.out.println(str);
		// 2. Convert to LocalDate by using DateTimeFormatter
		formatter =DateTimeFormatter.ofPattern("MMMM dd,uuuu -hh:mm a");
		LocalDateTime convertedDateTime = LocalDateTime.parse(str,formatter);
		System.out.println(convertedDateTime);
		// 3. Create today's date
		LocalDate today = LocalDate.now();
		// 4. Compare two dates
		
	}
}


