package days03;
import java.util.Scanner;

public class Variable04 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Enter the radius of the circle: ");
		double radius = stdIn.nextDouble();
		
		double area = Math.pow(radius, 2) * 3.141592;
		double circumference = 2 * radius * 3.141592;
		
		System.out.printf("The area of the circle is %.1f\n", area);
		System.out.printf("The circumference of the cielce is %.1f", circumference);
	}
}
