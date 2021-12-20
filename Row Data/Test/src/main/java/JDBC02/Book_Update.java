package JDBC02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Book_Update {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = null;  
		PreparedStatement pstmt = null; // con 에 SQL 실행해주는 객체 
		ResultSet rs = null; // SQL 실행결과를 저장하는 객체

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Connection Successful");
			
			String sql = "select * from booklist";
			
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
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
			System.out.print("수정할 도서의 도서번호: ");
			String booknum = sc.nextLine();
			System.out.print("수정할 항목 선택(1-출판연도, 2-입고가격, 3-대여가격, 4-등급): ");
			String input = sc.nextLine();
			
			switch(input) {
			case "1":
				System.out.print("출판연도를 연제로 수정할까요? ");
				String publishYear = sc.nextLine();
				sql = "update booklist set makeyear=? where num=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, Integer.parseInt(publishYear));
				pstmt.setInt(2, Integer.parseInt(booknum));
				break;
			case "2":
				System.out.print("입고가격을 얼마로 수정할까요? ");
				String inprice = sc.nextLine();
				sql = "update booklist set inprice=? where num=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, Integer.parseInt(inprice));
				pstmt.setInt(2, Integer.parseInt(booknum));
				break;
			case "3":
				System.out.print("대여가격을 얼마로 수정할까요? ");
				String rentPrice = sc.nextLine();
				sql = "update booklist set rentprice=? where num=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, Integer.parseInt(rentPrice));
				pstmt.setInt(2, Integer.parseInt(booknum));
				break;
			case "4":
				System.out.print("등급을 뭘로 수정할까요? ");
				String grade = sc.nextLine();
				sql = "update booklist set grade=? where num=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, grade);
				pstmt.setInt(2, Integer.parseInt(booknum));
				break;
			}
			
			int result = pstmt.executeUpdate();
			if(result == 1) System.out.println("Update Successful");
			else System.out.println("Update Failed");
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
