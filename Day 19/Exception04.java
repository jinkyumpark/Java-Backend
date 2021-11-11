package days19;

import java.text.ParseException;

public class Exception04 {
	public static void main(String[] args) {
		try {
			ArithmeticException a = new ArithmeticException();
		} catch(ArithmeticException e) {
			System.out.printf("ArithmeticException - ");
			System.out.println("Error Message : " + e.getMessage());
		} catch(RuntimeException e) {
			System.out.printf("RuntimeException - ");
			System.out.println("Error Message : " + e.getMessage());
		} catch(Exception e) {
			System.out.print("Exception - ");
			System.out.println("Error Message : " + e.getMessage());
		}
		
		try {
			ParseException a = new ParseException("ParseException deliverately", 0);
			throw a;
		} catch(ArithmeticException e) {
			System.out.printf("ArithmeticException - ");
			System.out.println("Error Message : " + e.getMessage());
		} catch(RuntimeException e) {
			System.out.printf("RuntimeException - ");
			System.out.println("Error Message : " + e.getMessage());
		} catch(Exception e) {
			System.out.print("Exception - ");
			System.out.println("Error Message : " + e.getMessage());
		}
	}
}
