package Lee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection dbConn;

	public static Connection getConnection() {

		Connection conn = null;
		try {
			String user = "web"; // 접속할 계정
			String pw = "1234"; // 계정 비
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// 오라클 접속 @IP주소 :포트번호 :DB이름

			Class.forName("oracle.jdbc.driver.OracleDriver");
			// JDBC 드라이버 (ojdbc6.jar)로딩. 실패시 ClassNotFoudException발생
			// 프로젝트-Properties에서 JDBC라이브러리 추가해줘야함.
			conn = DriverManager.getConnection(url, user, pw);
			// 입력된 오라클 계정에 접속. 실패시 SQLEXception발생.
			// getConnection( ) 메서드는 Connection을 반환한다.

			System.out.println("Data베이스에 연결되었습니다.");

		} catch (ClassNotFoundException c) {
			System.out.println("DB 드라이버 로딩 실패:" + c.toString());
		} catch (SQLException sqle) {
			System.out.println("DB 접속실패:" + sqle.toString());
		} catch (Exception e) {
			System.out.println("Unkonwn error");
			e.printStackTrace();
		}
		return conn;
	}
}
