package JDBC02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Book_Select {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = null;  
		PreparedStatement pstmt = null; // con 에 SQL 실행해주는 객체 
		ResultSet rs = null; // SQL 실행결과를 저장하는 객체

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
			
			System.out.println("도서번호\t출판연도\t입고가격\t출고가격\t등급\t제목");
			System.out.println("---------------------------------------------------------------");
			
			String sql = "select * from booklist";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.printf("%d\t%s\t%s\t%s\t%s\t%s\n", 
						rs.getInt("num"), rs.getString("makeyear"), 
						rs.getString("inprice"), rs.getString("rentprice"),
						rs.getString("grade"), rs.getString("subject")
						);
			}
			
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		try {
			if(con != null) con.close();
			if(pstmt != null) pstmt.close();
			if(rs != null) rs.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
