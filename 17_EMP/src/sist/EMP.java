package sist;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class EMP extends JFrame {

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	JComboBox<String> jcb;
	JComboBox<String> jcb1;
	DefaultTableModel model;
	JTable table;
	JTextField jtf1;
	JTextField jtf2;
	JTextField jtf3;
	JTextField jtf5;
	JTextField jtf6;

	public EMP() {

		setTitle("사원관리 화면");

		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();

		// 1. 컴포넌트 만들기
		JLabel jl1 = new JLabel("사번 : ");
		jtf1 = new JTextField(5);
		JLabel jl2 = new JLabel("이름 : ");
		jtf2 = new JTextField(10);
		JLabel jl3 = new JLabel("담당업무 : ");
		jtf3 = new JTextField(15);

		JLabel jl4 = new JLabel("관리자No. : ");
		jcb = new JComboBox<String>();
		JLabel jl5 = new JLabel("급여 : ");
		jtf5 = new JTextField(5);
		JLabel jl6 = new JLabel("보너스 : ");
		jtf6 = new JTextField(5);
		JLabel jl7 = new JLabel("부서번호 : ");
		jcb1 = new JComboBox<String>();

		String[] header = { "사번", "이름", "담당업무", "관리자No.", "입사일자", "급여", "보너스", "부서번호" };
		model = new DefaultTableModel(header, 0);
		table = new JTable(model);
		JScrollPane jsp = new JScrollPane(table, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		JButton jb1 = new JButton("전체목록");
		JButton jb2 = new JButton("사원추가");
		JButton jb3 = new JButton("사원삭제");

		jcb.addItem("선택");
		jcb1.addItem("선택");

		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		jp1.add(jl1);
		jp1.add(jtf1);
		jp1.add(jl2);
		jp1.add(jtf2);
		jp1.add(jl3);
		jp1.add(jtf3);

		jp2.add(jl4);
		jp2.add(jcb);
		jp2.add(jl5);
		jp2.add(jtf5);
		jp2.add(jl6);
		jp2.add(jtf6);
		jp2.add(jl7);
		jp2.add(jcb1);

		jp3.add(jb1);
		jp3.add(jb2);
		jp3.add(jb3);

		JPanel pg = new JPanel(new BorderLayout());
		pg.add(jp2, BorderLayout.NORTH);
		pg.add(jsp, BorderLayout.CENTER);
		pg.add(jp3, BorderLayout.SOUTH);

		// 3. 컨테이너를 프레임에 올려야 한다.
		add(jp1, BorderLayout.NORTH);
		add(pg, BorderLayout.CENTER);

		connect();
		comboMgr();
		comboDept();

		setBounds(200, 200, 650, 350);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);

		// 4. 이벤트 처리
		// 전체목록(jb1) 클릭 시 emp 테이블에 있는 전체 사원의 내역을 화면에 보여주면 된다.
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				connect();
				model.setRowCount(0); // 전체 테이블 화면을 지워준다.
				select();

			}
		});

		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				connect();
				insert();

				jtf1.setText("");
				jtf2.setText("");
				jtf3.setText("");
				jtf5.setText("");
				jtf6.setText("");
				jtf1.requestFocus();
				jcb.setSelectedIndex(0);
				jcb1.setSelectedIndex(0);

				model.setRowCount(0);
				select();
			}
		});

		jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "정말로 삭제하시겠습니까?", "확인", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.CLOSED_OPTION) {
					JOptionPane.showMessageDialog(null, "취소");
				} else if (result == JOptionPane.YES_OPTION) {
					connect();
					delete();
				} else {
					JOptionPane.showMessageDialog(null, "삭제 취소");
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
			// 1. 접속할 오라클 드라이버를 메모리에 올리자.
			Class.forName(driver);

			// 2. 데이터베이스와 연결하자
			con = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 관리자가 "MANAGER"인 사람들을 조회하는 메서드
	private void comboMgr() {

		try {
			// 1. sql문 만들기
			String sql = "select * from emp where job = ? order by empno";

			// 2. sql문 전송
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, "MANAGER");

			// 3. 실제 데이터베이스 상에서 쿼리문 실행
			rs = pstmt.executeQuery();

			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				jcb.addItem(empno + "[" + ename + "]");
			}

			rs.close();
			pstmt.close();
//			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 부서번호를 조회하는 메서드
	private void comboDept() {

		try {
			String sql = "select * from dept order by deptno";
			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				jcb1.addItem(deptno + "[" + dname + "]");
			}

			rs.close();
			pstmt.close();
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 전체 내역을 조회하는 메서드
	private void select() {
		try {
			String sql = "select * from emp order by hiredate desc";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				int empno = rs.getInt("empno");
				String name = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				String hiredate = rs.getString("hiredate").substring(0, 10);
				int sal = rs.getInt("sal");
				int comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");

				Object[] data = { empno, name, job, mgr, hiredate, sal, comm, deptno };
				model.addRow(data);
			}

			rs.close();
			pstmt.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 사원추가 버튼을 클릭 시 각각의 텍스트필드에 입력된 데이터를 emp 테이블에
	// 추가해 주는 작업
	private void insert() {

		try {
			String sql = "insert into emp values(?, ?, ?, ?, sysdate, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);

			int empno = Integer.parseInt(jtf1.getText());
			String ename = jtf2.getText();
			String job = jtf3.getText();
			int mgr = Integer.parseInt(jcb.getSelectedItem().toString().substring(0, 4));
			int sal = Integer.parseInt(jtf5.getText());
			int comm = Integer.parseInt(jtf6.getText());
			int deptno = Integer.parseInt(jcb1.getSelectedItem().toString().substring(0, 2));

			pstmt.setInt(1, empno);
			pstmt.setString(2, ename);
			pstmt.setString(3, job);
			pstmt.setInt(4, mgr);
			pstmt.setInt(5, sal);
			pstmt.setInt(6, comm);
			pstmt.setInt(7, deptno);

			int result = pstmt.executeUpdate();

			if (result > 0) {
				JOptionPane.showMessageDialog(null, "사원추가 성공");
			} else {
				JOptionPane.showMessageDialog(null, "사원추가 실패");
			}

			pstmt.close();
//			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void delete() {
		try {
			String sql = "delete from emp where empno = ?";
			pstmt = con.prepareStatement(sql);

			int row = table.getSelectedRow();

			// getValueAt(세로인덱스, 가로인덱스)
			// ==> 원하는 위치의 데이터를 가져오는 메서드
			pstmt.setInt(1, (int) model.getValueAt(row, 0));
			int result = pstmt.executeUpdate();

			if (result > 0) {
				JOptionPane.showMessageDialog(null, "사원삭제 성공");
			} else {
				JOptionPane.showMessageDialog(null, "사원삭제 실패");
			}

			model.removeRow(row); // 테이블 상의 한줄을 삭제하는 메서드

			pstmt.close();
			con.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new EMP();
	}
}
