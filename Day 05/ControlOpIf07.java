package days05;
import java.util.Scanner;

public class ControlOpIf07 {
	public static void main(String[] args) {
		// 판매실적금액에 과장 50%, 대리 25%, 사원 15%의 활동비를 합산하여 출력
		Scanner stdIn = new Scanner(System.in);
		String level;
		int income;
		
		System.out.print("직급 입력(과정/대리/사원) : ");
		level = stdIn.nextLine();
		System.out.print("판매실적금액 입력 : ");
		income = stdIn.nextInt();
		
		if(level.equals("과장") == true) {
			double netIncome = income + income * 0.5;
			System.out.print("Netincome: " + netIncome);
		} else if(level.equals("대리") == true) {
			double netIncome = income + income * 0.25;
			System.out.print("Netincome: " + netIncome);
		} else {
			double netIncome = income + income * 0.15;
			System.out.print("Netincome " + netIncome);
		}
	}
}
