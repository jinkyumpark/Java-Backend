package days07;
import java.util.Scanner;

public class ControlOpFor10 {
	public static void main(String[] args) {
		// 10개의 정수를 입력받아 그들의 합계를 출력
		// 입력 도중 종료를 원하면 0을 입력
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			int index = i + 1;
			System.out.print("Enter " + index + ": ");
			int num = sc.nextInt();
			if(num != 0) {
				sum += num;
			} else {
				i = 10;
			}
		}
		System.out.println("Result: " + sum);
		
	}
}
