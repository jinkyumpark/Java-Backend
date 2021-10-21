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
		
		// 자료형과 산술연산
		byte b1 = 10;
		byte b2 = 5;
		// 정수(byte, short, int)와 정수의 산술 연산이 일어나면 결과 값은 int 타입
		byte b3 = (byte)(b1+b2);
		
		// 캐스팅 연산은 서로 호환이 가능한 자료끼리만 사용이 가능합니다.
		// 올바른 예 (실수->정수)
		double d1 = 1.23456;
		int a = (int)d1;
		// 잘못된 예 (문자->정수)
		String str = "123456";
		// int a = (int)str;
		
		// 잘못된 예 (int->String)
		int a2 = 123456;
		// String str2 = (String)a2;
		
		// 호환이 되지 않는 자료들간의 형변환은 별도의 도구(매서드)가 필요합니다
		// 별도의 형변환 도구 매서드는 이후 단원에서 자세히 학습합니다
		
		// String -> int
		String str3 = "123456";
		int c1 = Integer.parseInt(str); 
		
		// int -> String
		int b5 = 123456;
		String str5 = String.valueOf(b5); 
		
		// String -> double
		String s4 = "123/1234";
		double d4 = Double.parseDouble(s4);
		
		// String -> char
		String s5 = "ABCDEFG";
		char c5 = s5.charAt(0);
		
		// char -> String
		char c6 = 'A';
		String s6 = String.valueOf(c6);
		
		
		
 	}
}
