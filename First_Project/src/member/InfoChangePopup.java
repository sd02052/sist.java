package member;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import app.Main;

public class InfoChangePopup extends JDialog {

	private final JPanel Panel = new JPanel();
	private JTextField nickText;
	private JTextField pwText;

	public InfoChangePopup() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(Panel, BorderLayout.CENTER);
		Panel.setLayout(null);
		Panel.setBackground(new Color(15, 159, 78));
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);

		// 컴포넌트
		// 닉네임 레이블 /텍스트필드
		JLabel nicknameLbl = new JLabel("닉네임 : ");
		nicknameLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		nicknameLbl.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		nicknameLbl.setForeground(Color.WHITE);
		nicknameLbl.setBounds(114, 60, 67, 15);
		Panel.add(nicknameLbl);

		nickText = new JTextField(MemberLogin.member.getNickName());
		nickText.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		nickText.setBounds(210, 57, 118, 21);
		Panel.add(nickText);
		nickText.setColumns(10);

		// 비밀번호 레이블/텍스트필드
		JLabel passwordLbl = new JLabel("비밀번호 : ");
		passwordLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		passwordLbl.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		passwordLbl.setForeground(Color.WHITE);
		passwordLbl.setBounds(114, 113, 67, 15);
		Panel.add(passwordLbl);

		pwText = new JTextField(MemberLogin.member.getPass());
		pwText.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		pwText.setBounds(210, 110, 118, 21);
		Panel.add(pwText);
		pwText.setColumns(10);

		// 확인 버튼
		JButton confirmBtn = new JButton("확   인");
		confirmBtn.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		confirmBtn.setForeground(Color.WHITE);
		confirmBtn.setBounds(114, 180, 97, 23);
		confirmBtn.setBackground(new Color(0, 98, 60));
		confirmBtn.setBorder(BorderFactory.createLineBorder(Color.decode("#00623C")));
		Panel.add(confirmBtn);

		// 취소 버튼
		JButton cancelBtn = new JButton("취   소");
		cancelBtn.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		cancelBtn.setForeground(Color.WHITE);
		cancelBtn.setBounds(230, 180, 97, 23);
		cancelBtn.setBackground(new Color(0, 98, 60));
		cancelBtn.setBorder(BorderFactory.createLineBorder(Color.decode("#00623C")));
		Panel.add(cancelBtn);

		JLabel nicknameLbl_1 = new JLabel("회원번호 : ");
		nicknameLbl_1.setHorizontalAlignment(SwingConstants.RIGHT);
		nicknameLbl_1.setForeground(Color.WHITE);
		nicknameLbl_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		nicknameLbl_1.setBounds(114, 10, 67, 15);
		Panel.add(nicknameLbl_1);

		JLabel lblNewLabel = new JLabel(MemberLogin.member.getNo() + "");
		lblNewLabel.setBounds(210, 11, 97, 15);
		Panel.add(lblNewLabel);

		JLabel nicknameLbl_1_1 = new JLabel("이름 : ");
		nicknameLbl_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		nicknameLbl_1_1.setForeground(Color.WHITE);
		nicknameLbl_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		nicknameLbl_1_1.setBounds(114, 35, 67, 15);
		Panel.add(nicknameLbl_1_1);

		JLabel lblNewLabel_1 = new JLabel(MemberLogin.member.getName());
		lblNewLabel_1.setBounds(210, 36, 97, 15);
		Panel.add(lblNewLabel_1);

		JLabel nicknameLbl_2 = new JLabel("아이디 : ");
		nicknameLbl_2.setHorizontalAlignment(SwingConstants.RIGHT);
		nicknameLbl_2.setForeground(Color.WHITE);
		nicknameLbl_2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		nicknameLbl_2.setBounds(114, 85, 67, 15);
		Panel.add(nicknameLbl_2);

		JLabel lblNewLabel_1_1 = new JLabel(MemberLogin.member.getId());
		lblNewLabel_1_1.setBounds(210, 88, 97, 15);
		Panel.add(lblNewLabel_1_1);

		JLabel nicknameLbl_2_1 = new JLabel("포인트 : ");
		nicknameLbl_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		nicknameLbl_2_1.setForeground(Color.WHITE);
		nicknameLbl_2_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		nicknameLbl_2_1.setBounds(114, 138, 67, 15);
		Panel.add(nicknameLbl_2_1);

		JLabel lblNewLabel_1_1_1 = new JLabel(MemberLogin.member.getMileage() + "");
		lblNewLabel_1_1_1.setBounds(210, 141, 97, 15);
		Panel.add(lblNewLabel_1_1_1);

		// 이벤트
		// 확인 버튼 이벤트
		confirmBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				update();
				dispose();

			}
		});

		// 취소 버튼 이벤트
		cancelBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

	}

	// 회원정보(닉네임/패스워드) 수정 메서드
	private void update() {
		try {
			String sql = "update member set mem_nick = ?, mem_pwd = ? where mem_no = ?";
			Main.db.pstmt = Main.db.con.prepareStatement(sql);

			String nickname = nickText.getText();
			String password = pwText.getText();

			Main.db.pstmt.setString(1, nickname);
			Main.db.pstmt.setString(2, password);
			Main.db.pstmt.setInt(3, MemberLogin.member.getNo());

			int result = Main.db.pstmt.executeUpdate();
			MemberLogin.member.setNickName(nickname);
			MemberLogin.member.setPass(password);

			if (result > 0) {
				JOptionPane.showMessageDialog(null, "회원 정보를 수정하였습니다.");
			} else {
				JOptionPane.showMessageDialog(null, "회원 정보 수정에 실패하였습니다.");
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
