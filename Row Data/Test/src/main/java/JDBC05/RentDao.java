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
	
	public ArrayList<RentDetailDto> selectAll() {
		String sql =	"select to_char(a.rentdate, 'YYYY-MM-DD as rentdate"
				+ 		"a.num as rentnum, c.num as membernum, c.name as membername,"
				+ 		"b.rentprice - a.discount as rentprice2,"
				+ 		"b.num as booknumber4, b.subject as subject,"
				+ 		"from rentlist a, booklist b, memberlist c"
				+ 		"where a.booknum = b.num and a.membernum = c.num";
		sql = "select * from rentdetail";
		ArrayList<RentDetailDto> list = new ArrayList<RentDetailDto>();
		
		con = DBManager.getConnection();
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				RentDetailDto rdto = new RentDetailDto();
				rdto.setRentdate(rs.getString("rentdate"));
				rdto.setRentnumber(rs.getInt("rentnumber"));
				rdto.setMembernumber(rs.getInt("membernumber"));
				rdto.setMembername(rs.getString("membername"));
				rdto.setRentprice(rs.getInt("rentprice2"));
				rdto.setBooknumber(rs.getInt("booknumber"));
				rdto.setSubject(rs.getString("subject"));
				list.add(rdto);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt, rs);
		}
	}
	
	public ArrayList<RentDto> select() {
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
		String sql = "delete from rentlist where num=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			result = pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		DBManager.close(con, pstmt, rs);
		return result;
	}
} 
