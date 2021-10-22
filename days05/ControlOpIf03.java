package days05;
import java.util.Scanner;

public class ControlOpIf03 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.printf("Enter an integer: ");
		int a = stdIn.nextInt();
		
		if(a > 0) {
			System.out.println("An integer " + a + " is positive.");
		} else if(a < 0) {
			System.out.println("An integer " + a + " is negative.");
		} else {
			System.out.println("An integer " + a + " is zero.");
		}
	
	}
}
