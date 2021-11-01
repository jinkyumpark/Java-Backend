package days11;

public class Method14 {
	public static void main(String[] args) {
		// 전달 인수의 개수가 일정치 않아서 오버로딩 할 수 없을때
		int c;
	}
	
	public static int max(int... a) {
		int max = a[0];
		
		for(int i = 1; i < a.length; i++) {
			if(max < a[i]) max = a[i];
		}
		
		return max;
	}
}
