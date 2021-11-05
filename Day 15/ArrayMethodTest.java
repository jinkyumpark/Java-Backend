package days15;

public class ArrayMethodTest {
	public static void main(String[] args) {
		int[][] a = new int[9][];
		input(a);
		prn(a);
	}
	
	public static void input(int[][] a) {
		int index = 1;
		int num = 1;
		for(int i = 0; i < a.length; i++) {
			a[i] = new int[index];
			for(int j = 0; j < index; j++) {
				a[i][j] = num;
				num++;
			}
			if(num < 15) {
				index++;
			} else {
				index--;
			}
		}
	}
	
	public static void prn(int[][] a) {
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.printf("%d\t", a[i][j]);
			}
			System.out.println();
		}
	}
}
