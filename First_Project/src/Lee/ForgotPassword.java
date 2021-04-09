package Lee;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JPasswordField;

public class ForgotPassword {

	private JFrame frame;
	private JTextField txtNickname;
	private JTextField txtName;
	private JPanel panel;
	private JButton btnBack;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;

	public ForgotPassword() {
		frame = new JFrame(); // 프레임 설정
		frame.getContentPane().setFont(new Font("맑은 고딕", Font.BOLD, 12));
		frame.setBounds(100, 100, 1000, 600);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Color c = new Color(15, 159, 78);
		frame.getContentPane().setBackground(c); // 배경색 지정
		frame.getContentPane().setLayout(null);

		JLabel lblForgotPassword = new JLabel("계정 찾기"); // 비밀번호 찾기 라벨
		lblForgotPassword.setForeground(Color.WHITE);
		lblForgotPassword.setBounds(530, 42, 412, 58);
		lblForgotPassword.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		lblForgotPassword.setBackground(new Color(0, 98, 60));
		lblForgotPassword.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblForgotPassword);

		txtNickname = new JTextField(); // 닉네임 텍스트 필드
		txtNickname.setForeground(Color.BLACK);
		txtNickname.setBounds(625, 197, 225, 42);
		txtNickname.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				txtNickname.setText("");
			}

		});
		txtNickname.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		txtNickname.setBackground(Color.WHITE);
		txtNickname.setHorizontalAlignment(SwingConstants.CENTER);
		txtNickname.setColumns(10);
		frame.getContentPane().add(txtNickname);

		txtName = new JTextField(); // 이름 텍스트 필드
		txtName.setForeground(Color.BLACK);
		txtName.setBounds(625, 128, 225, 42);
		txtName.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				txtName.setText("");
			}

		});
		txtName.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		txtName.setBackground(Color.WHITE);
		txtName.setHorizontalAlignment(SwingConstants.CENTER);
		txtName.setColumns(10);
		frame.getContentPane().add(txtName);

		panel = new JPanel(); // 배경 이미지 삽입
		panel.setBounds(117, 145, 413, 319);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		JLabel lbl = new JLabel(new ImageIcon("Image/main.jpg"));
		lbl.setBounds(-35, -21, 476, 374);
		panel.add(lbl);

		btnBack = new JButton("\uFF1C");
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

		label = new JLabel("이름 : ");
		label.setBounds(577, 144, 36, 15);
		frame.getContentPane().add(label);

		label_1 = new JLabel("닉네임 : ");
		label_1.setBounds(565, 213, 48, 15);
		frame.getContentPane().add(label_1);

		label_2 = new JLabel("아이디 표시");
		label_2.setBounds(704, 379, 81, 15);
		frame.getContentPane().add(label_2);

		label_3 = new JLabel("비밀번호 표시");
		label_3.setBounds(704, 429, 81, 15);
		frame.getContentPane().add(label_3);

		JButton button = new JButton("찾기");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		button.setBackground(new Color(0, 98, 60));
		button.setBounds(688, 289, 97, 31);
		frame.getContentPane().add(button);

		frame.setVisible(true);
	}

}
