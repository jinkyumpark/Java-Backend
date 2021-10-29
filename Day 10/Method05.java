package days10;
import java.util.Scanner;

public class Method05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("출력할 단을 입력 : ");
		int k = sc.nextInt();
		
		printMultiplicationTable(k);
	}
	
	public static void printMultiplicationTable(int dan) {
		for(int i = 2; i <= 9; i++) {
			System.out.printf("%dx%d = %d\n", dan, i, i*dan);
		}
	}
}
