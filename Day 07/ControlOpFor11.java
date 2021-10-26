package days07;
import java.util.Scanner;

public class ControlOpFor11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = sc.nextInt();
		
		System.out.printf("Common factor of %d are: ", num);
		int lineIndex = 0;
		
		for(int i = 1; i < num; i++) {
			if(num % i == 0) {
				System.out.printf("%d, ", i);
				lineIndex++;
				if(lineIndex % 5 == 0) {
					System.out.println();
				}
			}
		}
		System.out.printf("%d", num);
	}
}
