package days10;

public class Method04 {
	// Call by Reference 방식의 매소드 호출
	
	public static void main(String[] args) {
		System.out.println("Program Starting...");
		int[] a = {111, 222, 333};
		System.out.println("\nPrint in main : ");
		for(int i = 0; i < a.length; i++) {
			System.out.printf("a[%d] = %d\t", i, a[i]);
		}
		
		updateValue(a);
		
		System.out.println("\nPrint in Main after updateValue : ");
		for(int i = 0; i < a.length; i++) {
			System.out.printf("a[%d] = %d\t", i, a[i]);
		}
	}
	
	public static void updateValue(int[] b) {
		b[0] = 100; b[1] = 200; b[2] = 300;
		System.out.println("\nPrint in updateValue : ");
		for(int i = 0; i < b.length; i++) {
			System.out.printf("b[%d] = %d\t", i, b[i]);
		}
	}
}
