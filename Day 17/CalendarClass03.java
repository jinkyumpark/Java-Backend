package days17;
import java.util.Calendar;

public class CalendarClass03 {
	public static void main(String[] args) {
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		time1.set(Calendar.HOUR_OF_DAY, 10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);
		time2.set(Calendar.HOUR_OF_DAY, 20);
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);
		printTime(time1);
		printTime(time2);
		System.out.println(time1.getTimeInMillis());
		System.out.println(time2.getTimeInMillis());
		long difference = Math.abs(time1.getTimeInMillis() - time2.getTimeInMillis());
		System.out.println("The difference between 2 time in second is : " + difference/1000);
	}
	
	public static void printTime(Calendar c) {
		System.out.println("time : "
				+ c.get(Calendar.HOUR_OF_DAY) + "H "
				+ c.get(Calendar.MINUTE) + "M "
				+ c.get(Calendar.SECOND) + "S "
				+ c.get(Calendar.MILLISECOND)
				);
	}
}
