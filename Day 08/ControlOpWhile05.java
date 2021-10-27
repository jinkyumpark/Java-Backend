package days08;
import java.util.Random;

public class ControlOpWhile05 {
	public static void main(String[] args) {
		Random rd = new Random();
		
		int num = rd.nextInt();
		if(num < 0) num *= -1;
		System.out.println(num % 10);
	}
}
