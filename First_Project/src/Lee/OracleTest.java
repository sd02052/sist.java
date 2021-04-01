package Lee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleTest {

	public static void main(String[] args) {

		Connection conn = null; // DB연결된 상태(세션)을 담은 객체
		PreparedStatement pstm = null; // SQL 문을 나타내는 객체
		ResultSet rs = null; // 쿼리문을 날린것에 대한 반환값을 담을 객체

		try {
			String quary = "SELECT * FROM EMP";

			conn = DBConnection.getConnection();
			pstm = conn.prepareStatement(quary);
			rs = pstm.executeQuery();

			/*
			 * PreparedStatement 클래스에 있는 executeQuery( ) 메서드는 쿼리문을 실행하는 것을 의미한다. 즉 우리가 cmd
			 * 창에 쿼리문을 적어놓고 엔터를 치면 결과가 나오듯 executeQuery( )는 쿼리문이 입력된 상태에서 엔터키를 누르는 역할을 한다.
			 * 쿼리문을 입력하고 엔터를 누르면 그에 해댕하는 결과가 나올 것이다. 그 결과를 rs(ResultSet)에 담는다. executeQuery(
			 * ) 메서드의 반환값은 ResultSet 이다.
			 */

			System.out.println("EMPNO ENAME JOB MGR HIREDATE SAL COMM DEPTNO");
			System.out.println("============================================");

			while (rs.next()) {
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				String job = rs.getString(3);
				int mgr = rs.getInt(4);
				java.sql.Date hiredate = rs.getDate(5); // Date 타입 처리
				int sal = rs.getInt(6);
				int comm = rs.getInt(7);
				int deptno = rs.getInt(8);

				String result = empno + " " + ename + " " + job + " " + mgr + " " + hiredate + " " + sal + " " + comm
						+ " " + deptno;
				System.out.println(result);

			}
		} catch (SQLException sqle) {
			System.out.println("SELECT문에서 예외 발생");
			sqle.printStackTrace();
		} finally {

			try {
				if (rs != null) {
					rs.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				throw new RuntimeException(e.getMessage());
			}
		}
	}
}
