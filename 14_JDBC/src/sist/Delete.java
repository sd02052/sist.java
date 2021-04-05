package sist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Delete {
	public static void main(String[] args) {

		// 대소문자 구별
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "web";
		String password = "1234";

		Connection con = null; // DB와 연결 객체
		PreparedStatement pstmt = null; // sql문을 전송하는 객체
		ResultSet rs = null; // sql 실행 결과를 가지고 있는 객체

		Scanner sc = new Scanner(System.in);

		System.out.print("삭제할 메모 글번호 : ");
		int no = sc.nextInt();

		try {
			// 1. 오라클 드라이버 로딩
			Class.forName(driver);

			// 2. 데이터베이스와 연결
			con = DriverManager.getConnection(url, user, password);

			// 3. 데이터베이스에 SQL문을 전송하기 위한 SQL 작성
			String sql = "delete from memo where bunho = ?";

			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, no);

			// 4. 데이터베이스에 SQL문을 전송
			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("데이터 삭제 성공!");
			} else {
				System.out.println("데이터 삭제 실패!");
			}

			// 5. 연결 객체 닫기
			pstmt.close();
			con.close();
			sc.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
