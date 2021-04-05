package sist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Insert {

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

		System.out.print("메모 제목 : ");
		String title = sc.nextLine();

		System.out.print("메모 작성자 : ");
		String writer = sc.nextLine();

		System.out.print("메모 내용 : ");
		String content = sc.nextLine();

		try {
			// 1. 오라클 드라이버 로딩.
			Class.forName(driver);

			// 2. 데이터베이스와 연결
			con = DriverManager.getConnection(url, user, password);

			// 3. 데이터베이스에 SQL문을 전송하기 위한 쿼리문 작성.
			String sql = "insert into memo values(memo_seq.nextval, ?, ?, ?, sysdate)";

			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, title);
			pstmt.setString(2, writer);
			pstmt.setString(3, content);

			// 4. 데이터베이스에 SQL문을 전송
			// SQL문이 select SQL문인 경우 excuteQuery() 메서드 사용
			// ==> 반환형은 ResultSet
			// SQL문이 insert, update, delete SQL문인 경우
			// excuteUpdate() 메서드 사용 ==> 반환형은 int형
			// 반환형이 int인 이유 : 행 삽입, 수정, 삭제 갯수를 표현한 것.
			// SQL문이 성공적으로 실행이 되면 반환되는 값은 1이라는 값이 반환됨.

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("데이터 추가 성공!");
			} else {
				System.out.println("데이터 추가 실패!");
			}

			// 5. 연결된 객체 종료하기
			pstmt.close();
			con.close();
			sc.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
