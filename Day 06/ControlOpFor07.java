package days06;
import java.util.Scanner;

public class ControlOpFor07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to which you want to be factorized: ");
		int factNum = sc.nextInt();
		int result = 1;

		System.out.printf("%d! = ", factNum);
		for(int i = factNum; i > 1; i--) {
			System.out.print(i + "x");
			result *= i;
		}
		System.out.printf("%d = %d", 1, result);
		
	}
}
