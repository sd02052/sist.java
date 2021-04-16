package member;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import app.Main;

import java.awt.ComponentOrientation;
import javax.swing.JPasswordField;

public class CreateAccount {

	private JFrame frame;
	private JTextField txtId;
	private JTextField txtName;
	private JTextField txtNickname;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPanel panel;

	public CreateAccount() {
		frame = new JFrame(); // 프레임 설정
		frame.setBounds(100, 100, 1000, 600);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color c = new Color(15, 159, 78);
		frame.getContentPane().setBackground(c);

		txtId = new JTextField(); // ID 텍스트 필드
		txtId.setForeground(Color.BLACK);
		txtId.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		txtId.setBackground(Color.WHITE);
		txtId.setBounds(681, 128, 225, 42);
		txtId.setHorizontalAlignment(SwingConstants.LEFT);
		txtId.setColumns(10);
		frame.getContentPane().add(txtId);

		txtName = new JTextField(); // 이름 텍스트 필드
		txtName.setForeground(Color.BLACK);
		txtName.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		txtName.setBackground(Color.WHITE);
		txtName.setBounds(681, 290, 225, 42);
		txtName.setHorizontalAlignment(SwingConstants.LEFT);
		txtName.setColumns(10);
		frame.getContentPane().add(txtName);

		txtNickname = new JTextField(); // 닉네임 텍스트 필드
		txtNickname.setForeground(Color.BLACK);
		txtNickname.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		txtNickname.setBackground(Color.WHITE);
		txtNickname.setBounds(681, 344, 225, 42);
		txtNickname.setHorizontalAlignment(SwingConstants.LEFT);
		txtNickname.setColumns(10);
		frame.getContentPane().add(txtNickname);

		JLabel lblNewLabel = new JLabel("\uACC4\uC815 \uC0DD\uC131"); // 새 계정 생성 라벨
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(605, 42, 260, 58);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		lblNewLabel.setBackground(new Color(0, 98, 60));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("\uD655\uC778"); // 계정 생성 버튼
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		btnNewButton.setBackground(new Color(0, 98, 60));
		btnNewButton.setBounds(625, 425, 225, 77);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insert();
			}
		});
		frame.getContentPane().add(btnNewButton);

		JButton btnBack = new JButton("\uFF1C"); // 뒤로가기 버튼
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		btnBack.setBackground(new Color(15, 159, 78));
		btnBack.setBounds(27, 17, 90, 83);
		btnBack.addActionListener(new ActionListener() { // 뒤로가기 이벤트
			public void actionPerformed(ActionEvent e) {
				new MemberLogin();
				frame.dispose();
			}
		});
		frame.getContentPane().add(btnBack);

		passwordField = new JPasswordField(); // 비밀번호 입력
		passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		passwordField.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		passwordField.setBackground(Color.WHITE);
		passwordField.setBounds(681, 180, 225, 42);
		frame.getContentPane().add(passwordField);

		passwordField_1 = new JPasswordField(); // 비밀번호 입력 확인
		passwordField_1.setHorizontalAlignment(SwingConstants.LEFT);
		passwordField_1.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		passwordField_1.setBackground(Color.WHITE);
		passwordField_1.setBounds(681, 232, 225, 42);
		frame.getContentPane().add(passwordField_1);

		panel = new JPanel(); // 배경 이미지 삽입
		panel.setBounds(117, 145, 413, 319);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		JLabel lbl = new JLabel(new ImageIcon("Image/main.jpg"));
		lbl.setBounds(-35, -21, 476, 374);
		panel.add(lbl);

		JLabel lblId = new JLabel("아이디 : ");
		lblId.setBounds(616, 144, 53, 15);
		frame.getContentPane().add(lblId);

		JLabel lblPassword = new JLabel("비밀번호 : ");
		lblPassword.setBounds(604, 196, 65, 15);
		frame.getContentPane().add(lblPassword);

		JLabel lblId_1 = new JLabel("비밀번호 확인 : ");
		lblId_1.setBounds(579, 248, 90, 15);
		frame.getContentPane().add(lblId_1);

		JLabel lblId_1_1 = new JLabel("이름 : ");
		lblId_1_1.setBounds(627, 306, 42, 15);
		frame.getContentPane().add(lblId_1_1);

		JLabel lblId_1_2 = new JLabel("닉네임 : ");
		lblId_1_2.setBounds(616, 360, 53, 15);
		frame.getContentPane().add(lblId_1_2);

		frame.setVisible(true);

	}

	// 회원 추가
	private void insert() {

		try {
			if (txtId.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "아이디를 입력해주세요.");
			} else if (checkInputOnlyNumberAndAlphabet(txtId.getText())) {
				JOptionPane.showMessageDialog(null, "영문(대, 소문자)이나 숫자만 입력해주세요.");
			} else if (passwordField.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "비밀번호를 입력해주세요.");
			} else if (passwordField_1.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "비밀번호를 확인해주세요.");
			} else if (checkPass() == false) {
				JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.");
			} else if (txtName.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "이름을 입력해주세요.");
			} else if (txtNickname.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "닉네임을 입력해주세요.");
			} else if (checkId() == 1) {
				JOptionPane.showMessageDialog(null, "해당 Id는 이미 존재합니다.");
			} else {
				String sql = "insert into member values(mem_seq.nextval,?,?,?,?,?)";

				Main.db.pstmt = Main.db.con.prepareStatement(sql);

				String memName = txtName.getText();
				String memNick = txtNickname.getText();
				String memId = txtId.getText();
				String memPwd = passwordField.getText();
				int memPoint = 0;

				Main.db.pstmt.setString(1, memName);
				Main.db.pstmt.setString(2, memNick);
				Main.db.pstmt.setString(3, memId);
				Main.db.pstmt.setString(4, memPwd);
				Main.db.pstmt.setInt(5, memPoint);

				int result = Main.db.pstmt.executeUpdate();
				if (result > 0) {
					JOptionPane.showMessageDialog(null, "회원가입에 성공하였습니다.");
					frame.dispose();
					new MemberLogin();

				} else {
					JOptionPane.showMessageDialog(null, "회원가입에 실패 했습니다.");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 아이디 중복 체크
	private int checkId() {

		int state = 0;

		try {

			String sql = "select * from member where mem_id = ?";
			Main.db.pstmt = Main.db.con.prepareStatement(sql);
			Main.db.pstmt.setString(1, txtId.getText());
			Main.db.rs = Main.db.pstmt.executeQuery();

			if (Main.db.rs.next() == true) {
				state = 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return state;
	}

	// 비밀번호랑 비밀번호확인 텍스트필드가 같은지 검사
	private boolean checkPass() {
		if (passwordField.getText().equals(passwordField_1.getText())) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkInputOnlyNumberAndAlphabet(String textInput) {
		char chrInput;
		for (int i = 0; i < textInput.length(); i++) {
			chrInput = textInput.charAt(i); // 입력받은 텍스트에서 문자 하나하나 가져와서 체크

			if (chrInput >= 0x61 && chrInput <= 0x7A) {
				// 영문(소문자) OK!
			} else if (chrInput >= 0x41 && chrInput <= 0x5A) {
				// 영문(대문자) OK!
			} else if (chrInput >= 0x30 && chrInput <= 0x39) {
				// 숫자 OK!
			} else {
				return true; // 영문자도 아니고 숫자도 아님!
			}
		}
		return false;
	}

}
