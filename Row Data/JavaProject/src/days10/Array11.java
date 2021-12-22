package days10;

public class Array11 {
	public static void main(String[] args) {
		int[][] arr;
		arr = new int[3][2];
		// HEAP 메모리에 생성
		
		int[] a1 = {1, 2, 3, 4, 5};
		for(int k : a1) {
			System.out.print(k + " ");
		}
		
		System.out.println();
		int[][] b = {{1, 2}, {3, 4}, {5, 6}};
		for(int k : b[1]) {
			System.out.print(k + " ");
		}
		
		System.out.println();
		
		int[][] a = new int[5][5];
		
		int k = 1;
		for(int i = 0; i <= 4; i++) {
			for(int j = 0; j <= 4; j++) {
				a[i][j] = k++;
			}
		}
		
		for(int i = 0; i <= 4; i++) {
			for(int j = 0; j <= 4; j++) {
				System.out.printf("%d\t", a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		int index = 0;
		for(int[] k1 : a) {
			for(int k2 : k1) {
				System.out.printf("%d\t", k2);
				index++;
				if(index % 5 == 0) {
					System.out.println();
				}
			}
		}
		
	}
}
