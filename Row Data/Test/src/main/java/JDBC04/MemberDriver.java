package JDBC04;

import java.util.Scanner;

public class MemberDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n---메뉴 선택---");
			System.out.print("1. 데이터열람 2. 데이터추가 3. 데이터수정 4. 데이터삭제 5. 프로그램종료 >> 메뉴선택 : ");
			
			String choice = sc.nextLine();
			if(choice.equals("5")) break;
			
			MemberDao bdao = new MemberDao();
			
			switch(choice) {
			case "1":
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				break;
			default:
				System.out.println("메뉴 선택이 잘못되었습니다");
			}
		}
	}
}
