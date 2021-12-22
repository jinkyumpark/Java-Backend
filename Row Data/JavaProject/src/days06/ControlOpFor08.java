package days06;
import java.util.Scanner;

public class ControlOpFor08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter year: ");
		int year = sc.nextInt();
		System.out.print("Enter month: ");
		int month = sc.nextInt();
		System.out.print("Enter day: ");
		int day = sc.nextInt();
		
		// 1. Calculate days that have past since year 0 to 2020
		// ex: 2021 -> 365 * 2020 + # of leap year since 2020
		int days = 365 * year-1;
		for(int i = 1; i < year; i++) {
			if(i % 4 == 0 && i % 100 != 0 || i%400 == 0) {
				days++;
			}
		}
			
		// 2. Calculate days that have past since this year
		switch(month) {
		case 12:
			days += 30;
		case 11:
			days += 31;
		case 10:
			days += 30;
		case 9:
			days += 31;
		case 8:
			days += 31;
		case 7:
			days += 30;
		case 6:
			days += 31;
		case 5:
			days += 30;
		case 4:
			days += 31;
		case 3:
			if(year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
				days += 29;
			} else {
				days += 28;
			}
		case 2:
			days += 31;
		}
		
		days += day;
		int t = days % 7;
		
		switch(t) {
		case 1: System.out.println("MON"); break;
		case 2: System.out.println("TUE"); break;
		case 3: System.out.println("WEN"); break;
		case 4: System.out.println("THU"); break;
		case 5: System.out.println("FRI"); break;
		case 6: System.out.println("SAT"); break;
		case 0: System.out.println("SUN"); break;
		}
	}
}
