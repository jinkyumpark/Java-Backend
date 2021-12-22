package days08;
import java.util.Scanner;

public class ControlOpWhile04 {
	public static void main(String[] args) {
		// 사용자에게 단을 입력 받아 구구단을 출력
		// 사용자가 0을 입력할때까지 구구단 출력
		
		Scanner sc = new Scanner(System.in);
		int dan = -1;
		
		while(dan != 0) {
			System.out.print("구구단 단 입력(종료-0) : ");
			dan = sc.nextInt();
			if(dan != 0) {
				for(int i = 2; i <= 9; i++) {
					System.out.printf("%dx%d = %d\n", dan, i, dan * i);
				}
			}
		}
		System.out.println("Program Terminated");
	}
}