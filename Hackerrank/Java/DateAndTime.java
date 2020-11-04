import java.util.Scanner;
import java.util.Calendar;

public class DateAndTime {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] numbers = scan.nextLine().split(" ");
		scan.close();
		int month = Integer.parseInt(numbers[0]);
		int date = Integer.parseInt(numbers[1]);
		int year = Integer.parseInt(numbers[2]);
		System.out.println(findDay(month, date, year));
	}
	
	public static String findDay(int month, int date, int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		month -=1;
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.DAY_OF_MONTH, date);
		String time = calendar.getTime().toString();
		String day = null;
		if(time.contains("Sun")) {
		    day = "SUNDAY";
		}
		else if(time.contains("Mon")) {
		    day = "MONDAY";
		}
		else if(time.contains("Tue")) {
		    day = "TUESDAY";
		}
		else if(time.contains("Wed")) {
		    day = "WEDNESDAY";
		}
		else if(time.contains("Thu")) {
		    day = "THURSDAY";
		}
		else if(time.contains("Fri")) {
		    day = "FRIDAY";
		}
		else if(time.contains("Sat")) {
		    day = "SATURDAY";
		}
		else {
		    System.out.println("Enter correct date");
		}
		return day;
    	}
}
