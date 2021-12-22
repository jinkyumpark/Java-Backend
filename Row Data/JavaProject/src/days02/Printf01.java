package days02;

public class Printf01 {
	public static void main(String[] args) {
		System.out.printf("56 x 69 = 1234\n");
		
		System.out.printf("56 x 69 = %d", 56*69);
		
		// +
		// -
		// x -> 실제는 *
		// ÷ -> 실제는 /
		
		System.out.printf("%.2f", 27/13.0);
		// 소수점 조절에 의해 자리수가 조절되고, 없어지는 곳은 반올림됩니다.
	
	
	}
}
