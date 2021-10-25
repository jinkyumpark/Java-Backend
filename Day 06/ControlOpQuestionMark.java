package days06;
import java.util.Scanner;

public class ControlOpQuestionMark {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a score: ");
		int score = sc.nextInt();
		
		String prnText;
		prnText = (score >= 70) ? "Pass":"Fail";
		
		System.out.println("Accoding to your score, you are: " + prnText);
		
		// 기본급 100만원 이상 50%, 100만원 미만 60%
		System.out.print("Enter a base income: ");
		int base = sc.nextInt();
		double bonus = base < 1000000 ? base * 0.5 : base * 0.6;
		double netIncome = base + bonus;
		System.out.println("Your net income is: " + netIncome);
	}
}
