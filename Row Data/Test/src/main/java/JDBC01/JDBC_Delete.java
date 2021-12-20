package JDBC01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_Delete {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "scott";
		String pw = "tiger";
		Connection con = null;  
		PreparedStatement pstmt = null; // con 에 SQL 실행해주는 객체 
		ResultSet rs = null; // SQL 실행결과를 저장하는 객체

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pw);
			
			Scanner sc = new Scanner(System.in);
			System.out.print("삭제할 회원의 번호 입력: ");
			String num = sc.nextLine();
			
			String sql = "delete from customer where num=?";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, Integer.parseInt(num));
			
			int result = pstmt.executeUpdate();
			
			if(result == 1) System.out.print("Delete Successful");
			else System.out.print("Delete Failed");
			
		} catch(ClassNotFoundException e ) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
