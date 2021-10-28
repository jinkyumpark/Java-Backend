package days09;
import java.util.Scanner;


public class Array08 {
	public static void main(String[] args) {
		// 정수를 입력 받아 해당 학점을 출력
		// if 문 사용하지 않음
		// 90 >= A, 80 >= B, 70 >= C, 60 >= D, F
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the score(0-100) : ");
		int score = sc.nextInt();
		
		char [] grade = {'F', 'F', 'F', 'F', 'F', 'F', 'D', 'C', 'B', 'A', 'A'};
		
		System.out.print("You are " + grade[score/10 - 1]);
	}
}
