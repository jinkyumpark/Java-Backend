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
		PreparedStatement pstmt = null; // con �� SQL �������ִ� ��ü 
		ResultSet rs = null; // SQL �������� �����ϴ� ��ü

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Connection Successful");
			
			String sql = "select * from booklist";
			
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			System.out.println("������ȣ\t���ǿ���\t�԰���\t�����\t���\t����");
			System.out.println("---------------------------------------------------------------");
			while(rs.next()) {
				System.out.printf("%d\t%s\t%s\t%s\t%s\t%s\n",
						rs.getInt("num"), rs.getString("makeyear"), 
						rs.getString("inprice"), rs.getString("rentprice"),
						rs.getString("grade"), rs.getString("subject")						
						);
			}
			
			Scanner sc = new Scanner(System.in);
			System.out.print("������ ������ ������ȣ: ");
			String booknum = sc.nextLine();
			System.out.print("������ �׸� ����(1-���ǿ���, 2-�԰���, 3-�뿩����, 4-���): ");
			String input = sc.nextLine();
			
			switch(input) {
			case "1":
				System.out.print("���ǿ����� ������ �����ұ��? ");
				String publishYear = sc.nextLine();
				sql = "update booklist set makeyear=? where num=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, Integer.parseInt(publishYear));
				pstmt.setInt(2, Integer.parseInt(booknum));
				break;
			case "2":
				System.out.print("�԰����� �󸶷� �����ұ��? ");
				String inprice = sc.nextLine();
				sql = "update booklist set inprice=? where num=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, Integer.parseInt(inprice));
				pstmt.setInt(2, Integer.parseInt(booknum));
				break;
			case "3":
				System.out.print("�뿩������ �󸶷� �����ұ��? ");
				String rentPrice = sc.nextLine();
				sql = "update booklist set rentprice=? where num=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, Integer.parseInt(rentPrice));
				pstmt.setInt(2, Integer.parseInt(booknum));
				break;
			case "4":
				System.out.print("����� ���� �����ұ��? ");
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
