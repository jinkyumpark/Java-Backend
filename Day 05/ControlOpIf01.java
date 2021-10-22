package days05;
import java.util.Scanner;

public class ControlOpIf01 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = stdIn.nextInt();
		
		// 
		if(num == 0) {
			System.out.println("The integer is even");
		} else {
			System.out.println("The integer is odd");
		}
	
	}
}
