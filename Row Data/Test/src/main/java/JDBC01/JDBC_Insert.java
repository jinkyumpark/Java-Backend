package JDBC01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_Insert {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "scott";
		String pw = "tiger";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("����Ǿ����ϴ�.");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("������ ��ȣ�� �Է�: ");
			int num = Integer.parseInt(sc.nextLine());
			System.out.print("�̸��� �Է�: ");
			String name = sc.nextLine();
			System.out.print("�̸��� �Է�: ");
			String email = sc.nextLine();
			System.out.print("��ȭ��ȣ �Է�: ");
			String tel = sc.nextLine();
			
			// insert into customer values(6, '���ϳ�', 'abc5@naver.com', 010-111)
			
			// Old Way
			/*String sql = "insert into customer values(" + num + "," + name + ","+ email + ","+ tel + ")";*/
			String sql = "insert into customer values(?,?,?,?)";
			
			// ���� sql ����� pstmt�� ����
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1,  num);
			pstmt.setString(2,  name);
			pstmt.setString(3,  email);
			pstmt.setString(4, tel);
			
			int result = pstmt.executeUpdate();
			
			if(result == 1) System.out.println("���ڵ� �߰� ����");
			
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
