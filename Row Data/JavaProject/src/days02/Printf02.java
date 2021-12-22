package days02;

public class Printf02 {
	public static void main(String[] args) {
		// printf 안에서 %와 d, f, s 사이에 숫자 옵션을 넣어서 표시할 자리수를 조절합니다.
		
		// 정수의 자리수 조절 : 자리 수 쓰면 숫자만큼 확보, 자리 모자르면 자동 추가, 자리 남으면 공백
		System.out.printf("정수%d정수\n", 123);
		System.out.printf("정수%3d정수\n", 12345);
		System.out.printf("정수%10d정수\n", 12345);
		System.out.printf("정수%-10d정수\n", 12345);
		
		// 문자의 자리수 조절 : 정수와 동일
		System.out.printf("문자:%s꽃이 피었습니다\n", "무궁화");
		System.out.printf("문자:%2s꽃이 피었습니다\n", "무궁화");
		System.out.printf("문자:%10s꽃이 피었습니다\n", "무궁화");
		System.out.printf("문자:%-10s꽃이 피었습니다\n", "무궁화");
		
		// 실수의 자리수 조절 : 숫자 = 자리 할당, 소수점 = 표시될 자리(넘칠경우 자르고 남을 경우 0으로 채움)
		System.out.printf("실수%10.2f실수\n", 123.1234);
		System.out.printf("실수%10.4f실수\n", 123.12);
		System.out.printf("실수%3.1f실수\n", 123.12);
		System.out.printf("실수%-10.2f실수\n", 123.1234);
		
	}
}
