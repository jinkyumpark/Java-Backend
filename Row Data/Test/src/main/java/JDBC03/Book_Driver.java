package JDBC03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.util.ArrayList;

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
				select(sc, bdao);
				break;
			case "2":
				insert(sc, bdao);
				break;
			case "3":
				update(sc, bdao);
				break;
			case "4":
				delete(sc, bdao);
				break;
			default:
				System.out.println("메뉴 선택이 잘못되었습니다.");
			}
			

		}
		System.out.print("프로그램이 종료되었습니다.");
	} 
	
	private static void select(Scanner sc, Book_Dao bdao) {
		System.out.println("도서번호\t출판년도\t입고가격\t출고가격\t등급\t제목");
		System.out.println("----------------------------------------------------------------------");
		
		ArrayList<Book_Dto> BookDto_list = bdao.select();
		for(Book_Dto bdto : BookDto_list) {
			System.out.printf("%d\t%d\t%d\t%d\t%s\t%s\n", bdto.getNum(), bdto.getMakeyear(), bdto.getInprice(),
					bdto.getRentprice(), bdto.getGrade(), bdto.getSubject());
		}
	}
	
	private static void insert(Scanner sc, Book_Dao bdao) {
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
	}
	
	private static void update(Scanner sc, Book_Dao bdao) {
		// 수정할 도서 번호
		int num = 0;
		while(true) {
			System.out.print("수정할 도서번호를 입력(필수): ");
			String input = sc.nextLine();
			if(input.equals("")) {
				System.out.println("도서번호 입력은 필수");
			} else {
				num = Integer.parseInt(input);
				break;
			}
		}
		
		// 도서번호로 조회해서 Book_Dto에 저장
		Book_Dto bdto = bdao.getBook(num);
		
		if(bdto == null) {
			System.out.println("입력한 도서번호로 조회된 도서 없음");
			return;
		}
		// 수정할 사항 입력, 수정하지 않을 항목은 엔터만 입력받아 패스
		// 수정할 사항은 저장해둔 Book_Dto에 업데이트

		System.out.print("수정할 도서의 제목 입력: ");
		String subject = sc.nextLine();
		if(!subject.equals("")) bdto.setSubject(subject);
		
		System.out.print("수정할 도서의 출판년도 입력: ");
		String makeyear = sc.nextLine();
		if(!makeyear.equals("")) bdto.setMakeyear(Integer.parseInt(makeyear));
		
		System.out.print("수정할 도서의 입고가격 입력: ");
		String inprice = sc.nextLine();
		if(!inprice.equals("")) bdto.setInprice(Integer.parseInt(inprice));
		
		System.out.print("수정할 도서의 출고가격 입력: ");
		String rentprice = sc.nextLine();
		if(!rentprice.equals("")) bdto.setRentprice(Integer.parseInt(rentprice));
		
		System.out.print("수정할 도서의 등급을 입력: ");
		String grade = sc.nextLine();
		if(!grade.equals("")) bdto.setGrade(grade);
		
		// Dao에 Book_Dto를 보내서 해달 레코드 수정
		int result = bdao.update(bdto);
		if(result == 1) System.out.println("레코드 수정 성공");
		else System.out.println("레코드 수정 실패");
	}

	private static void delete(Scanner sc, Book_Dao bdao) {
		int num = 0;
		while(true) {
			System.out.print("삭제할 도서의 도서번호 입력: ");
			String input = sc.nextLine();
			if(input.equals("")) {
				System.out.print("도서번호 입력은 필수입니다.");
			} else {
				num = Integer.parseInt(input);
				break;
			}
			
		}
		int result = bdao.delete(num);
		if(result == 1) System.out.println("레코드 삭제 성공");
		else System.out.println("레코드 삭제 실패");

	}
}
