package Lee;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FindId extends JFrame {

	private JFrame frame;
	private JTextField tfEnter;

	public FindId() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 200);
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		frame.setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setBackground(new Color(12, 159, 78));
		JLabel lbTitle = new JLabel("아이디를 입력하세요.");
		panel.add(lbTitle);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(12, 159, 78));
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);

		tfEnter = new JTextField();
		panel_1.add(tfEnter);
		tfEnter.setColumns(10);

		JButton btnFind = new JButton("찾기");
		btnFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnFind);
		btnFind.setForeground(Color.WHITE);
		btnFind.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		btnFind.setBorder(BorderFactory.createLineBorder(Color.decode("#00623C")));
		btnFind.setBackground(new Color(0, 98, 60));

		JButton btnClose = new JButton("닫기");
		btnClose.setForeground(Color.WHITE);
		btnClose.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		btnClose.setBorder(BorderFactory.createLineBorder(Color.decode("#00623C")));
		btnClose.setBackground(new Color(0, 98, 60));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		panel_1.add(btnClose);

		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.SOUTH);
		panel_2.setBackground(new Color(12, 159, 78));
		panel_2.setLayout(new GridLayout(6, 2, 0, 0));

		JLabel lbNo = new JLabel("회원번호 : ");
		lbNo.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lbNo);

		JLabel lbNo1 = new JLabel("New label");
		lbNo1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lbNo1);

		JLabel lbName = new JLabel("이름  : ");
		lbName.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lbName);

		JLabel lbName1 = new JLabel("New label");
		lbName1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lbName1);

		JLabel lbId = new JLabel("아이디 : ");
		lbId.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lbId);

		JLabel lbId1 = new JLabel("New label");
		lbId1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lbId1);

		JLabel lbNickname = new JLabel("닉네임 : ");
		lbNickname.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lbNickname);

		JLabel lbNickname1 = new JLabel("New label");
		lbNickname1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lbNickname1);

		JLabel lbPass = new JLabel("비밀번호 : ");
		lbPass.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lbPass);

		JLabel lbPass1 = new JLabel("New label");
		lbPass1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lbPass1);

		frame.setVisible(true);
	}

}
