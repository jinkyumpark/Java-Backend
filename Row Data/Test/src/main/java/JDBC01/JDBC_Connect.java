package JDBC01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Connect {
	public static void main(String[] args) {
		// url : jdbc:oracle:thin:@localhost:1521:xe
		// driver : oracle.jdbc.OracleDriver
		// id : scott
		// password : tiger
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.OracleDriver";
		String id = "scott";
		String pw = "tiger";
		// JDBC �� ���� ������ ���̽��� �����ϰ� ���ִ� Ŭ���� : Connection
		Connection con = null;
		
		try {
			// �����ͺ��̽� ������ ���� ����̹� Ŭ������ �����մϴ�
			Class.forName( driver );
			// ���� url �� ��������  id �� pw �� �̿��Ͽ� ������ ���� �����մϴ�
			// ����� ���ᰴü��  ���� con �� �����մϴ�
			con = DriverManager.getConnection(url, id, pw );
			System.out.println("������ �����Ͽ����ϴ�.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("ojdbc6.jar ������ Ȯ���ϼ���");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("���������� Ȯ���ϼ���.");
		}

		try {
			if( con != null) con.close();
			System.out.println("�����ͺ��̽� ����");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("������ ������� �ʾҽ��ϴ�.");
		}
	}
}