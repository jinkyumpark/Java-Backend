package days06;
import java.util.Scanner;

public class ControlOpFor06 { 
	public static void main(String[] args) {
		// Factorial
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to which you want to be factorized: ");
		int factNum = sc.nextInt();
		int result = 1;
		
		if(factNum >= 0) {
			for(int i = 1; i <= factNum; i++) {
				result *= i;
			}
		} else {
			for(int i = 1; i <= -factNum; i++) {
				result *= i;
			}
			result = -result;
		}
		
		System.out.printf("%d! = %d", factNum, result);
	}
}
