package days15;

public class Extends08_TypeCasting02 {
	public static void main(String[] args) {
		SuperF super1 = new SuperF();
		SubF sub1 = new SubF();
		
		// 1. 자식 클래스의 인스턴스 주소값을 부모클래스의 래퍼런스 변수에 저장이 가능 
		super1 = sub1;
		super1 = new SubF();
		
		// 2. 부모 클래스의 인스턴스 주소값을 자식클래스의 레퍼런스 변수에 저장하는 것은 불가능
//		sub1 = super1;
//		sub1 = new SuperF();
		
		// 3. 부모 클래스의 인스턴스 주소값을 자식 클래스의 레퍼런스 변수에 그래도 저장하고 싶다면, 강제캐스팅 연산을 사용 저장은 가능
		SuperF super3 = new SuperF();
//		SubF sub3 = (SubF) super3; // 런타임 에러
		
		SuperF super5 = new SubF();
		if(super5 instanceof SubF) {
			SubF sub5 = (SubF) super5;
		}
	}
}

class SuperF {
	int superNum;
}

class SubF extends SuperF {
	int subNum;
}