package days17;
import java.util.Calendar;
import java.util.Scanner;

public class CalendarClass05 {
	public static void main(String[] args) {
		int year, month;
		int input = 0;
		Scanner sc = new Scanner(System.in);
		System.out.printf("Year : ");
		year = sc.nextInt();
		System.out.printf("Month : ");
		month = sc.nextInt();
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		sDay.set(year, month-1, 1);
		eDay.set(year, month, 1);
		eDay.add(Calendar.DATE, -1);
		
		int startWeekOfDay = sDay.get(Calendar.DAY_OF_WEEK);
		
		printCalendar(year, month, startWeekOfDay, eDay);
	}
	
	public static void printCalendar(int year, int month, int startWeekOfDay, Calendar eDay) {
		System.out.println("\n" + year + "년" + month + "월 ");
		System.out.println("--------------------------------------------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("--------------------------------------------------");
		
		for(int i = 1; i < startWeekOfDay; i++) {
			System.out.printf("\t");
		}
		
		for(int i = 1; i <= eDay.get(Calendar.DATE); i++) {
			System.out.printf("%2d\t", i);
			if(startWeekOfDay++ % 7 == 0)
				System.out.println();
		}
	}
}
