package days04;
import java.util.Scanner;

public class Variable07 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("Number of Apple: ");
		int numApple = stdIn.nextInt();
		
		System.out.print("Number of Apple per Box: ");
		int numPerBox = stdIn.nextInt();
		
		int numBoxPacked = numApple / numPerBox;
		int numAppleLeft = numApple % numPerBox;
		
		System.out.printf("\nNumber of Box Packed: %d\nNumber of Apples left: %d\n", numBoxPacked, numAppleLeft);
		stdIn.close();
	}
}
