package days17;
import java.util.Calendar;

public class CalendarClass04 {
	public static void main(String[] arg) {
		Calendar date = Calendar.getInstance();
		date.set(2021, 10, 30);
		System.out.println(toDate(date));
		
		System.out.println("1 Day Later");
		date.add(Calendar.DATE, 1);
		System.out.println(toDate(date));
		
		System.out.println("6 Months Later");
		date.roll(Calendar.DATE, 40); // No effect in other fields
		System.out.println(toDate(date));
	}
	
	public static String toDate(Calendar c) {
		String cDate = c.get(Calendar.YEAR) + " Year "
				+ (c.get(Calendar.MONTH) + 1) + " Month "
				+ c.get(Calendar.DATE) + " Day"; 
		return cDate;
	}
}
