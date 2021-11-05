package days15;

public class Extends05 {
	public static void main(String[] args) {
		SubC c = new SubC();
	}
}

class SuperC {
	public SuperC() {
		
	}
	
	public SuperC(int num) {
		
	}
}

class SubC extends SuperC {
	public SubC() {
		super();
	}
	
	public SubC(int n) {
		super(10);
	}
}
