package JDBC04;

import java.util.Scanner;

public class MemberDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n---�޴� ����---");
			System.out.print("1. �����Ϳ��� 2. �������߰� 3. �����ͼ��� 4. �����ͻ��� 5. ���α׷����� >> �޴����� : ");
			
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
				System.out.println("�޴� ������ �߸��Ǿ����ϴ�");
			}
		}
	}
}
