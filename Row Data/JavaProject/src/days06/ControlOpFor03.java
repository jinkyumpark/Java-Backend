package days06;

public class ControlOpFor03 {
	public static void main(String[] args) {
		// 1부터 10까지의 합
		int sum = 0;
		for(int i =0; i <= 10; i++) {
			sum += i;
		}
		System.out.print("Addition Result: (1-100)" + sum);
		
		for(int i = 1; i <= 100000; i++) {
			sum += i;
			System.out.println(i + " Sum: " + sum);
		}
	}
}
