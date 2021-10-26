package days03;
import java.util.Scanner;

public class Variable05 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = stdIn.nextLine();
		
		System.out.print("Korean: ");
		int scoreKorean = stdIn.nextInt();
		
		System.out.print("English: ");
		int scoreEnglish = stdIn.nextInt();
		
		System.out.print("Math: ");
		int scoreMath = stdIn.nextInt();
		
		double total = scoreKorean + scoreEnglish + scoreMath;
		double average = total / 3;
		
		System.out.print("---------------------------------------------------------\n");
		System.out.printf("Name\t\tKorean\tEnglish\tMath\tTotal\tAverage\n");
		System.out.print("---------------------------------------------------------\n");
		System.out.printf("%s\t\t%d\t%d\t%d\t%.1f\t%.1f", name, scoreKorean, scoreEnglish, scoreMath, total, average);
	}
}
