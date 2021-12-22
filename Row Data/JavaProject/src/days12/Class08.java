package days12;

public class Class08 {
	public static void main(String[] args) {
		AClass a = new AClass(20);
	}
}

class AClass {
	private int age;
	
	AClass(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int a) {
		age = a;
	}
}

// 생성자(Constructor)
// 클래스의 객체가 생성될 때, 맴버필드의 초기화를 위해서 사용되는 매소드
// 각각의 객체가 생성될 때, 서로 다른 메모리를 가지는 객체를 생성할 수 있게 합니다

// 생성자의 특징
// 1. 매서드임(단, 처음 객체 생성시에만 호출, 중간에 호출되지 않음)
// 2. 클래스의 이름과 동일한 이름을 가짐
// 3. 리던값이 없음
// 4. 따로 정의하지 않아도 이미 클래스 내부에 존재함
// 5. 생성자는 각각의 객체가 생설될 때 마다 호출되는 매서드
// 6. 주로 하는 일은 new와 함께 객체가 저장될 Heap 메모리를 할당하고 그 안에 맴버변수를 만듦