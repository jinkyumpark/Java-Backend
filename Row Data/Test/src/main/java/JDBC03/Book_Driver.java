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
			System.out.println("--- �޴� ���� ---");
			System.out.print("1-�����Ϳ��� 2-�������߰� 3-�����ͼ��� 4-�����ͻ��� 5-���α׷�����\n");
			System.out.print("�޴� ���� : ");
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
				System.out.println("�޴� ������ �߸��Ǿ����ϴ�.");
			}
			

		}
		System.out.print("���α׷��� ����Ǿ����ϴ�.");
	} 
	
	private static void select(Scanner sc, Book_Dao bdao) {
		System.out.println("������ȣ\t���ǳ⵵\t�԰���\t�����\t���\t����");
		System.out.println("----------------------------------------------------------------------");
		
		ArrayList<Book_Dto> BookDto_list = bdao.select();
		for(Book_Dto bdto : BookDto_list) {
			System.out.printf("%d\t%d\t%d\t%d\t%s\t%s\n", bdto.getNum(), bdto.getMakeyear(), bdto.getInprice(),
					bdto.getRentprice(), bdto.getGrade(), bdto.getSubject());
		}
	}
	
	private static void insert(Scanner sc, Book_Dao bdao) {
		System.out.print("������ �Է��ϼ���: ");
		String subject = sc.nextLine();
		System.out.print("���ǿ��� �Է�: ");
		String makeyear = sc.nextLine();
		System.out.print("�԰��� �Է�: ");
		String inprice = sc.nextLine();
		System.out.print("����� �Է�: ");
		String rentprice = sc.nextLine();
		System.out.print("��� �Է�: ");
		String grade = sc.nextLine();
		Book_Dto bdto = new Book_Dto(subject, Integer.parseInt(makeyear), 
				Integer.parseInt(inprice), Integer.parseInt(rentprice), grade);
		bdao.insert(bdto);
	}
	
	private static void update(Scanner sc, Book_Dao bdao) {
		// ������ ���� ��ȣ
		int num = 0;
		while(true) {
			System.out.print("������ ������ȣ�� �Է�(�ʼ�): ");
			String input = sc.nextLine();
			if(input.equals("")) {
				System.out.println("������ȣ �Է��� �ʼ�");
			} else {
				num = Integer.parseInt(input);
				break;
			}
		}
		
		// ������ȣ�� ��ȸ�ؼ� Book_Dto�� ����
		Book_Dto bdto = bdao.getBook(num);
		
		if(bdto == null) {
			System.out.println("�Է��� ������ȣ�� ��ȸ�� ���� ����");
			return;
		}
		// ������ ���� �Է�, �������� ���� �׸��� ���͸� �Է¹޾� �н�
		// ������ ������ �����ص� Book_Dto�� ������Ʈ

		System.out.print("������ ������ ���� �Է�: ");
		String subject = sc.nextLine();
		if(!subject.equals("")) bdto.setSubject(subject);
		
		System.out.print("������ ������ ���ǳ⵵ �Է�: ");
		String makeyear = sc.nextLine();
		if(!makeyear.equals("")) bdto.setMakeyear(Integer.parseInt(makeyear));
		
		System.out.print("������ ������ �԰��� �Է�: ");
		String inprice = sc.nextLine();
		if(!inprice.equals("")) bdto.setInprice(Integer.parseInt(inprice));
		
		System.out.print("������ ������ ����� �Է�: ");
		String rentprice = sc.nextLine();
		if(!rentprice.equals("")) bdto.setRentprice(Integer.parseInt(rentprice));
		
		System.out.print("������ ������ ����� �Է�: ");
		String grade = sc.nextLine();
		if(!grade.equals("")) bdto.setGrade(grade);
		
		// Dao�� Book_Dto�� ������ �ش� ���ڵ� ����
		int result = bdao.update(bdto);
		if(result == 1) System.out.println("���ڵ� ���� ����");
		else System.out.println("���ڵ� ���� ����");
	}

	private static void delete(Scanner sc, Book_Dao bdao) {
		int num = 0;
		while(true) {
			System.out.print("������ ������ ������ȣ �Է�: ");
			String input = sc.nextLine();
			if(input.equals("")) {
				System.out.print("������ȣ �Է��� �ʼ��Դϴ�.");
			} else {
				num = Integer.parseInt(input);
				break;
			}
			
		}
		int result = bdao.delete(num);
		if(result == 1) System.out.println("���ڵ� ���� ����");
		else System.out.println("���ڵ� ���� ����");

	}
}
