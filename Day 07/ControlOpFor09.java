package days07;
import java.util.Scanner;

public class ControlOpFor09 {
	public static void main(String[] args) {
		// 정수 하나를 입력 받아서
		// 2부터 입력받은 정수까지 짝수의 합을 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an interger: ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 2; i <= num; i += 2) {
			sum += i;
		}
		
		System.out.print("Result: " + sum);
	}
}
