package days08;
import java.util.Scanner;

public class ControlOpWhile07 {
	public static void main(String[] args) {
		// 달력 출력
		Scanner sc = new Scanner(System.in);
		int index = 0;
		
		int year = 0;
		int month = 0;
		
		while(true) {
			if(index == 0) {
				System.out.print("Enter year: ");
				year = sc.nextInt();
				System.out.print("Enter month: ");
				month = sc.nextInt();
				printCalendar(year, month);
			} else if(index == 1) {
				if(month > 1) {
					printCalendar(year, --month);
				} else {
					month = 12;
					printCalendar(--year, month);
				}
			} else if(index == 2) {
				if(month != 12) {
					printCalendar(year, ++month);
				} else {
					month = 1;
					printCalendar(++year, month);
				}
			} else {
				break;
			}
			index = askUserOption(sc);
		}
		if(index == 3) {
			System.out.println("Program Successfully Terminated");
		} else {
			System.out.println("Not a Valid Input; Program Terminated");
		}
	}
	
	public static String dateToDayOfWeek(int year, int month, int day) {
		
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
		case 1: return "MON";
		case 2: return "TUE";
		case 3: return "WEN";
		case 4: return "THU";
		case 5: return "FRI";
		case 6: return "SAT";
		case 0: return "SUN";
		default: return "ERROR";
		}

	}
	
	public static int dayOfWeekToNum(String dayOfWeek) {
		switch(dayOfWeek) {
		case "MON": return 1;
		case "TUE": return 2;
		case "WEN": return 3;
		case "THU": return 4;
		case "FRI": return 5;
		case "SAT": return 6;
		case "SUN": return 7;
		default: return 0;
		}
	}

	public static int lastDayOfMonth(int year, int month) {
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 10: case 12:
			return 31;
		case 4: case 6: case 8: case 9: case 11:
			return 30;
		case 2:
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				return 29;
			} else {
				return 28;
			}
		}
		return 0;
	}

	public static void printCalendar(int year, int month) {
		System.out.println("\n" + year + "." + month);
		System.out.println("-----------------------------------------");
		System.out.println("MON\tTUE\tWEN\tTHU\tFRI\tSAT\tSUN");
		System.out.println("-----------------------------------------");
		
		int index = dayOfWeekToNum(dateToDayOfWeek(year, month, 1));
		int lastDay = lastDayOfMonth(year, month);
		
		for(int i = 1; i < index; i++) {
			System.out.print("\t");
		}
		
		for(int i = 1; i <= lastDay; i++) {
			System.out.printf("%d\t", i);
			if((i + index-1) % 7 == 0) {
				System.out.println();
			}
		}
	}

	public static int askUserOption(Scanner sc) {
		System.out.printf("\n[1. Previous Month]\t[2.Next Month]\t[3. End] : ");
		return sc.nextInt();
	}
}
