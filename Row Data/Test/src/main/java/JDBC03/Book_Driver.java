package JDBC03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

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
				bdao.select();
				break;
			case "2":
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
				break;
			case "3":
				bdao.update();
				break;
			case "4":
				bdao.delete();
				break;
			default:
				System.out.println("�޴� ������ �߸��Ǿ����ϴ�.");
			}
			
			
		}
		System.out.print("���α׷��� ����Ǿ����ϴ�.");
		
	} 
}
