package days06;
import java.util.Scanner;

public class ControlOpSwitch02 {
	public static void main(String[] args) {
		// 2021년에 한해서 월과 일을 입력 받고,
		// 요일을 출력하시오.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("Enter Month: ");
		int month = stdIn.nextInt();
		System.out.print("Enter Day: ");
		int day = stdIn.nextInt();
		
		int[] dayPerMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		// Calculate how many days have past since Jan.1
		int totalDayPast = 0;
		for(int i = 0; i < month - 1; i++) {
			totalDayPast += dayPerMonth[i];
		}
		totalDayPast += day;
		
		// Based on totalDayPast, calculate day of the week
		int correctionValue2021 = 4;
		int dayOfTheWeekIndex = (totalDayPast-correctionValue2021 + 7) % 7;
		String dayOfTheWeek = "";
		
		switch(dayOfTheWeekIndex) {
			case 0:
				dayOfTheWeek = "Mon";
				break;
			case 1:
				dayOfTheWeek = "TUE";
				break;
			case 2:
				dayOfTheWeek = "WEN";
				break;
			case 3:
				dayOfTheWeek = "THU";
				break;
			case 4:
				dayOfTheWeek = "FRI";
				break;
			case 5:
				dayOfTheWeek = "SAT";		
				break;
			case 6:
				dayOfTheWeek = "SUN";
				break;
			default:
				dayOfTheWeek = "Error";
		}
		System.out.println(month + "." + day + " is " + dayOfTheWeek);		

	}
}
