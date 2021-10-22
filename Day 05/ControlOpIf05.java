package days05;
import java.util.Scanner;

public class ControlOpIf05 {
	public static void main(String[] args) {
		int year;
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("The year born: ");
		year = sc.nextInt();
		age = 2021 - year + 1;
		
		if(age >= 1 && age < 12) 
			System.out.println("Child");
		else if(age >= 19 && age <= 25)
			System.out.println("청");
		
	}
}
