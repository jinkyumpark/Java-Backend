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
		PreparedStatement pstmt = null; // con �� SQL �������ִ� ��ü 
		ResultSet rs = null; // SQL �������� �����ϴ� ��ü

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
			
			
			String sql = "select * from booklist";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
			
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
			System.out.print("������ ������ ������ȣ �Է�: ");
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
