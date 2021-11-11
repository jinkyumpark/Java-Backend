package days19;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Exception07 {
	public static void main(String[] args) {
		// 숫자로만 이루어진 정수를 입력받는 while과 try-catch를 제작하시오
		// sc.nextInt()는 입력 내용에 문자가 섞이면 InputMismatchException 에러가 발생
		// 에러 발생시, 입력 버퍼를 sc.next()를 실행해서 비우고
		// 잘못 입력했습니다메세지를 출력후 정상 력까지 반복하는 코드 작성
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		while(true) {
			try {
				System.out.print("Please enter an integer: ");
				num = sc.nextInt();
				break;
			} catch(InputMismatchException e) {
				System.out.println("You can only enter integer! Please try again.");
				sc.next();
			}
		}
		System.out.println("You've entered : " + num);
	}
}
