package days24;

public class Test {
	public static void main(String[] args) {
		SubD sub = new SubD();
	}
}

class SuperD {
	SuperD() {
		this(1);
		System.out.println("SuperD()");
	}
	
	SuperD(int arg) {
		this(1.1);
		System.out.println("superD(int)");
	}
	
	SuperD(double arg) {
		this("");
		System.out.println("SuperD(double)");
	}
	
	SuperD(String arg) {
		System.out.println("SuperD(String)");
	}
}
class SubD {
	SubD() {
		this(1);
		System.out.println("SubD()");
	}
	
	SubD(int arg) {
		this(1.1);
		System.out.println("SubD(int)");
	}
	
	SubD(double arg) {
		this("");
		System.out.println("SubD(double)");
	}
	
	SubD(String arg) {
		System.out.println("SubD(String)");
	}
}

