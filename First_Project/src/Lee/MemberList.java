package Lee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;

public class MemberList extends JFrame {

	private JFrame frame;
	private JTable table;
	private DefaultTableModel model;
	DecimalFormat format = new DecimalFormat("###,###");

	public MemberList() {
		frame = new JFrame();
		frame.setBounds(200, 200, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(15, 159, 78));
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 66, 755, 474);
		frame.getContentPane().add(scrollPane);

		model = new DefaultTableModel(new String[] { "회원번호", "이름", "닉네임", "아이디", "비밀번호", "포인트" }, 0);
		table = new JTable(model);
		scrollPane.setViewportView(table);
		model.setRowCount(0);
		Order_win.createTable(table);
		memberSelect();

		JButton btnNewButton = new JButton("회원번호로 찾기");
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 98, 60));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FindNo();
			}
		});
		btnNewButton.setBounds(813, 66, 142, 31);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("아이디로 찾기");
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 98, 60));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FindId();
			}
		});
		btnNewButton_1.setBounds(813, 107, 142, 31);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("이름으로 찾기");
		btnNewButton_2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(0, 98, 60));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FindName();
			}
		});
		btnNewButton_2.setBounds(813, 148, 142, 31);
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_4 = new JButton("삭제");
		btnNewButton_4.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(0, 98, 60));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (table.getSelectedRow() == -1) {
					JOptionPane.showMessageDialog(null, "삭제할 고객을 선택하세요.");
				} else {
					int result = JOptionPane.showConfirmDialog(null,
							model.getValueAt(table.getSelectedRow(), 1) + "고객을 삭제하시겠습니까?", "",
							JOptionPane.YES_NO_OPTION);
					if (result == JOptionPane.YES_OPTION) {
						memberDelete();
					}
				}
			}
		});
		btnNewButton_4.setBounds(884, 509, 71, 31);
		frame.getContentPane().add(btnNewButton_4);

		JButton menuChangeBtn = new JButton("메뉴변경");
		menuChangeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MenuChange();
				frame.dispose();
			}
		});
		menuChangeBtn.setForeground(Color.WHITE);
		menuChangeBtn.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		menuChangeBtn.setBorder(BorderFactory.createLineBorder(Color.decode("#00623C")));
		menuChangeBtn.setBackground(new Color(0, 98, 60));
		menuChangeBtn.setBounds(30, 17, 122, 30);
		frame.getContentPane().add(menuChangeBtn);

		JButton searchBtn = new JButton("회원정보조회");
		searchBtn.setForeground(Color.WHITE);
		searchBtn.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		searchBtn.setBorder(BorderFactory.createLineBorder(Color.decode("#00623C")));
		searchBtn.setBackground(new Color(0, 98, 60));
		searchBtn.setBounds(164, 17, 122, 30);
		frame.getContentPane().add(searchBtn);

		JButton salesBtn = new JButton("매출조회");
		salesBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SalesList();
				frame.dispose();
			}
		});
		salesBtn.setForeground(Color.WHITE);
		salesBtn.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		salesBtn.setBorder(BorderFactory.createLineBorder(Color.decode("#00623C")));
		salesBtn.setBackground(new Color(0, 98, 60));
		salesBtn.setBounds(298, 17, 122, 30);
		frame.getContentPane().add(salesBtn);

		JButton logoutBtn = new JButton("로그아웃");
		logoutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "로그아웃 하시겠습니까?", "로그아웃", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					new AdminLogin();
					frame.dispose();
				}
			}
		});
		logoutBtn.setForeground(Color.WHITE);
		logoutBtn.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		logoutBtn.setBorder(BorderFactory.createLineBorder(Color.decode("#00623C")));
		logoutBtn.setBackground(new Color(0, 98, 60));
		logoutBtn.setBounds(871, 17, 90, 30);
		frame.getContentPane().add(logoutBtn);

		frame.setVisible(true);
	}

	private void memberSelect() {

		try {
			String sql = "select * from member order by mem_no";

			Main.db.pstmt = Main.db.con.prepareStatement(sql);

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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void memberDelete() {

		try {
			String sql = "delete from member where mem_no = ?";

			Main.db.pstmt = Main.db.con.prepareStatement(sql);

			int row = table.getSelectedRow();

			Main.db.pstmt.setInt(1, (int) model.getValueAt(row, 0));

			int result = Main.db.pstmt.executeUpdate();

			model.removeRow(row);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
