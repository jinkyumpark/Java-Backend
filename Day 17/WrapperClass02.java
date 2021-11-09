package days17;
import java.math.BigInteger;

public class WrapperClass02 {
	public static void main(String[] args) {
		BigInteger fact = BigInteger.ONE;
		System.out.println(fact);
		BigInteger k = BigInteger.ONE;
		System.out.println(k);
		k = k.add(fact);
		System.out.println(k);
		
		for(k = BigInteger.ONE; k.compareTo(BigInteger.valueOf(100)) <= 0; k = k.add(BigInteger.ONE)) {
			fact = fact.multiply(k);
		}
		
		System.out.println(fact);
	}
}
