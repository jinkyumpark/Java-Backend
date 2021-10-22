package days05;
import java.util.Scanner;

public class ControlOpIf09 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String user;
		String com;
		
		user = stdIn.nextLine();
		com = stdIn.nextLine();
		
		stdIn.close();
		
		if(user.equals("R") && com.equals("S")) {
			System.out.print("You've won");
		} else if(user.equals("P") && com.equals("R")) {
			System.out.print("You've won");
		} else if(user.equals("S") && com.equals("P")) {
			System.out.print("You've won");
		} else if(user.equals(com)) {
			System.out.print("You've drew");
		} else {
			System.out.print("You've lost");
		}
	}
}
