package sist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select {
	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "web";
		String password = "1234";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			// 1. 오라클 드라이버 메모리로 동적 로딩.
			Class.forName(driver);

			// 2. 오라클 데이터베이스와 연결 시도
			con = DriverManager.getConnection(url, user, password);

			// 3. 데이터베이스에 SQL문을 전송하기 위한 쿼리문 작성
			String sql = "select * from member10 order by num desc";

			pstmt = con.prepareStatement(sql);

			// 4. 데이터베이스에 SQL문을 전송
			rs = pstmt.executeQuery();

			// 5. while 반복문을 이용해서 데이터를 가져와서 출력
			while (rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.print(rs.getInt(5) + "\t");
				System.out.print(rs.getInt(6) + "\t");
				System.out.print(rs.getString(7) + "\t");
				System.out.print(rs.getString(8) + "\t");
				System.out.println(rs.getString(9).substring(0, 10));
				System.out.println("-------------------------------------------------------------------");
			}

			// 6. 연결된 객체 종료
			rs.close();
			pstmt.close();
			con.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
