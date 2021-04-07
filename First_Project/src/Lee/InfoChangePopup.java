package Lee;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

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
		nicknameLbl.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		nicknameLbl.setForeground(Color.WHITE);
		nicknameLbl.setBounds(114, 79, 67, 15);
		Panel.add(nicknameLbl);

		nickText = new JTextField();
		nickText.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		nickText.setBounds(210, 76, 118, 21);
		Panel.add(nickText);
		nickText.setColumns(10);

		// 비밀번호 레이블/텍스트필드
		JLabel passwordLbl = new JLabel("비밀번호 : ");
		passwordLbl.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		passwordLbl.setForeground(Color.WHITE);
		passwordLbl.setBounds(114, 113, 75, 15);
		Panel.add(passwordLbl);

		pwText = new JTextField();
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

		// 이벤트
		// 확인 버튼 이벤트
		confirmBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

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

}
