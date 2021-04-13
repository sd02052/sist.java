package Lee;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class FindNo extends JFrame {

	private JFrame frame;
	private JTextField tfEnter;
	private JLabel lbNo1;
	private JLabel lbName1;
	private JLabel lbNick1;
	private JLabel lbId1;
	private JLabel lbPass1;
	private JLabel lbPoint1;

	public FindNo() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 200);
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		frame.setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setBackground(new Color(12, 159, 78));
		JLabel lbTitle = new JLabel("회원번호를 입력하세요.");
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
				memberFind(Integer.parseInt(tfEnter.getText()));
				tfEnter.setText("");
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
		panel_2.setLayout(new GridLayout(7, 2, 0, 0));

		JLabel lbNo = new JLabel("회원번호 : ");
		lbNo.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lbNo);

		lbNo1 = new JLabel("");
		lbNo1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lbNo1);

		JLabel lbName = new JLabel("이름  : ");
		lbName.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lbName);

		lbName1 = new JLabel("");
		lbName1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lbName1);

		JLabel lbNick = new JLabel("닉네임 : ");
		lbNick.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lbNick);

		lbNick1 = new JLabel("");
		lbNick1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lbNick1);

		JLabel lbId = new JLabel("아이디 : ");
		lbId.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lbId);

		lbId1 = new JLabel("");
		lbId1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lbId1);

		JLabel lbPass = new JLabel("비밀번호 : ");
		lbPass.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lbPass);

		lbPass1 = new JLabel("");
		lbPass1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lbPass1);

		JLabel lbPoint = new JLabel("포인트 : ");
		lbPoint.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lbPoint);

		lbPoint1 = new JLabel("");
		panel_2.add(lbPoint1);

		frame.setVisible(true);
	}

	private void memberFind(int no) {
		try {
			String sql = "select * from member where mem_no = ?";
			Main.db.pstmt = Main.db.con.prepareStatement(sql);
			Main.db.pstmt.setInt(1, no);
			Main.db.rs = Main.db.pstmt.executeQuery();

			while (Main.db.rs.next()) {
				int mem_no = Main.db.rs.getInt("mem_no");
				String mem_name = Main.db.rs.getString("mem_name");
				String mem_nick = Main.db.rs.getString("mem_nick");
				String mem_id = Main.db.rs.getString("mem_id");
				String mem_pwd = Main.db.rs.getString("mem_pwd");
				int mem_point = Main.db.rs.getInt("mem_point");

				lbNo1.setText(mem_no + "");
				lbName1.setText(mem_name);
				lbNick1.setText(mem_nick);
				lbId1.setText(mem_id);
				lbPass1.setText(mem_pwd);
				lbPoint1.setText(mem_point + "");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
