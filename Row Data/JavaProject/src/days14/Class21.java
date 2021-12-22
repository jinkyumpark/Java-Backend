package days14;

public class Class21 {
	public static void main(String[] args) {
		double a = 10.25;
		double b = Math.random();
		
		System.out.printf("a = %f\nabs(a) = %f\nsqrt(a) = %f\nRandom = %f\n", a, Math.abs(a), Math.sqrt(a), b);
	
		String strNum1 = "123";
		String strNum2 = "56";
		System.out.println(Integer.parseInt(strNum1) + Integer.parseInt(strNum1));
		
		int intNum1 = 123;
		int intNum2 = 456;
		System.out.println(String.valueOf(intNum1) + String.valueOf(intNum2));
	}
	
	public static void abc() {
		abc();
	}	
}
