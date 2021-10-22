package days05;
import java.util.Scanner;

public class ControlOpIf04 {
	public static void main(String[] args) {
		int a;
		Scanner stdIn = new Scanner(System.in);
		System.out.print("Enter the score: :");
		a = stdIn.nextInt();
		
		if( a >= 90) {
			System.out.println("A");
		} else if(a >= 80 && a <= 89) {
			System.out.println("B");
		}
	}
}
