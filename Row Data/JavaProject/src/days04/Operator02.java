package days04;

public class Operator02 {
	public static void main(String[] args) {
		int n = 50;
		// 피연산자로 쓰인 변수와 연산으 결과를 저장할 변수가 같은 연산
		n = n + 10;
		// 1. 현재 n값과 두 번째 피연산자인 10이 CPU로 전달되어 덧셈됩니다.
		// 2. 연산결과가 돌아와서 다시 n 변수에 저장됩니다.
		// 연산에 참여했던 n값 50은 사라지고, 연산의 결과인 60이 n 변수에 남습니다.
		
		n += 10;
		System.out.printf("n = n + 10 -> n : %d\n", n);
		n -= 10;
		System.out.printf("n = n - 10 -> n : %d\n", n);
		n *= 10;
		double d = n;
		System.out.printf("n = n * 10 -> n : %d\n", n);
		d /= 10.0;
		System.out.printf("n = n / 10 -> n : %f\n", d);
		n %= 10;
		System.out.printf("n = n % 10 -> n : %f\n", n);
		

		// ++ -- 가 단독으로 있을때는 차이 없음
		// ++ -- 가 다른 연산과 섞여 있을때는 차이 남
		n = 10;
		System.out.println("current n value: " + n);
		// 뒤쪽 : 현재값으로 속해있는 연산 참여 후, 1 증가
		int k = n++;
		System.out.println("k: " + k); // 10
		System.out.println("n: " + n); // 11
		// 앞쪽 : 1 증가 후 다른 연산에 참여
		n = 10;
		int j = ++n;
		System.out.println("k: " + j); // 11
		System.out.println("n: " + n); // 11
		
	}
}
