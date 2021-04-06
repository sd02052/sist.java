package sist;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DEPT extends JFrame {

	Connection con = null; // DB 연동 결과를 저장하는 객체
	PreparedStatement pstmt = null; // 쿼리문 전송 객체
	ResultSet rs = null; // 쿼리문 실행 결과를 저장하고 있는 객체
	DefaultTableModel model;
	JTable table;
	JTextField jtf1;
	JTextField jtf2;
	JTextField jtf3;

	public DEPT() {

		setTitle("부서 테이블");

		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();

		// 1. 컴포넌트를 만들어 보자.
		JLabel jl1 = new JLabel("부서번호 : ");
		jtf1 = new JTextField(3);

		JLabel jl2 = new JLabel("부서명 : ");
		jtf2 = new JTextField(10);

		JLabel jl3 = new JLabel("근무지 : ");
		jtf3 = new JTextField(10);

		String[] header = { "부서번호", "부서명", "근무지" };

		model = new DefaultTableModel(header, 0);

		table = new JTable(model);
		JScrollPane jsp = new JScrollPane(table, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		JButton jb1 = new JButton("전체목록");
		JButton jb2 = new JButton("부서 추가");
		JButton jb3 = new JButton("부서삭제");

		// 2. 컴포넌트를 컨테이너에 추가해 주어야 한다.
		jp1.add(jl1);
		jp1.add(jtf1);
		jp1.add(jl2);
		jp1.add(jtf2);
		jp1.add(jl3);
		jp1.add(jtf3);

		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(jb3);

		// 3. 컨테이너를 프레임에 올려주어야 한다.
		add(jp1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jp2, BorderLayout.SOUTH);

		setBounds(200, 200, 500, 250);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);

		// 4. 이벤트 처리
		// 전체목록 버튼(jb1)을 클릭했을 때 부서테이블의 전체 리스트가 JTable에 출력이 되면 된다.
		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				connect(); // DB 연동하는 메서드 호출
				select(); // 전체 내역을 조회하는 메서드 호출
			}
		});

		// 부서 추가 버튼을 눌렀을때 각각의 텍스트필드에 입력된 정보를 데이터베이스에
		// 추가한 후 추가된 전체 리스트를 JTable에 다시 보여줌.
		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				connect();
				insert();

				// 입력 텍스트필드 영역을 초기화
				jtf1.setText("");
				jtf2.setText("");
				jtf3.setText("");
				jtf1.requestFocus();

				model.setRowCount(0); // 전체 테이블의 화면을 지워줌.
				select(); // DB에 추가된 후에 추가된 전체 리스트 메서드 호출
			}
		});

		// JTable의 특정 행을 클릭한 상태로 부서 삭제 버튼을 눌렀을때 클릭된 행을
		// DB에서 삭제시키는 이벤트
		jb3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "정말로 삭제 하시겠습니까?", "확인", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.CLOSED_OPTION) {
					JOptionPane.showMessageDialog(null, "취소를 클릭했습니다.");
				} else if (result == JOptionPane.YES_OPTION) {
					connect();
					delete();
				} else {
					JOptionPane.showMessageDialog(null, "취소를 클릭했습니다.");
				}
			}
		});

	}

	// DB 연동 메서드
	private void connect() {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "web";
		String password = "1234";

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 전체 내역을 조회하는 메서드
	private void select() {
		try {
			// 1. 데이버테이스에 SQL문을 전송하기 위한 쿼리문 작성
			String sql = "select * from dept order by deptno";

			// 2. 쿼리문을 전송하자.
			pstmt = con.prepareStatement(sql);

			// 3. 실제 DB 상에서 쿼리문을 실행하도록 하자.
			rs = pstmt.executeQuery();

			while (rs.next()) { // 레코드 수만큼 반복 작업
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				Object[] data = { deptno, dname, loc };

				// 저장한 한개의 레코드(data)를 model에 추가해 주면 됨.
				model.addRow(data);
			}

			// 객체 닫기
			rs.close();
			pstmt.close();
			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 부서를 추가하는 메서드
	private void insert() {
		try {
			// 1. 쿼리문을 작성하자.
			String sql = "insert into dept values(?,?,?)";

			// 2. 쿼리문을 전송하자.
			pstmt = con.prepareStatement(sql);

			// 3. 실제 DB 상에서 쿼리문이 실행되도록 하자.
			int deptno = Integer.parseInt(jtf1.getText());
			String dname = jtf2.getText();
			String loc = jtf3.getText();

			pstmt.setInt(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);

			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 특정 행을 삭제하는 메서드
	private void delete() {

		try {
			String sql = "delete from dept where deptno = ?";
			pstmt = con.prepareStatement(sql);

			int row = table.getSelectedRow();

			// getValueAt(세로인덱스, 가로인덱스)
			// ==> 원하는 위치의 데이터를 가져오는 메서드
			pstmt.setInt(1, (int) model.getValueAt(row, 0));
			pstmt.executeUpdate();

			model.removeRow(row); // 테이블 상의 한줄을 삭제하는 메서드

			pstmt.close();
			con.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		new DEPT();
	}
}
