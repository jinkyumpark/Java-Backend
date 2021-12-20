package JDBC01;

import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Select {
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
			String sql = "select * from customer";
			
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			System.out.println("��ȣ \t �̸� \t\t �̸��� \t\t\t ��ȭ��ȣ");
			System.out.println("--------------------------------------------------");
			
			while(rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String tel = rs.getString("tel");
				System.out.printf("%d\t%s\t%s\t%s\n", num, name, email, tel);
			}
			
		} catch(ClassNotFoundException e) {
			e.getStackTrace();
		} catch(SQLException e) {
			e.getStackTrace();
		}
		
		
	}
}
