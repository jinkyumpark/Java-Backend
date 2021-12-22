package JDBC05;

import java.util.ArrayList;
import java.util.Scanner;

public class RentDriver {
	public static void main(String[] args) {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("---메뉴 선택---");
			System.out.println("1. 데이터열람  2. 데이터추가 3. 데이터수정 4. 데이터삭제 5. 프로그램종료");
			System.out.print(">> 메뉴선택 : ");
			
			String choice = sc.nextLine();
			if(choice.equals("5")) {
				System.out.println("프로그램을 종료합니다...");
				break;
			}
			
			switch(choice) {
			case "1":
				select();
				break;
			case "2":
				insert();
				break;
			case "3":
				
				break;
			case "4":
				delete();
				break;
			default:
				System.out.println("메뉴 선택이 잘못됨");	
			}
		}
	}
	
	private static void select() {
		Scanner sc = new Scanner(System.in);
		RentDao rdao = RentDao.getInstance();
		ArrayList<RentDto> list = rdao.select();
		
		System.out.println("날짜\t\t순번\t도서번호\t회원번호\t할인금액");
		System.out.println("-----------------------------------------------------------");
		for(RentDto dto : list) {
			System.out.printf("%s\t%d\t%s\t%s\t%d\n", 
					dto.getRentdate(), dto.getNum(), dto.getBooknum(), dto.getMembernum(), dto.getDiscount()
					);
		}
	}
	
	private static void insert() {
		Scanner sc = new Scanner(System.in);
		RentDao rdao = RentDao.getInstance();
		RentDto rdto = new RentDto();
		
		System.out.print("대여도서의 번호를 입력: ");
		int booknum;
		while(true) {
			booknum = Integer.parseInt(sc.nextLine());
			boolean state = rdao.checkBooknum(booknum);
			if(state) break;
			else System.out.print("입력한 도서번호의 도서 존재하지 않음. 다시 입력: ");
		}
		rdto.setBooknum(booknum);
		
		int membernum = 0;
		System.out.print("회원번호를 입력하세요: ");
		while(true) {
			membernum = Integer.parseInt(sc.nextLine());
			boolean state = rdao.checkMembernum(membernum);
			if(state) break;
			else System.out.print("입력한 회원이 존재하지 않음. 다시 입력: ");
		}
		rdto.setMembernum(membernum);
		
		System.out.print("할인금액 입력: ");
		String input = sc.nextLine();
		int discount = 0;
		if(!input.equals("")) discount = Integer.parseInt(input);
		rdto.setDiscount(discount);
		
		int result = rdao.insert(rdto);
		if(result == 1) System.out.println("레코드 추가 성공");
		else System.out.println("레코드 추가 실패");
	}

	private static void update() {
		Scanner sc = new Scanner(System.in);
		RentDao rdao = RentDao.getInstance();
		RentDto rdto = new RentDto();
		
		System.out.print("수정할 대여건의 number입력: ");
		String input;
		while(true) {
			input = sc.nextLine();
			if(input.equals("")) System.out.println("number 입력은 필수");
			else break;
		}
		int num = Integer.parseInt(input);
		rdto = rdao.getRent(num);
		if(rdto == null) {
			System.out.print("입력한 number의 대여건이 없음");
			return;
		} 
		
		// 수정할 내용 입력
		// String rentdate, int num, int booknum, int membernum, int discount
		System.out.print("변경할 날짜 입력: ");
		String rentdate = sc.nextLine();
		if(!rentdate.equals("")) rdto.setRentdate(rentdate);
		System.out.print("변경할 순번 입력: ");
		String rentnum = sc.nextLine();
		if(!rentnum.equals("")) ;
		System.out.print("변경할 도서번호 입력: ");
		
		System.out.print("변경할 회원번호 입력: ");
		
		System.out.print("변경할 할인금액 입력: ");
	}

	private static void delete() {
		Scanner sc = new Scanner(System.in);
		System.out.print("지울 번호 입력: ");
		String num = sc.nextLine();
		
		RentDao rdao = RentDao.getInstance();
		
		int result = rdao.delete(Integer.parseInt(num));
		
		if(result == 1) System.out.println("지우기 성공");
		else System.out.println("지우기 실패");
	}
} 
