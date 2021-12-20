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
		PreparedStatement pstmt = null; // con 에 SQL 실행해주는 객체 
		ResultSet rs = null; // SQL 실행결과를 저장하는 객체
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pw);
			System.out.print("Connection Successful");
			
			Scanner sc = new Scanner(System.in);
			System.out.print("수정할 회원의 번호 입력: ");
			String num = sc.nextLine();
			
			System.out.print("수정할 항목 선택(1. 이메일 2. 전화번호): ");
			String input = sc.nextLine();
			
			String sql = "";
			switch(input) {
			case "1":
				System.out.print("수정할 이메일 입력: ");
				String email = sc.nextLine();
				sql = "update customer set email=? where num=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, email);
				pstmt.setInt(2, Integer.parseInt(num));
				break;
			case "2":
				System.out.print("수정할 전화번호 입력: ");
				String tel = sc.nextLine();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, tel);
				pstmt.setInt(2, Integer.parseInt(num));
				break;
			}
			
			int result = pstmt.executeUpdate();
			if(result == 1) System.out.println("수정 성공");
			else System.out.println("수정 실패");
			
			
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
