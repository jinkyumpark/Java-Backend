package days12;

public class Class11 {
	public static void main(String[] args) {
		DClass d1 = new DClass();
		DClass d2 = new DClass(10);
		DClass d3 = new DClass(10.23);
	}
}

class DClass {	
	public DClass() {
		System.out.println("Default Constructor");
	}
	
	public DClass(int num) {
		System.out.println("Constructor with Int as a parameter : " + num);
	}
	
	public DClass(double num) {
		System.out.println("Constructor with Double as a paramater : " + num);
	}
}
