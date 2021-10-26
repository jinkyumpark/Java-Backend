package days03;
import java.util.Scanner;

public class Variable03 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.printf("Enter the base of the triangle: ");
		double base = stdIn.nextDouble();
		System.out.printf("Enter the height of the triangle: ");
		double height = stdIn.nextDouble();
		
		double area = base * height * 0.5;
		
		System.out.printf("The area of the triangle is: %.1f", area);
		
	}
}
