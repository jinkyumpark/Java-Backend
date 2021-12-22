package days04;

public class Operator04 {
	public static void main(String[] args) {
		// 논리 연산자 : &&, ||, !
		// 다수의 관계 연산식 결과를 조합하여 하나의 boolean 값을 결과로 얻는 연산
		
		int a = 80;
		boolean b = (70 < a) && (a < 100);
		System.out.println("Is a greater than 70 and less than 100? " + b);
		a = 30;
		b = (70 < a) || (a < 40);
		System.out.println("Is a greater than 70 or less than 40? " + b);
		
		System.out.printf("F && F = %b\n", false && false);
		System.out.printf("T && F = %b\n", true && false);
		System.out.printf("F && T = %b\n", false && true);
		System.out.printf("T && T = %b\n", true && true);
		// 좌항이 false인 경우 우항을 비교하지 않음
		
		System.out.printf("F || F = %b\n", false || false);
		System.out.printf("T || F = %b\n", true || false);
		System.out.printf("F || T = %b\n", false || true);
		System.out.printf("T || T = %b\n", true || true);
		// 좌항이 true인 경우 우항을 비교하지 않음
	
		System.out.printf("Not %b = %b\n", false, !false);
		System.out.printf("Not %b = %b\n", true, !true);
		
		// 점수가 80점 이상이면서 90점 이하면 true, 아니면 false
		int number = 80;
		boolean result = (number >= 80) && (number <= 90);
		System.out.printf("result = %b\n", result);
		
		int kor = 35, eng = 98, mat = 95;
		double avg = (kor + eng + mat) / 3;
		
		result = avg > 80 && eng > 75;
		System.out.printf("result = %b\n",result);
		
		// true = 국어 50, 영어 60, 수학 70 이상
		result = kor >= 50 && eng >= 60 && mat >= 70;
		System.out.printf("result = %b\n", result);
		
		// true = 한 과목이라도 40 미만
		result = kor < 40 || eng < 40 || mat < 40;
		System.out.printf("result = %b\n", result);
		
		// true = 평균 60 이상, 모든 과목 40 이상
		result = avg > 60 && kor > 40 && eng > 40 && mat > 40;
		System.out.printf("result = %b\n", result);
		
		// true = 국어 점수 짝수
		result = kor % 2 == 0;
		System.out.printf("result = %b\n", result);
		
		// 윤년의 조건 : 해당 년도가 4의 배수면서, 100의배수가 아니거나, 400의 배수인 해
		int year1 = 2020, year2 = 2021;
		System.out.printf("%d is leap year: %b\n", year1, isLeapYear(year1));
		System.out.printf("%d is leap year: %b\n", year2, isLeapYear(year2));
	}
	
	public static boolean isLeapYear(int year) {
		if((year %4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}
}
