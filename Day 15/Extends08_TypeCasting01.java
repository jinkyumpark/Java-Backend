package days15;

public class Extends08_TypeCasting01 {
	public static void main(String[] args) {
		short s = 10;
		int i = s;
		int j = 10;
		short k = (short)j;
		
		NormalA a1 = new NormalA();
		NormalB b2 = new NormalB();
	}
}

class NormalA {
	int num;
}

class NormalB {
	int num;
}
