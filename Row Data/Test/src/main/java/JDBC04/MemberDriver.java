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
			System.out.println("\n---�޴� ����---");
			System.out.print("1. �����Ϳ��� 2. �������߰� 3. �����ͼ��� 4. �����ͻ��� 5. ���α׷����� >> �޴����� : ");
			
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
				System.out.println("�޴� ������ �߸��Ǿ����ϴ�");
			}
		}
	}
	
	// int membernum, String name, String phone, Date birth, int bpoint, Date joinDate
	public static void select(Scanner sc) {
		
		System.out.printf("��ȣ\t�̸�\t��ȭ��ȣ\t\t��¥\t\t����Ʈ\t���Գ�¥\t\t����\t����\n");
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
		System.out.println("������ �Է��ϼ���(��� �Է��ؾ� ��)");
		System.out.print("�̸� �Է�: ");
		String name = sc.nextLine();
		System.out.print("��ȭ��ȣ �Է�: ");
		String phone = sc.nextLine();
		// java.util.Date -> java.sql.Date() ��ȯ �ؾ� ��
		System.out.print("���� �Է�(YYYY-MM-DD): ");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date d = null;
		while(true) {
			try {
				d = sdf.parse(sc.nextLine());
				break;
			} catch(ParseException e) {
				System.out.print("��¥�� �Է� ���� ���� �ٽ� �Է�(2015-12-31)");
			}
		}
		java.sql.Date birth = new java.sql.Date(d.getTime());
		
		System.out.print("���� �Է�(M/F)");
		String gender = sc.nextLine();
		
		System.out.print("���̸� �Է�: ");
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
		
		if(result == 1) System.out.println("���������� �߰�");
		else System.out.println("�߰� ����");
	}
	
	public static void update(Scanner sc) {
		String num;
		while(true) {
			System.out.print("������ ��ȣ�� �Է��ϼ���");
			num = sc.nextLine();
			if(!num.equals("")) break;
			else System.out.println("��ȣ�� �ݵ�� �Է��ؾ� ��");
		}
		
		System.out.print("������ �̸�: ");
		String name = sc.nextLine();
		System.out.print("������ ��ȭ��ȣ: ");
		String phone = sc.nextLine();
		System.out.print("������ ����: ");
		String birth = sc.nextLine();
		System.out.print("������ ����: ");
		String gender = sc.nextLine();
		System.out.print("������ ����: ");
		String age = sc.nextLine();
		
		MemberDto mdto = new MemberDto();
		
		if(!name.equals("")) mdto.setName(name);
		if(!phone.equals("")) mdto.setPhone(phone);
//		if(!birth.equals("")) mdto.setBirth(birth);
		if(!gender.equals("")) mdto.setGender(gender);
		if(!age.equals("")) mdto.setAge(Integer.parseInt(age));
		mdto.setMembernum(Integer.parseInt(num));
		
		int result = MemberDao.getInstance().update(mdto);
		
		if(result == 1) System.out.println("���������� ������Ʈ ��");
		else System.out.println("������Ʈ ����!");
	}
	
	public static void delete(Scanner sc) {
		System.out.print("����� ���� �ɹ��� ��ȣ �Է�: ");
		String num = sc.nextLine();
		
		int result = MemberDao.getInstance().delete(Integer.parseInt(num));
		
		if(result == 1) System.out.println("���������� ������");
		else System.out.println("����� ����...");
		
	}
}
