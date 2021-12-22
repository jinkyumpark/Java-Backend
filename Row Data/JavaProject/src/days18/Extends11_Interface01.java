package days18;

public class Extends11_Interface01 {
	public static void main(String[] args) {
		InterA a = new SubA();
		a.test();
	}
}

interface InterA {
	int n1 = 10;
	
	public static final int num = 10;
	public abstract void test();
}

class SubA implements InterA {
	@Override
	public void test() {
		System.out.println("Execute SubA class test method");
	}
}