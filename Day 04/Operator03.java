package days04;

public class Operator03 {
	public static void main(String[] args) {
		// 관계 연산자(비교 연산자)
		// > < >= <= == !=
		// 좌항과 우항의 크기를 비교하여 true/false 값이 결과가 되는 연산
		// 관계식이 올바른 경우 true, 틀린 경우 false
		
		int n1 = 10;
		int n2 = 5;
		boolean result;
		
		result = n1 > n2;
		System.out.println(result);
		
		// char 데이터 비교 : 각 데이터가 갖는 아스키 코드 값으로 비교
		char c1 = 'A', c2 = 'B';
		result = c1 > c2;
		System.out.printf("%c > %c -> %b\n", c1, c2, result);
		result = c1 < c2;
		System.out.printf("%c < %c -> %b\n", c1, c2, result);
		
		// String 자료형은 다른 자료형과 다르게 이 두 변수가 직접 문자들을 저장하고 있지 않습니다.
		// 문자들은 별도의 장소에 저장되고, 변수는 저장위치만 저장하고 있습니다.
		// 따라서 변수들간의 비교는 저장위치정보의 비교이므로 연산이 의미가 있지도 않고 가능하지도 않습니다.
		
		// String 의 크다 작다를 판단해 주는 .compareTo()
		// String 의 같다 다르다를 판단해 주는 .equals()
		// String 자료간의 비교는 대부분 위의 도구를 이용합니다.
		String s1 = "1";
		String s2 = "9";
		
		int r = s1.compareTo(s2);
		// s1이 크면 양수를, s2가 크면 음수를 발생, 같으면 0 발생
		// 앞글자에서 뒷글자의 아스키 코드값을 뺀 값(정수)를 결과로 얻음
		System.out.printf("%s > %s => %d\n", s1, s2, r);
		r = s2.compareTo(s2);
		System.out.printf("%s > %s => %d\n", s2, s1, r);
		
		boolean b = s1.equals(s2); // 둘이 같으면 true, 다르면 false
		System.out.printf("%s == %s => %b\n", s1, s2, b);
	}
}
