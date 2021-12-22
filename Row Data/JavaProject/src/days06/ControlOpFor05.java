package days06;
import java.util.Scanner;

public class ControlOpFor05 {
	public static void main(String[] args) {
		// 2 숫자를 입력 받아서 그 숫자 사이에 자연수를 작은 순서대로 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int num1 = sc.nextInt();
		System.out.print("Enter second integer: ");
		int num2 = sc.nextInt();
		
		int smallerNum = (num1 < num2) ? num1 : num2;
		int biggerNum = (num1 > num2) ? num1 : num2;
		
		for(int i = smallerNum; i <= biggerNum; i++) {
			System.out.print(i + " ");
		}
	}
}
