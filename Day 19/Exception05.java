package days19;

public class Exception05 {
	public static void main(String[] args) {
		try {
			method1();
		} catch(Exception e) {
			e.printStackTrace();		
		}
	}
	
	public static void method1() throws Exception {
		method2();
	}
	
	public static void method2() {
		
	}
}
