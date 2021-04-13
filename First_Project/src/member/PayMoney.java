package member;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import app.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PayMoney extends JFrame {

	private JPanel contentPane;
	private Color backColor = new Color(15, 159, 78);
	private Color buttonColor = new Color(0, 98, 60);
	private Color fontColor = new Color(255, 255, 255);
	Font font1 = new Font("맑은 고딕", Font.BOLD, 16);

	public PayMoney() {

		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 360);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(backColor);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("현금 결제가 완료되었습니다.");
		lblNewLabel.setFont(font1);
		lblNewLabel.setBounds(144, 138, 222, 16);
		lblNewLabel.setForeground(fontColor);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("결제 금액 : ");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lblNewLabel_1.setBounds(144, 102, 98, 16);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel(Order_win.textField.getText());
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lblNewLabel_2.setBounds(243, 102, 98, 15);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("원");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lblNewLabel_3.setBounds(353, 102, 28, 15);
		contentPane.add(lblNewLabel_3);

		JButton btnNewButton = new JButton("확인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertOrder();
				dispose();
			}
		});
		btnNewButton.setBackground(buttonColor);
		btnNewButton.setForeground(fontColor);
		btnNewButton.setFont(font1);
		btnNewButton.setBounds(183, 208, 117, 29);
		contentPane.add(btnNewButton);

		setVisible(true);

	}

	public void insertOrder() {
		int point = 0;
		try {
			String sql = "insert into order1 values(sysdate, ?, ?, ?, '현금')";
			String sql2 = "update member set mem_point = ? where mem_no = ?";
			String sql3 = "update member set mem_point = mem_point + ? where mem_no = ?";
			String sql4 = "select mem_point from member where mem_no = ?";
			String sql5 = "update order1 set order_count = order_count + ?, order_total = order_total + ? where to_char(order_date,'yyyy-mm-dd') like ''||?||'%' and menu_name = ? and payment = '현금'";

			for (int i = 0; i < Order_win.model.getRowCount(); i++) {
				String menu_name = String.valueOf(Order_win.table.getValueAt(i, 0));
				int order_count = (int) Order_win.table.getValueAt(i, 1);
				int order_total = (int) Order_win.table.getValueAt(i, 2);

				String date = date();
				if (findOrder(date, menu_name)) {
					Main.db.pstmt = Main.db.con.prepareStatement(sql5);
					Main.db.pstmt.setInt(1, order_count);
					Main.db.pstmt.setInt(2, order_total);
					Main.db.pstmt.setString(3, date);
					Main.db.pstmt.setString(4, menu_name);

					Main.db.pstmt.executeUpdate();

				} else {
					Main.db.pstmt = Main.db.con.prepareStatement(sql);
					Main.db.pstmt.setString(1, menu_name);
					Main.db.pstmt.setInt(2, order_count);
					Main.db.pstmt.setInt(3, order_total);

					Main.db.pstmt.executeUpdate();
				}
			}

			// db 포인트 변경
			Main.db.pstmt = Main.db.con.prepareStatement(sql2);
			Main.db.pstmt.setInt(1, Integer.parseInt(Order_win.textField_1.getText()));
			Main.db.pstmt.setInt(2, MemberLogin.member.getNo());
			Main.db.pstmt.executeQuery();

			// db 포인트 추가
			Main.db.pstmt = Main.db.con.prepareStatement(sql3);
			Main.db.pstmt.setInt(1, (int) ((Integer.parseInt(Order_win.textField.getText())) * 0.1));
			Main.db.pstmt.setInt(2, MemberLogin.member.getNo());
			Main.db.pstmt.executeQuery();

			// db 수정된 포인트 가져오기
			Main.db.pstmt = Main.db.con.prepareStatement(sql4);
			Main.db.pstmt.setInt(1, MemberLogin.member.getNo());
			Main.db.rs = Main.db.pstmt.executeQuery();
			while (Main.db.rs.next()) {
				point = Main.db.rs.getInt(1);
			}

			// member객체 포인트 변경
			MemberLogin.member.setMileage(point);

			Order_win.model.setRowCount(0);
			Order_win.textField.setText("0");
			Order_win.textField_1.setText(String.valueOf(MemberLogin.member.getMileage()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String date() {
		String date = "";
		try {
			String sql = "select to_char(sysdate, 'yyyy-mm-dd') from dual";
			Main.db.pstmt = Main.db.con.prepareStatement(sql);
			Main.db.rs = Main.db.pstmt.executeQuery();
			while (Main.db.rs.next()) {
				date = Main.db.rs.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}

	public boolean findOrder(String date, String name) {
		boolean state = false;
		try {
			String sql = "select * from order1 where to_char(order_date, 'yyyy-mm-dd') like ''||?||'%' and menu_name = ? and payment = '현금'";
			Main.db.pstmt = Main.db.con.prepareStatement(sql);
			Main.db.pstmt.setString(1, date);
			Main.db.pstmt.setString(2, name);
			Main.db.rs = Main.db.pstmt.executeQuery();

			while (Main.db.rs.next()) {
				state = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return state;
	}
}
