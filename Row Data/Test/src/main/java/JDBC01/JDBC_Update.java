package JDBC01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_Update {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "scott";
		String pw = "tiger";
		Connection con = null;  
		PreparedStatement pstmt = null; // con �� SQL �������ִ� ��ü 
		ResultSet rs = null; // SQL �������� �����ϴ� ��ü
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pw);
			System.out.print("Connection Successful");
			
			Scanner sc = new Scanner(System.in);
			System.out.print("������ ȸ���� ��ȣ �Է�: ");
			String num = sc.nextLine();
			
			System.out.print("������ �׸� ����(1. �̸��� 2. ��ȭ��ȣ): ");
			String input = sc.nextLine();
			
			String sql = "";
			switch(input) {
			case "1":
				System.out.print("������ �̸��� �Է�: ");
				String email = sc.nextLine();
				sql = "update customer set email=? where num=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, email);
				pstmt.setInt(2, Integer.parseInt(num));
				break;
			case "2":
				System.out.print("������ ��ȭ��ȣ �Է�: ");
				String tel = sc.nextLine();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, tel);
				pstmt.setInt(2, Integer.parseInt(num));
				break;
			}
			
			int result = pstmt.executeUpdate();
			if(result == 1) System.out.println("���� ����");
			else System.out.println("���� ����");
			
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		try {
			if(con != null) con.close();
			if(pstmt != null) pstmt.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	} 
}	
