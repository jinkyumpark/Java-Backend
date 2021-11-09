package days17;

public class WrapperClass {
	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(200);
		
		// Compare classes
		if(i1 == i1)
			System.out.println("i1 and i2 are the same");
		else
			System.out.println("i1 and i2 are different");
		
		// Compare value saved in the instance
		if(i1.equals(i2))
			System.out.println("i1 and i2 are the same(equals)");
		else
			System.out.println("i1 and i2 are different");
		
		// Compare value saved in the instance (-, 0, +)
		System.out.println("i1.compareTo(i2)=" + i1.compareTo(i2));
		
		// Object overriding parent class method
		System.out.println("i1.toString() = " + i1.toString());
		
		System.out.println("MAX_VALUE = " + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE = " + Integer.MIN_VALUE);
		System.out.println("SIZE = " + Integer.SIZE);
		System.out.println("BYTES = " + Integer.BYTES);
		System.out.println("TYPE = " + Integer.TYPE);
		
		
	}
}
