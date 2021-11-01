package days11;

public class Method13 {
	public static void main(String[] args) {
		// 매서드 오버로딩 : 매소드의 이름은 같고, 매개변수의 타입, 개수, 순서가 다르면 서로 다른 매소드로 인지하는 문법
		// 일관된 이름을 사용하여 사용자에게 직관적인 이름을 사용하게 함
		// 전달인수의 자료형, 순서 등이 서로 달라도 가능
		
		int max_result = max(10, 50);
		System.out.println(max_result);
	}
	
	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}
}
