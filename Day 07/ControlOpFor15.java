package days07;

public class ControlOpFor15 {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1; i <= 10; i++) {
			for(int k = 1; k < i; k++) {
				System.out.print(" ");
			}
			for(int j = 10; j >= i; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 9; j >= i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k < i*2; k++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
