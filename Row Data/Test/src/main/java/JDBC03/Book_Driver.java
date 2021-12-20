package JDBC03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Book_Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("--- 메뉴 선택 ---");
			System.out.print("1-데이터열람 2-데이터추가 3-데이터수정 4-데이터삭제 5-프로그램종료\n");
			System.out.print("메뉴 선택 : ");
			String choice = sc.nextLine();
			
			if(choice.equals("5")) break;
			Book_Dao bdao = new Book_Dao();

			switch(choice) {
			case "1":
				bdao.select();
				break;
			case "2":
				System.out.print("제목을 입력하세요: ");
				String subject = sc.nextLine();
				System.out.print("출판연도 입력: ");
				String makeyear = sc.nextLine();
				System.out.print("입고가격 입력: ");
				String inprice = sc.nextLine();
				System.out.print("출고가격 입력: ");
				String rentprice = sc.nextLine();
				System.out.print("등급 입력: ");
				String grade = sc.nextLine();
				Book_Dto bdto = new Book_Dto(subject, Integer.parseInt(makeyear), 
						Integer.parseInt(inprice), Integer.parseInt(rentprice), grade);
				bdao.insert(bdto);
				break;
			case "3":
				bdao.update();
				break;
			case "4":
				bdao.delete();
				break;
			default:
				System.out.println("메뉴 선택이 잘못되었습니다.");
			}
			
			
		}
		System.out.print("프로그램이 종료되었습니다.");
		
	} 
}
