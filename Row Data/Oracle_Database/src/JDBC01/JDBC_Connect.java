package JDBC01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Connect {
	public static void main(String[] args) {
		// url : jdbc:oracle.thin:@localhost:1521:xe
		// driver : oracle.jdbc.OracleDriver
		// id : scott
		// password : tiger
		
		// JDBC를 통해 DB와 연결하게 해 주는 클래스 : Connection
		Connection con = null;
		
		// DB 연결을 위한 Driver 클래스 설정
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 연결 url을 목적지로 id와 pw를 이용하여 연결을 실제 실행
			// 연결된 연결객체는 변수 con에 저장
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"soott",
					"tiger"
					);
			System.out.println("연결이 성공하였습니다.");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("objbc6.jar 파일을 확인하세요");
		} catch(SQLException e) {
			e.printStackTrace();
			System.out.println("연결정보를 확인하세요");
		}
		
		try {
			if(con != null) con.close())
		} catch(SQLException e) {
			e.printStackTrace();
			System.out.println("연결이 종료되지 않았습니다")
		}
	}
}