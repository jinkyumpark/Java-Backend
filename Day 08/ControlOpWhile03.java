package days08;
import java.util.Scanner;

public class ControlOpWhile03 {
	public static void main(String[] args) {
		// 정수를 입력받아 입력된 정수의 팩터리얼을 출력
		// while 문 사용
		
		Scanner sc = new Scanner(System.in);
		int num, fact =1;
		System.out.print("Enter an integer which you want to be factorized: ");
		num = sc.nextInt();
		int result = num;
		
		System.out.printf("%d! = ", num);
		
		while(fact < num) {
			result *= fact;
			System.out.printf("%dx", fact);
			fact++;
		}
		System.out.printf("%d = %d", num, result);
	}
}
