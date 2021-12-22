package days12;

public class Class13 {
	public static void main(String[] args) {
		Sum s = new Sum(25, 36);
		System.out.println("s.add()의 결과 : " + s.add());
		System.out.println("s.add(23)의 결과 : " + s.add(23));
		System.out.println("s.add(59, 65)의 결과 : " + s.add(59, 65));
	}
}

class Sum {
	private int a;
	private int b;
	Sum(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int add() {
		return a + b;
	}
	
	public int add(int... nums) {
		int sum = a + b;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}
}