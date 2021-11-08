package days16;

public class StringClass01 {
	public static void main(String[] args) {
		String s = "Hello";
		
		System.out.println("0." + s);
		
		char[] c = {'H', 'e', 'l', 'l', 'o'};
		String s2 = new String(c);
		System.out.println("2. " + s2);
	}
}
