package days08;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ControlOpWhile01 {
	public static void main(String[] args) {
		// While Loop
		// for loop repeats pre-determined number of times
		// while loop is mostly used when number of times you want to be repeated is not definite
		// while loop repeats until the provided condition is false
		// while(true) {} repeats forever (called infinite loop)
		
//		for(int i = 1; i <= 10; i++) {
//			System.out.printf("for %d", i);
//		}
//		
//		System.out.println();
//		
//		int i = 0;
//		while(i < 10) {
//			System.out.printf("while %d", i);
//			i++;
//		}
		
		// while loop is more commonly used when repeating situation is determined 
		// by certain condition regardless of orders
		
		Scanner sc = new Scanner(System.in);
		int input = 0;
		while(true) {
			System.out.print("Select Menu (1(save), 2(load), 3(end)) : ");
			try {
				input = sc.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("Wrong kind of input");
				break;
			}
			if(input == 3) {
				break;
			}
		}
		System.out.println("Program successfully terminated");
	}
}
