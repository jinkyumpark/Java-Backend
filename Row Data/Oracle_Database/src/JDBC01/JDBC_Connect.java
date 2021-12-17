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
		
		// JDBC�� ���� DB�� �����ϰ� �� �ִ� Ŭ���� : Connection
		Connection con = null;
		
		// DB ������ ���� Driver Ŭ���� ����
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// ���� url�� �������� id�� pw�� �̿��Ͽ� ������ ���� ����
			// ����� ���ᰴü�� ���� con�� ����
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"soott",
					"tiger"
					);
			System.out.println("������ �����Ͽ����ϴ�.");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("objbc6.jar ������ Ȯ���ϼ���");
		} catch(SQLException e) {
			e.printStackTrace();
			System.out.println("���������� Ȯ���ϼ���");
		}
		
		try {
			if(con != null) con.close())
		} catch(SQLException e) {
			e.printStackTrace();
			System.out.println("������ ������� �ʾҽ��ϴ�")
		}
	}
}