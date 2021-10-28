package days09;
import java.util.Random;
import java.util.Scanner;

public class Array09 {
	public static void main(String[] args) {
		// 야구 게임
		// 상대방이 나에게 알려주지 않은 숫자를 질문과 답변을 통해 맞추는 게임
		// 자리수까지 같으면 S, 숫자만 같으면 B
		// 0~9 중복 숫자 없음
		
		Random rd = new Random();
		
		int[] computerNum = new int[3];
		int[] userNum = new int[3];
		
		// Initialize computerNum
		for(int i = 0; i < computerNum.length; i++) {
				int randomNum = rd.nextInt();
				if(randomNum < 0) randomNum *= -1;
				randomNum %= 10;
				computerNum[i] = randomNum;
				
				for(int j = 0; j < i; j++) {
					if(computerNum[i] == computerNum[j])
						i--;
				}
		}

//		System.out.printf("Computer : %d, %d, %d\n", computerNum[0], computerNum[1], computerNum[2]);
		
		boolean userGuessed = false;
		Scanner sc = new Scanner(System.in);
		
		while(!userGuessed) {
			// Get user Input
			System.out.print("Enter 3 Integers : ");
			String num = sc.nextLine();
			userNum[0] = num.charAt(0) - '0';
			userNum[1] = num.charAt(1) - '0';
			userNum[2] = num.charAt(2) - '0';
			
//			System.out.printf("User : %d, %d, %d\n", userNum[0], userNum[1], userNum[2]);
			
			// Check S or B or nothing
			int s =0, b = 0;
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(computerNum[i] == userNum[j]) {
						if(i == j) {
							s++;
						} else {
							b++;
						}
					}
				}
			}
			
			System.out.printf("B : %d, S : %d\n", b, s);
			
			if(s == 3) {
				userGuessed = true;
			}
		}
		
		System.out.println("You've Guessed it!");
	}
}
