package days05;
import java.util.Scanner;

public class ControlOpIf06 {
	public static void main(String[] args) {
		// 기본급이 백만원 이상이라면 기본급의 50%를 보너스로 합산
		// 기본급이 백만원 미만이라면 기본급의 60%를 보너스로 합산
		// 총지급액을 출력하세요
		
		Scanner stdIn = new Scanner(System.in);
		int baseIncome;
		double netIncome;
		
		System.out.print("기본급을 입력하세요: ");
		baseIncome = stdIn.nextInt();
		
		if(baseIncome < 1000000) {
			double bonusIncome = baseIncome * 0.6;
			netIncome = baseIncome + bonusIncome;
		} else {
			double bonusIncome = baseIncome * 0.5;
			netIncome = baseIncome + bonusIncome;
		}
		
		System.out.println("총지급액은 " + netIncome + " 입니다.");
	}
}
