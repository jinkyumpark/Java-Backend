package JDBC03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Book_Dao {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public ArrayList<Book_Dto> select() {
		ArrayList<Book_Dto> list = new ArrayList<Book_Dto>();
		String sql = "select * from booklist order by num desc";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Book_Dto bdto = new Book_Dto(rs.getString("subject"), rs.getInt("makeyear"), 
						rs.getInt("inprice"), rs.getInt("rentprice"), rs.getString("grade"));
				list.add(bdto);
			}
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public int insert(Book_Dto bdto) {
		String sql = "insert into booklist values(book_seq.nextVal, ?, ?, ?, ?, ?)";
		int result = 0;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bdto.getSubject());
			pstmt.setInt(2, bdto.getMakeyear());
			pstmt.setInt(3, bdto.getInprice());
			pstmt.setInt(4, bdto.getRentprice());
			pstmt.setString(5, bdto.getGrade());
			
			pstmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}

	public Book_Dto getBook(int num) {
		Book_Dto bdto = null;
		String sql = "select * from booklist where num=?";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return bdto;
	}
}
