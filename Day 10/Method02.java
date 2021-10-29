package days10;

public class Method02 {
	// 매개변수
	// 메서드 호출시 메서드가 필요로하는 데이터를 전달해 줄 수 있는 매개역할의 변수
	// 메서드 호출시 괄호안에 넣어주는 데이터 : 전달인수
	// 메서드의 몸체에서 괄호안에 위치하면 전달된 값을 받아주는 변수 : 매개변수
	
	public static void main(String[] args) {
//		System.out.println(args[0]);
		myPrint(100);
		myPrintWith2Int(100, 200);
	}
	
	public static void myPrint(int n) {
		System.out.printf("n -> %d\n", n);
	}
	public static void myPrintWith2Int(int n1, int n2) {
		System.out.printf("n1 -> %d, n2 -> %d\n", n1, n2);
	}
	// public : 공용이라는 의미로 누구나 사용할 수 있는 메서드 앞에 표기
	// static : 정적(처음부터 만들어지는) 이라는 의미로 추후 객체지향 프로그래밍의 단원에서 자세히 공부
	// void : 리턴값이 없다는 의미이며, 메서드 관련 다음 예제에서 자세히 공부
}
