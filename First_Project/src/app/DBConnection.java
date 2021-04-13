package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {

	public Connection con = null;
	public PreparedStatement pstmt = null;
	public ResultSet rs = null;

	public void connect() {
		try {
			String user = "web";
			String pw = "1234";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			Class.forName("oracle.jdbc.driver.OracleDriver");

			con = DriverManager.getConnection(url, user, pw);

			System.out.println("Data베이스에 연결되었습니다.");

		} catch (ClassNotFoundException c) {
			System.out.println("DB 드라이버 로딩 실패:" + c.toString());
		} catch (SQLException sqle) {
			System.out.println("DB 접속실패:" + sqle.toString());
		} catch (Exception e) {
			System.out.println("Unkonwn error");
			e.printStackTrace();
		}
	}

}
