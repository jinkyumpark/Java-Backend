package days12;

public class Class15 {
	public static void main(String[] args) {
		ThisB b1 = new ThisB();
		ThisB b2 = new ThisB();
		
		b1.setNum(100);
		b2.setNum(200);
		
		b1.setNum(100);
		b2.setNum(200);
		b1.prn();
		b2.prn();
		
		ThisB b3 = b1;
		// 위 연산은 new를 이용하여 b3에 새로운 공간을 만든게 아니라, b1 위 레퍼런스 값만 복사 저장한 결과
		// b1, b3는 같은 공간의 주소를 저장하고 있음	
		b3.setNum(300);
		b1.prn();
		b3.prn();
		
		ThisB b4 = new ThisB();
		b4.copy(b2);
	}
}

class ThisB {
	private int num;
	public void setNum(int num) {
		this.num = num;
		// this 에는 현재 매서드를 호출한 객체의 참조변수값이 전달되어 저장됩니다
		// 매개변수로 선언된 num 변수는 현재 매서드안에서만 저장되는 지역 변수로만 사용되고 소멸합니다
		// 맴버 매서드에서는 맴버변수에 접근 권한이 있으므로, 참조변수 this와 맴버변수(.) 으로 연결되어 사용됩니다.
	}
	
	public void prn() {
		System.out.printf("num = %d\n", this.num);
	}
	
	public void copy(ThisB obj) {
		this.num = obj.num;
	}
	
	public ThisB copy2() {
		ThisB temp = new ThisB();
		temp.num = this.num;
		return temp;
	}
}

// this 변수 : 레퍼런스 변수
// 클래스의 맴버필드들은 new 라는 키워드에 의해서 각각의 개체별로 생성됨
// 반면, 맴버 메서드는 생선된(오버로딩 포함) 메서드별로 하나만 존재하며 모든 객체들이 공유하게 됨
// 이때 현재 메서드를 호풀한 객체가 어떤 객체인지 구분하여 실행될 수 있게 this 라는 숨겨진 참조변수를 제공