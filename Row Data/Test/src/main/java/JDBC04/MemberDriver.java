package JDBC04;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.ArrayList;

public class MemberDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n---메뉴 선택---");
			System.out.print("1. 데이터열람 2. 데이터추가 3. 데이터수정 4. 데이터삭제 5. 프로그램종료 >> 메뉴선택 : ");
			
			String choice = sc.nextLine();
			if(choice.equals("5")) break;
			
			
			switch(choice) {	
			case "1":
				select(sc);
				break;
			case "2":
				insert(sc);
				break; 
			case "3":
				update(sc);
				break;
			case "4":
				delete(sc);
				break;
			default:
				System.out.println("메뉴 선택이 잘못되었습니다");
			}
		}
	}
	
	// int membernum, String name, String phone, Date birth, int bpoint, Date joinDate
	public static void select(Scanner sc) {
		
		System.out.printf("번호\t이름\t전화번호\t\t날짜\t\t포인트\t가입날짜\t\t성별\t나이\n");
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		list = MemberDao.getInstance().select();
		for(MemberDto mdto : list) {
			System.out.printf("%d\t%s\t%s\t%s\t%d\t%s\t%s\t%d\n", 
					mdto.getMembernum(), mdto.getName(), mdto.getPhone(), 
					mdto.getBirth(), mdto.getBpoint(), mdto.getJoinDate(),
					mdto.getGender(), mdto.getAge()
					);
		}
	}
	
	public static void insert(Scanner sc) {
		MemberDto mdto = new MemberDto();
		System.out.println("정보를 입력하세요(모두 입력해야 함)");
		System.out.print("이름 입력: ");
		String name = sc.nextLine();
		System.out.print("전화번호 입력: ");
		String phone = sc.nextLine();
		// java.util.Date -> java.sql.Date() 변환 해야 함
		System.out.print("생일 입력(YYYY-MM-DD): ");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date d = null;
		while(true) {
			try {
				d = sdf.parse(sc.nextLine());
				break;
			} catch(ParseException e) {
				System.out.print("날짜를 입력 예에 맞춰 다시 입력(2015-12-31)");
			}
		}
		java.sql.Date birth = new java.sql.Date(d.getTime());
		
		System.out.print("성별 입력(M/F)");
		String gender = sc.nextLine();
		
		System.out.print("나이를 입력: ");
		String age = sc.nextLine();
		
		mdto.setBirth(birth);
		mdto.setName(name);
		mdto.setPhone(phone);
		try {
			mdto.setJoinDate(new java.sql.Date(sdf.parse("2021-12-21").getTime()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mdto.setGender(gender);
		mdto.setAge(Integer.parseInt(age));
		
		int result = MemberDao.getInstance().insert(mdto);
		
		if(result == 1) System.out.println("성공적으로 추가");
		else System.out.println("추가 실패");
	}
	
	public static void update(Scanner sc) {
		String num;
		while(true) {
			System.out.print("수정할 번호를 입력하세요");
			num = sc.nextLine();
			if(!num.equals("")) break;
			else System.out.println("번호는 반드시 입력해야 함");
		}
		
		System.out.print("수정할 이름: ");
		String name = sc.nextLine();
		System.out.print("수정할 전화번호: ");
		String phone = sc.nextLine();
		System.out.print("수정할 생일: ");
		String birth = sc.nextLine();
		System.out.print("수정할 성별: ");
		String gender = sc.nextLine();
		System.out.print("수정할 나이: ");
		String age = sc.nextLine();
		
		MemberDto mdto = new MemberDto();
		
		if(!name.equals("")) mdto.setName(name);
		if(!phone.equals("")) mdto.setPhone(phone);
//		if(!birth.equals("")) mdto.setBirth(birth);
		if(!gender.equals("")) mdto.setGender(gender);
		if(!age.equals("")) mdto.setAge(Integer.parseInt(age));
		mdto.setMembernum(Integer.parseInt(num));
		
		int result = MemberDao.getInstance().update(mdto);
		
		if(result == 1) System.out.println("성공적으로 업데이트 됨");
		else System.out.println("업데이트 실패!");
	}
	
	public static void delete(Scanner sc) {
		System.out.print("지우고 싶은 맴버의 번호 입력: ");
		String num = sc.nextLine();
		
		int result = MemberDao.getInstance().delete(Integer.parseInt(num));
		
		if(result == 1) System.out.println("성공적으로 지워짐");
		else System.out.println("지우기 실패...");
		
	}
}
