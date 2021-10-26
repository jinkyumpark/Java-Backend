package days03;
import java.util.Scanner;

public class Variable02 {
	public static void main(String[] args) {
		int num1, num2;
		int result1;
		double result2;
		
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		// 컴파일러가 sc.nextInt() 명령을 만나면 커서를 깜빡이면서 사용자에게서 입력이 있을때까지 무한정 대기합니다.
		// 화면으로부터 정수를 입력 받아 num1 변수에 저장
		System.out.println("Entered: " + num1);
	}
}
