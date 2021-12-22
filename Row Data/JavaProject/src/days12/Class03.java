package days12;

public class Class03 {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		a1.name = "Doggy";
		a1.output();
	}
}

class Animal {
	String name;
	int age;
	
	// 현재 프로그램(package 내 같은 파일)에서만 사용한다는 가정하에 public도 생략 가능
	public void output() {
		System.out.printf("My name is %s, and I'm %d\n", name, age);
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	// 맴버매소드는 클래스형으로 생성된 객체 전용 매서드입니다
	// 매소드의 실행이 객체전용으로만 사용이 된다는 뜻입니다
	// 맴버 매소드의 내용을 객체와 상관없는 명령이 들어갈 수도 있지만 보통은 맴버변수들의 조작, 출력, 입력을 위한 명령으로 구성
}
