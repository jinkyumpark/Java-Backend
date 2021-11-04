package days14;

public class Class23 {
	public static void main(String[] args) {
		
	}
}

class MemberCall {
	int iv = 10;
	
	static int sv = 20;
	
	static int sv2 = new MemberCall().iv;
	
	static void staticMethod() {
		System.out.println(sv);
		System.out.println(new MemberCall().iv);
	}
}