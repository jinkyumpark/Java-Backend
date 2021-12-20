package JDBC02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Book_Delete {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = null;  
		PreparedStatement pstmt = null; // con 에 SQL 실행해주는 객체 
		ResultSet rs = null; // SQL 실행결과를 저장하는 객체

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
			
			
			String sql = "select * from booklist";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
			
			System.out.println("도서번호\t출판연도\t입고가격\t출고가격\t등급\t제목");
			System.out.println("---------------------------------------------------------------");
			while(rs.next()) {
				System.out.printf("%d\t%s\t%s\t%s\t%s\t%s\n", 
						rs.getInt("num"), rs.getString("makeyear"), 
						rs.getString("inprice"), rs.getString("rentprice"),
						rs.getString("grade"), rs.getString("subject")
						);
			}
			
			Scanner sc = new Scanner(System.in);
			System.out.print("삭제할 도서의 도서번호 입력: ");
			String booknum = sc.nextLine();
			
			sql = "delete from booklist where num=?";
			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, Integer.parseInt(booknum));
			int result = pstmt.executeUpdate();
			
			if(result == 1) System.out.print("Delete Successful");
			else System.out.print("Delete Unsuccessful");
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
