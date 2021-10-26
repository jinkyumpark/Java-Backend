package days07;

public class ControlOpFor16 {
	public static void main(String[] args) {
		// 1부터 100 사이의 소수를 출력해주세요
		// 소수 : 1과 자기자신의 숫자로만 나누어 떨어지는 수
		
		for(int i = 2; i <= 100; i++) {
			int index = 0;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) 
					index++;
			}
			if(index == 0) {
				System.out.printf("%d ", i);
			}
		}
	}
}