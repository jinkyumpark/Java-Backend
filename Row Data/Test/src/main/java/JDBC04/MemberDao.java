package JDBC04;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDao {
	// Singleton Pattern
	private MemberDao() {}
	private static MemberDao itc = new MemberDao();
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	
	public static MemberDao getInstance() {
		return itc;
	}
	
	private Connection getConnection() {
		Connection con = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public ArrayList<MemberDto> select() {
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		String sql = "select * from memberlist";
		
		try {
			pstmt = getConnection().prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				//int membernum, String name, String phone, Date birth, int bpoint, Date joinDate
				MemberDto mdto = new MemberDto(rs.getInt("num"), rs.getString("name"),
						rs.getString("phone"), rs.getDate("birth"), rs.getInt("bpoint"), 
						rs.getDate("joinDate"), rs.getString("gender"), rs.getInt("age")
						);
				list.add(mdto);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	public int insert(MemberDto mdto) {
		Connection con = getConnection();
		String sql = "insert into memberlist values(member_seq.nextVal, ?, ?, ?, ?, ?, ?, ?)";
		int result = 0;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mdto.getName());
			pstmt.setString(2, mdto.getPhone());
			pstmt.setDate(3, mdto.getBirth());
			pstmt.setInt(4, mdto.getBpoint());
			pstmt.setDate(5, mdto.getJoinDate());
			pstmt.setString(6, mdto.getGender());
			pstmt.setInt(7, mdto.getAge());
			result = pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	
	public int update(MemberDto mdto) {
		Connection con = getConnection();
		String sql = "update from memberlist set name=?, phone=?, date=?, bpoint=?, gender=?, age=? where num=?";
		int result = 0;
		

		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mdto.getName());
			pstmt.setString(2, mdto.getPhone());
			pstmt.setDate(3, mdto.getBirth());
			pstmt.setInt(4, mdto.getBpoint());
			pstmt.setString(5, mdto.getGender());
			pstmt.setInt(6, mdto.getAge());
			pstmt.setInt(7, mdto.getMembernum());
			
			result = pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	
	public MemberDto getMember(int num) {
		Connection con = getConnection();
		String sql = "select * from memberlist where num=?";
		MemberDto mdto = new MemberDto();
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			rs = pstmt.executeQuery();
			
			mdto = new MemberDto(rs.getInt("num"), rs.getString("name"), rs.getString("phone"),
					rs.getDate("birth"), rs.getInt("bpoint"), rs.getDate("joindate"), rs.getString("gender"), rs.getInt("age")
					);
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return mdto;
	}

	
	public int delete(int num) {
		String sql = "delete from memberlist where num=?";
		Connection con = getConnection();
		int result = 0;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,  num);
			
			result = pstmt.executeUpdate();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
