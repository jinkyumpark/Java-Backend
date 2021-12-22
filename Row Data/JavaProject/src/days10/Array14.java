package days10;

public class Array14 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b;
		
//		b = a;
//		for(int k : a) System.out.printf("%d ", k);
//		System.out.println();
//		for(int k : b) System.out.printf("%d ", k);
//		System.out.println();
//		
//		a[2] = 100;
//		
//		for(int k : a) System.out.printf("%d ", k);
//		System.out.println();
//		for(int k : b) System.out.printf("%d ", k);
//		System.out.println();
		
		// 레퍼런스 변수간의 값의 복사로는 배열의 복사까지는 이루어지지 않습니다
		// 위의 동작 b=a 는 a가 갖고 있는 참고값을 b 변수에 복사한 것이므로
		// 배열 공간은 하나, 그 배열 주소를 저장한 변수는 두개로 설정한 것과 같습니다
		// 따라서 a[2] 값 변경은 b[2] 값 변경과 같습니다
		
		// 방법 1
		b = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		
		for(int k : a) System.out.printf("%d ", k);
		System.out.println();
		for(int k : b) System.out.printf("%d ", k);
		System.out.println();
		
		b[3] = 200;
		
		for(int k : a) System.out.printf("%d ", k);
		System.out.println();
		for(int k : b) System.out.printf("%d ", k);
		System.out.println();
		
		// 방법 2
		int[] c = a.clone();
		a[1] = 200;
		for(int k : a) System.out.printf("%d ", k);
		System.out.println();
		for(int k : c) System.out.printf("%d " , k);
		System.out.println("\n\n");
		
		
		// 2차원 배열 복사
		int[][] d = {{1, 2, 3}, {4, 5, 6}};
		int[][] e = d.clone();
		d[1][2] = 500;
		for(int i = 0; i < e.length; i++) {
			for(int j = 0; j < e[i].length; j++) {
				System.out.printf("%d ", e[i][j]);
			 }
			System.out.println("");
		}
		// 2차원 배열은 새로 공간 생성후 각각의 값을 다시 복사해야 완벽한 복사가 됨
		
		System.out.println();
		
		for(int i = 0; i < d.length; i++) {
			for(int j = 0; j < d[i].length; j++) {
				e[i][j] = d[i][j];
			}
		}
		
		d[0][0] = 314;
		
		for(int i = 0; i < e.length; i++) {
			for(int j = 0; j < e[i].length; j++) {
				System.out.printf("%d ", e[i][j]);
			}
			System.out.println();
		}
		
		
	}
 }
