package JDBC05;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RentDao {
	private RentDao() {}
	private static RentDao itc = new RentDao();
	public static RentDao getInstance() {return itc;}
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public ArrayList<RentDto> select(){
		ArrayList<RentDto> list = new ArrayList<RentDto>();
		String sql = "select to_char(rentdate, 'YYYY-MM-DD') as rentdate, num, booknum, membernum, discount from rentlist order by num desc";
		con = DBManager.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				// String rentdate, int num, int booknum, int membernum, int discount
				list.add(new RentDto(rs.getString("rentdate"), rs.getInt("num"), rs.getInt("booknum"),
						rs.getInt("membernum"), rs.getInt("discount")
						));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	public int insert(RentDto rdto) {
		int result = 0;
		con = DBManager.getConnection();
		String sql = "insert into rentlist values(sysdate, rent_seq.nextVal, ?, ?, ?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, rdto.getBooknum());
			pstmt.setInt(2, rdto.getMembernum());
			pstmt.setInt(3, rdto.getDiscount());
			result = pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		DBManager.close(con, pstmt, rs);
		return result;
	}
	
	public boolean checkMembernum(int membernum) {
		con = DBManager.getConnection();
		String sql = "select * from memberlist where num=?";
		int result = 0;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, membernum);
			result = pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		if(result == 1) return true;
		else return false;
	}
	
	public boolean checkBooknum(int booknum) {
		con = DBManager.getConnection();
		String sql = "select * from booklist where num=?";
		int result = 0;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, booknum);
			result = pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		if(result == 1) return true;
		else return false;
	}
	
	
	
	public RentDto getRent(int num) {
		RentDto rdto = null;
		con = DBManager.getConnection();
		
		DBManager.close(con, pstmt, rs);

		return rdto;
	}
	
	public int update(RentDto rdto) {
		int result = 0;
		con = DBManager.getConnection();
		
		DBManager.close(con, pstmt, rs);

		return result;
	}
	
	public int delete(int num) {
		int result = 0;
		con = DBManager.getConnection();
		
		DBManager.close(con, pstmt, rs);
		return result;
	}
} 
