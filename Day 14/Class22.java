package days14;

// static variables, static methods, instance variables, instance methods

public class Class22 {
	public static void main(String[] args) {
		Mymath mm = new Mymath();
		mm.init(200, 100);
		System.out.println(mm.add());
		System.out.println(mm.substract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}
}

class Mymath {
	int a, b;
	static int c = 0;
	Mymath() {
		c++;
	}
	
	public void init(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int add() { return a+b;}
	int substract() { return a-b;}
	int multiply() { return a*b;}
	double divide() { return a/(double)b;}
} 