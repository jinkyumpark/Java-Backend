package com.ezen.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ezen.dto.MemberDto;

public class MemberDao {
	private MemberDao() {}
	private static MemberDao itc = new MemberDao();
	public static MemberDao getInstance() {
		return itc;
	}
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	
	private Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e ) {
			e.printStackTrace();
		}
		return con;
	}
	
	public MemberDto getMember(String userid) {
		MemberDto mdto = null;
		
		String sql = "select * from member where userid=?";
		
		con = getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				mdto = new MemberDto();
				mdto.setUserid(rs.getString("userid"));
				mdto.setName(rs.getString("name"));
				mdto.setPwd(rs.getString("pwd"));
				mdto.setEmail(rs.getString("email"));
				mdto.setPhone(rs.getString("phone"));
				mdto.setAdmin(rs.getInt("admin"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return mdto;
	}
	
	private void close() {
		try {
			if(con != null) con.close();
			if(pstmt != null) pstmt.close();
			if(rs != null) rs.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

	
	public int addMember(MemberDto mdto) {
		String sql = "insert into member (name, userid, pwd, phone, email, admin) values(?,?,?,?,?,?)";
		
		int result = 0;
		con = getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mdto.getName());
			pstmt.setString(2, mdto.getUserid());
			pstmt.setString(3, mdto.getPwd());
			pstmt.setString(4, mdto.getPhone());
			pstmt.setString(5, mdto.getEmail());
			pstmt.setInt(6, mdto.getAdmin());
			result = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return result;
	}
	
	public int deleteMember(MemberDto mdto) {
		String sql = "delete member where userid=?";
		
		int result = 0;
		con = getConnection();
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mdto.getUserid());
			result = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}


	public int updateMember(MemberDto mdto) {
		String sql = "update member set name=?, pwd=?, phone=?, email=?, admin=? where userid=?;";
		
		con = getConnection();
		int result = 0;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mdto.getName());
			pstmt.setString(2, mdto.getPwd());
			pstmt.setString(3, mdto.getPhone());
			pstmt.setString(4, mdto.getEmail());
			pstmt.setInt(5, mdto.getAdmin());
			pstmt.setString(6, mdto.getUserid());
			
			result = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}




}
