package days04;

// 산술 연산자 (사칙연산) - +, -, *, /, %
// 관계 연산자, 비교 연산자 -  >, <, >=, <=. ==, !=
// 논리 연산자 - &&, ||, !

public class Operator01 {
	public static void main(String[] args) {
		// 산술연산자
		int n1 = 10, n2 = 7, result1;
		double result2;
		result1 = n1 + n2;
		System.out.println(n1 + "+" + n2 + "=" + result1);
		result1 = n1 - n2;
		System.out.println(n1 + "-" + n2 + "=" + result1);
		result1 = n1 * n2;
		System.out.println(n1 + "*" + n2 + "=" + result1);
		result2 = n1 / (double)n2;
		System.out.println(n1 + "/" + n2 +  "=" + result2);
		double result3 = (int)(result2 * 100) /100.0;
		System.out.println(n1 + "/" + n2 + "=" + result3);
		
	}
}
