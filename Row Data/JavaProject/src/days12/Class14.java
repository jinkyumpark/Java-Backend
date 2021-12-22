package days12;

public class Class14 {
	public static void main(String[] args) {
		ThisA t1 = new ThisA();
		t1.init(100);
		t1.prn();
	}
}

class ThisA {
	private int num;
	public void init(int num) {
		this.num = num;
		// 맴버변수와 지역변수(매개변수)가 부득이하게 이름이 같았을때, 그 둘을 구분하기 위해 맴버변수 앞에 this를 붙여서 사용
	}
	// this 키워드는 단지 생략됐을 뿐
	
	public void prn() {
		System.out.println("맴버변수 num의 값 : " + this.num);
	}
}