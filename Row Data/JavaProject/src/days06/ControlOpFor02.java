package days06;

public class ControlOpFor02 {
	public static void main(String[] args) {
		int i;
		for(i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\n i = " + i);
		
		System.out.println("\nMethod 1 : Odd Number");
		for(i = 1; i <= 100; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\nMethod 2 : Odd Number");
		for(i = 1; i <= 100; i +=2) {
			System.out.print(i + " ");
		}
	}
}
