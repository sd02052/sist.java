package Lee;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class FindName extends JFrame {

	private JFrame frame;
	private JTextField tfEnter;
	static JTable table;
	static DefaultTableModel model;
	static DecimalFormat format = new DecimalFormat("###,###");

	public FindName() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 300);
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 484, 25);
		frame.getContentPane().add(panel);
		panel.setBackground(new Color(12, 159, 78));
		JLabel lbTitle = new JLabel("이름을 입력하세요.");
		panel.add(lbTitle);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 25, 484, 36);
		panel_1.setBackground(new Color(12, 159, 78));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		tfEnter = new JTextField();
		tfEnter.setBounds(148, 6, 116, 21);
		panel_1.add(tfEnter);
		tfEnter.setColumns(10);

		JButton btnFind = new JButton("찾기");
		btnFind.setBounds(269, 5, 31, 23);
		btnFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memberFind(tfEnter.getText());
				tfEnter.setText("");
			}
		});
		panel_1.add(btnFind);
		btnFind.setForeground(Color.WHITE);
		btnFind.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		btnFind.setBorder(BorderFactory.createLineBorder(Color.decode("#00623C")));
		btnFind.setBackground(new Color(0, 98, 60));

		JButton btnClose = new JButton("닫기");
		btnClose.setBounds(305, 5, 31, 23);
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
		panel_2.setBackground(new Color(12, 159, 78));
		panel_2.setBounds(0, 60, 484, 201);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);

		String[] header = { "회원번호", "이름", "닉네임", "아이디", "비밀번호", "포인트" };
		model = new DefaultTableModel(header, 0);
		table = new JTable(model);
		JScrollPane scroll = new JScrollPane(table, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setBounds(12, 10, 460, 181);
		panel_2.add(scroll);
		Order_win.createTable(table);

		frame.setVisible(true);
	}

	private void memberFind(String id) {
		try {
			String sql = "select * from member where mem_name = ?";
			Main.db.pstmt = Main.db.con.prepareStatement(sql);
			Main.db.pstmt.setString(1, id);
			Main.db.rs = Main.db.pstmt.executeQuery();

			while (Main.db.rs.next()) {
				int mem_no = Main.db.rs.getInt("mem_no");
				String mem_name = Main.db.rs.getString("mem_name");
				String mem_nick = Main.db.rs.getString("mem_nick");
				String mem_id = Main.db.rs.getString("mem_id");
				String mem_pwd = Main.db.rs.getString("mem_pwd");
				int mem_point = Main.db.rs.getInt("mem_point");

				Object[] data = { mem_no, mem_name, mem_nick, mem_id, mem_pwd, format.format(mem_point) };

				model.addRow(data);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
