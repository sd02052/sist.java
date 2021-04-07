package Lee;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import javax.swing.*;

public class MemberLogin extends JFrame {

	private JFrame frame;
	private JTextField txtId;
	private JPasswordField passwordField_1;
	private JPanel panel;

	public MemberLogin() {

		frame = new JFrame();

		frame.setBounds(100, 100, 1000, 600);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		Color c = new Color(15, 159, 78);
		frame.getContentPane().setBackground(c);

		JButton btnNewButton_3 = new JButton("\uACC4\uC815 \uC0DD\uC131");
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setFont(new Font("맑은 고딕", Font.BOLD, 19));
		btnNewButton_3.addActionListener(new ActionListener() { // 회원가입 메뉴 이벤트
			public void actionPerformed(ActionEvent e) {
				new CreateAccount();
				frame.dispose();
			}
		});
		btnNewButton_3.setBounds(648, 397, 213, 42);
		btnNewButton_3.setBackground(new Color(15, 159, 78));
		btnNewButton_3.setBorder(BorderFactory.createLineBorder(c));
		frame.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_1 = new JButton("\uBE44\uBC00\uBC88\uD638 \uCC3E\uAE30");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() { // 비밀번호 찾기 이벤트
			public void actionPerformed(ActionEvent e) {
				new ForgotPassword();
				frame.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 19));
		btnNewButton_1.setBackground(new Color(15, 159, 78));
		btnNewButton_1.setBounds(648, 449, 213, 42);
		btnNewButton_1.setBorder(BorderFactory.createLineBorder(c));
		frame.getContentPane().add(btnNewButton_1);

		txtId = new JTextField(); // ID 텍스트 필드
		txtId.setForeground(Color.BLACK);
		txtId.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		txtId.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				txtId.setText("");
			}

		});
		txtId.setText("ID");
		txtId.setHorizontalAlignment(SwingConstants.CENTER);
		txtId.setColumns(10);
		txtId.setBounds(625, 128, 225, 42);
		frame.getContentPane().add(txtId);

		JLabel lblNewLabel = new JLabel("STARBUCKS"); // 회원로그인 라벨
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		lblNewLabel.setBounds(493, 42, 473, 58);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton_7 = new JButton("\uB85C\uADF8\uC778"); // 로그인 버튼
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MemberHome();
				frame.dispose();
			}
		});
		btnNewButton_7.setForeground(Color.WHITE);
		btnNewButton_7.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		btnNewButton_7.setBackground(new Color(0, 98, 60));
		btnNewButton_7.setBounds(607, 265, 273, 105);
		frame.getContentPane().add(btnNewButton_7);

		passwordField_1 = new JPasswordField(); // 비밀번호 필드
		passwordField_1.setToolTipText("");
		passwordField_1.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField_1.setBounds(625, 193, 225, 42);
		frame.getContentPane().add(passwordField_1);

		JButton btnNewButton_5 = new JButton("관리자 로그인");
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setFont(new Font("맑은 고딕", Font.BOLD, 19));
		btnNewButton_5.setBackground(c);
		btnNewButton_5.setBorder(BorderFactory.createLineBorder(c));
		btnNewButton_5.setBounds(33, 36, 168, 52);
		btnNewButton_5.addActionListener(new ActionListener() { // 뒤로가기 이벤트
			public void actionPerformed(ActionEvent e) {
				new AdminLogin();
				frame.dispose();
			}
		});
		frame.getContentPane().add(btnNewButton_5);

		panel = new JPanel(); // 배경 이미지 삽입
		panel.setBounds(117, 145, 413, 319);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		JLabel lbl = new JLabel(new ImageIcon("Image/main.jpg"));
		lbl.setBounds(-35, -21, 476, 374);
		panel.add(lbl);

		frame.setVisible(true);

	}
}
