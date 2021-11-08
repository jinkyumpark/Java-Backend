package days16;

public class ArrayMethodTestSolved {
	public static void main(String[] args) {
		
	}
	
	public static void prn(int[][] a) {
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.printf("%d\t", a[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void input(int[][] a) {
		for(int i = 0; i <= 4; i++)
			a[i] = new int[i+1];
		for(int i = 5; i<= 8; i++)
			a[i] = new int[9-i];
		int k = 1;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				a[i][j] = k++;
			}
		}
	}
}
