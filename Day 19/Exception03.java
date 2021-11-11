package days19;

public class Exception03 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Exception Message : " + e.getMessage());
		} catch(Exception e) {
			System.out.println("Unknown Exception");
		}
		System.out.println(5);
	}
}
