package days10;

public class Method03 {
	public static void updateValue(int num) {
		num = 100;
		System.out.printf("updateValue num -> %d\n", num);
	}
	
	public static void main(String[] args) {
		int num = 10;
		System.out.printf("main num -> %d\n", num);
		updateValue(num);
		System.out.printf("main num -> %d\n", num);
	}
}
