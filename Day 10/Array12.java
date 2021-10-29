package days10;

public class Array12 {
	public static void main(String[] args) {
		// 2차원 배열은 각행에 속한 열의 요소가 서로 다를 수도 있음
		int[][] a;
		
		// 각 1차원 배열들의 주소를 저장할 참조변수들의 배열을 만들어 주소 전달
		// 실제 데이터 저장 배열들은 아직 생선 전
		a = new int[3][];
		
		// 3개의 참조 변수에 세개의 1차원 
		a[0] = new int[3];
		a[1] = new int[5];
		a[2] = new int[2];
	}
}
