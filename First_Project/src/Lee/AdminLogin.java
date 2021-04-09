package Lee;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AdminLogin {

	private JFrame frame;
	private JPasswordField passwordField;
	private JTextField txtId;
	private JPanel panel;

	public AdminLogin() {
		frame = new JFrame();

		frame.setBounds(100, 100, 1000, 600); // 프레임 설정
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		Color c = new Color(15, 159, 78);
		frame.getContentPane().setBackground(c); // 배경색 지정

		passwordField = new JPasswordField(); // 비밀번호 패스워드 필드
		passwordField.setToolTipText("");
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setBounds(625, 202, 225, 42);
		frame.getContentPane().add(passwordField);

		txtId = new JTextField(); // ID 텍스트 필드
		txtId.setForeground(Color.BLACK);
		txtId.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				txtId.setText("");
			}

		});
		txtId.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		txtId.setText("ID");
		txtId.setHorizontalAlignment(SwingConstants.CENTER);
		txtId.setColumns(10);
		txtId.setBounds(625, 128, 225, 42);
		frame.getContentPane().add(txtId);

		JLabel lblNewLabel_5 = new JLabel("\uAD00\uB9AC\uC790 \uB85C\uADF8\uC778"); // 관리자 메뉴 라벨
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		lblNewLabel_5.setBackground(new Color(0, 98, 60));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(525, 42, 409, 58);
		frame.getContentPane().add(lblNewLabel_5);

		JButton btnNewButton_5 = new JButton("\uFF1C"); // 뒤로가기 버튼
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		btnNewButton_5.setBackground(new Color(15, 159, 78));
		btnNewButton_5.setBorder(BorderFactory.createLineBorder(new Color(15, 159, 78)));
		btnNewButton_5.addActionListener(new ActionListener() { // 뒤로가기 이벤트
			public void actionPerformed(ActionEvent e) {
				new MemberLogin();
				frame.dispose();
			}
		});
		btnNewButton_5.setBounds(33, 36, 168, 52);
		frame.getContentPane().add(btnNewButton_5);

		JButton btnNewButton_7 = new JButton("\uB85C\uADF8\uC778");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (check() == 1) {
					new MenuChange();
					frame.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "다시 입력해주세요.");
				}
			}
		});
		btnNewButton_7.setForeground(Color.WHITE);
		btnNewButton_7.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		btnNewButton_7.setBackground(new Color(0, 98, 60));
		btnNewButton_7.setBounds(600, 281, 273, 105);
		frame.getContentPane().add(btnNewButton_7);

		panel = new JPanel(); // 배경 이미지 삽입
		panel.setBounds(117, 145, 413, 319);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		JLabel lbl = new JLabel(new ImageIcon("Image/main.jpg"));
		lbl.setBounds(-35, -21, 476, 374);
		panel.add(lbl);

		frame.setVisible(true);

	}

	public int check() {

		int state = 0;

		try {

			String sql = "select * from admin where admin_id = '" + txtId.getText() + "' and admin_pwd='"
					+ passwordField.getText() + "'";
			Main.db.pstmt = Main.db.con.prepareStatement(sql);
			Main.db.rs = Main.db.pstmt.executeQuery();

			if (Main.db.rs.next() == true) {
				state = 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return state;
	}
}
