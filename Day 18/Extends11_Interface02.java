package days18;
public class Extends11_Interface02 {
	public static void main(String[] args) {
		
	}
}

// Property : public static final
// Method : public abstract

interface InterB {
	public static final int n1 = 1;
	public static final int n2 = 2;
	// You can omit public static final inside the interface
	int n3 = 3;
	
	public abstract void test1();
	public abstract void test2();
	// You can omit public abstract inside the inteface
	void test3();
}