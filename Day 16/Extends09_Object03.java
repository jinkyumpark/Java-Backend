package days16;

public class Extends09_Object03 {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		if(s1 == s2) System.out.println("s1 and s2 are equal");
		else System.out.println("s3 and s4 are different");
		
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		if(s3 == s4) System.out.println("s3 and s4 are equal");
		else System.out.println("s3 and s4 are different");
		
		if(s3.equals(s4)) System.out.println("s3 and s4 are eqal (.eqals)");
		else System.out.println("s3 and s4 are different (.equals)");
		
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);
		
		if(p1.equals(p2))
			System.out.println("p1 and p2 are equal (.eqals)");
		else
			System.out.println("p1 and p2 are different (.equals)");
	}
}
