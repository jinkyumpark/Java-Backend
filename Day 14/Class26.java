package days14;

// 싱글턴 패턴
// 특정 클래스의 인스턴스를 반드시 한 개만 생성할 수 있도록 강제하는 패턴
// 맴버필드값이 객체들간 스태틱 변수가 아니면서 일관된 값을 가져야 하고, 객체도 둘 이상 더 만들 필요가 없다면,
// 하나의 인스턴스를 여러 레퍼런스 변수가 공유하여 사용하도록 제어하는 싱글턴 패턴이 사용됨

public class Class26 {
	public static void main(String[] args) {
		// Not a singleton
//		SingletonEx s1 = new SingletonEx();
//		SingletonEx s2 = new SingletonEx();
		
		// Singlelton, but not preferred
//		SingletonEx s3 = new SingletonEx();
//		SingletonEx s4 = s3;
		
		SingletonEx s1 = SingletonEx.getInstance();
		SingletonEx s2 = SingletonEx.getInstance();
		SingletonEx s3 = SingletonEx.getInstance();		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		MultitonEx m1 = new MultitonEx();
		MultitonEx m2 = new MultitonEx();
		System.out.println(m1);
		System.out.println(m2);
	}
}

class MultitonEx {
	
}

class SingletonEx {
	int n1;
	int n2;
	
	private SingletonEx() {}
	
	private static SingletonEx itc = new SingletonEx();
	
	public static SingletonEx getInstance() {
		return itc;
	}
}