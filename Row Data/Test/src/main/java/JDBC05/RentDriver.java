package JDBC05;

import java.util.ArrayList;
import java.util.Scanner;

public class RentDriver {
	public static void main(String[] args) {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("---�޴� ����---");
			System.out.println("1. �����Ϳ���  2. �������߰� 3. �����ͼ��� 4. �����ͻ��� 5. ���α׷�����");
			System.out.print(">> �޴����� : ");
			
			String choice = sc.nextLine();
			if(choice.equals("5")) {
				System.out.println("���α׷��� �����մϴ�...");
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
				System.out.println("�޴� ������ �߸���");	
			}
		}
	}
	
	private static void select() {
		Scanner sc = new Scanner(System.in);
		RentDao rdao = RentDao.getInstance();
		ArrayList<RentDto> list = rdao.select();
		
		System.out.println("��¥\t\t����\t������ȣ\tȸ����ȣ\t���αݾ�");
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
		
		System.out.print("�뿩������ ��ȣ�� �Է�: ");
		int booknum;
		while(true) {
			booknum = Integer.parseInt(sc.nextLine());
			boolean state = rdao.checkBooknum(booknum);
			if(state) break;
			else System.out.print("�Է��� ������ȣ�� ���� �������� ����. �ٽ� �Է�: ");
		}
		rdto.setBooknum(booknum);
		
		int membernum = 0;
		System.out.print("ȸ����ȣ�� �Է��ϼ���: ");
		while(true) {
			membernum = Integer.parseInt(sc.nextLine());
			boolean state = rdao.checkMembernum(membernum);
			if(state) break;
			else System.out.print("�Է��� ȸ���� �������� ����. �ٽ� �Է�: ");
		}
		rdto.setMembernum(membernum);
		
		System.out.print("���αݾ� �Է�: ");
		String input = sc.nextLine();
		int discount = 0;
		if(!input.equals("")) discount = Integer.parseInt(input);
		rdto.setDiscount(discount);
		
		int result = rdao.insert(rdto);
		if(result == 1) System.out.println("���ڵ� �߰� ����");
		else System.out.println("���ڵ� �߰� ����");
	}

	private static void update() {
		Scanner sc = new Scanner(System.in);
		RentDao rdao = RentDao.getInstance();
		RentDto rdto = new RentDto();
		
		System.out.print("������ �뿩���� number�Է�: ");
		String input;
		while(true) {
			input = sc.nextLine();
			if(input.equals("")) System.out.println("number �Է��� �ʼ�");
			else break;
		}
		int num = Integer.parseInt(input);
		rdto = rdao.getRent(num);
		if(rdto == null) {
			System.out.print("�Է��� number�� �뿩���� ����");
			return;
		} 
		
		// ������ ���� �Է�
		// String rentdate, int num, int booknum, int membernum, int discount
		System.out.print("������ ��¥ �Է�: ");
		String rentdate = sc.nextLine();
		if(!rentdate.equals("")) rdto.setRentdate(rentdate);
		System.out.print("������ ���� �Է�: ");
		String rentnum = sc.nextLine();
		if(!rentnum.equals("")) ;
		System.out.print("������ ������ȣ �Է�: ");
		
		System.out.print("������ ȸ����ȣ �Է�: ");
		
		System.out.print("������ ���αݾ� �Է�: ");
	}

	private static void delete() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ��ȣ �Է�: ");
		String num = sc.nextLine();
		
		RentDao rdao = RentDao.getInstance();
		
		int result = rdao.delete(Integer.parseInt(num));
		
		if(result == 1) System.out.println("����� ����");
		else System.out.println("����� ����");
	}
} 
