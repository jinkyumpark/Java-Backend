package days10;

// Method : also known as function
// 간헐적으로 반복되는 코드를 별도로 정의, 그 이름을 불러서 코드를 실행하는 단위코드
// Java 에서는 function 보다는 method 라고 주로 부름

// 특징
// 1. 명령들이 모여서 기능을 정의하는 단위
// 2. 일련의 실행코드들을 묶어서 재활용
// 3. 메서드는 각 메서드마다 고유한 이름이 있음
// 4. 메서드가 이름이 불리워져서 실행되라는 명령(Call)을 받으면, 메서드 안의 코드가 실행
// 5. 자바의 메서드는 이름 옆에 항상 괄호()를 달고 나옴

// 매소드 선언 : 반드시 클래스 내부에서만 선언 가능

public class Method01 {
	public static void main(String[] args) {
		printMethod();
		System.out.println();
		printMethod();
		System.out.println();
		printMethod();
	}
	
	public static void printMethod() {
		System.out.printf("내가 만든 Print 매서드 실행!");
	} // 매개변수가 없다
}
