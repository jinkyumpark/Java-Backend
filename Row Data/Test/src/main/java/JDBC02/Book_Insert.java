package JDBC02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Book_Insert {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = null;  
		PreparedStatement pstmt = null; // con 에 SQL 실행해주는 객체 
		ResultSet rs = null; // SQL 실행결과를 저장하는 객체

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
			Scanner sc = new Scanner(System.in);
			
			System.out.print("제목을 입력하세요: ");
			String subject = sc.nextLine();
			System.out.print("출판연도 입력: ");
			String publishYear = sc.nextLine();
			System.out.print("입고가격 입력: ");
			String inprice = sc.nextLine();
			System.out.print("출고가격 입력: ");
			String outprice = sc.nextLine();
			System.out.print("등급 입력: ");
			String grade = sc.nextLine();
		
			String sql = "insert into booklist values(book_seq.nextval, ?, ?, ?, ?, ?)";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, subject);
			pstmt.setInt(2, Integer.parseInt(publishYear));
			pstmt.setInt(3, Integer.parseInt(inprice));
			pstmt.setInt(4, Integer.parseInt(outprice));
			pstmt.setString(5, grade);
			
			int result = pstmt.executeUpdate();
			
			if(result == 1) System.out.print("Insert Successful");
			else System.out.print("Insert Failed...");
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
