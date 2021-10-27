package days08;

public class test {

	public static void main(String[] args) {
		method1(100000);
		method2(100000);
	}
	
	public static void method1(int num) {
		int computationCount = 0;
		
		for(int i = 2; i <= num; i++) {
			
			int index = 0;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					index++;
					computationCount++;
				} else {
					computationCount++;
				}
			}
			if(index == 0) {
				System.out.printf("%d ", i);
				computationCount++;
			} else {
				computationCount++;
			}
		}
		System.out.println("\nMethod 1 : Computation Count: " + computationCount);
	}
	
	public static void method2(int num) {
		int computationCount = 0;
		
		for(int i = 2; i <= num; i++) {
			
			int index = 0;
			for(int j = 2; j < i/2; j++) {
				if(i % j == 0) {
					index++;
					computationCount++;
				} else {
					computationCount++;
				}
			}
			if(index == 0) {
				System.out.printf("%d ", i);
				computationCount++;
			} else {
				computationCount++;
			}
		}
		System.out.println("\nMethod 2 : Computation Count: " + computationCount);

	}
}
