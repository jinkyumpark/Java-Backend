package days08;
import java.util.Random;
import java.util.Scanner;

public class ControlOpWhile06 {
	public static void main(String[] args) {
		// 가위 바위 보
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		boolean userLost = true;
		
		while(userLost) {
			System.out.print("Enter your choice(1 - Rock, 2 - Scissor, 3 - Paper) : ");
			int user = sc.nextInt();
			int computer = rd.nextInt() % 4;
			if(computer < 0) computer *= -1;
			
			System.out.println("Computer is " + (computer == 1 ? "Rock":computer == 2 ? "Scissor":"Paper"));
			
			// Case of user winning
			if(user == 1 && computer == 2 || user == 2 && computer == 3 || user == 3 && computer == 1) {
				System.out.println("You've won");
				userLost = false;
			} else if(user == computer) {
				System.out.println("You've drawn");
			} else {
				System.out.println("You've lost");
			}
		}
	}
}
