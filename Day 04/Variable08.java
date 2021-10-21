package days04;

public class Variable08 {
	public static void main(String[] args) {
		// char assignment : in order to differentiate one letter with another letter,
		// we use apostrophe('')
		// String assignment : we use quotation("")
		
		char ch =  'A';
		System.out.printf("ch -> %c\n", ch);
		
		// char type data is stored as a binary in computer memory
		// 문자를 저장하기 위한 코드체계에 의해 조합된 코드(ASCII)입니다.
		// 이를 십진수로 변환하면 정수로도 변환이 가능합니다.
		// 위의 내용을 기초로 한 결과 정수와 문자간 호환성이 발생됩니다.
		
		int intchar = ch;
		System.out.printf("ch -> %d\n", intchar);
		System.out.printf("ch -> %d\n", (int)ch);
		System.out.printf("ch -> %d\n", (int)'B');
		
		// 실수형 변수의 초기화
		// 자바에서 모든 실수들은 기본적으로 double 타입으로 인식합니다.
		// float 타입으로 값을 저장하기 위해서는 float 형  변수를 선언하고
		// float 형 데이터를 저장합니다.
		// float 변수에 double 형 데이터 입력 -> 에러
		// float f1 = 1.123 // 에러
		// float 변수에 float 형 데이터 입력 -> 정상실행
		float f2 = 1.123f; // 또는 float f2 = 1.123F
		// float 변수에 캐스팅 연산을 적용한 double 형 데이터 입력 -> 정상실행
		float f3 = (float)1.123;
		// 용량이 큰 자료형(double)에 작은 자료형(float) 데이터 대입 -> 정상실행
		double f4 = f2;
		
		// 출력형식은 double과 같은 형식이 사용됩니다.
		System.out.printf("%.1f\t%.1f\n", f2, f4);
		
		// 정수들의 값의 대입
		int a = 100;
		byte b1 = (byte)a;
		byte b2 = 123; // 기본형이 int 라서 실수형처럼 (byte)123이 필요할듯 하지만,
		// 정수 데이터에 한해서 생략하고 사용이 가능합니다.
		a = b2; // 용량이 자은 자료형을 큰 자료형에 대입은 정상실행.
		
		// 용량이 큰 변수값을 용량이 작은 변수값으로 넣으려고 하면 캐스팅 연산 필요
		// 반대의 경우는 문제없이 모든 실행이 가능합니다.
		
	}
}
