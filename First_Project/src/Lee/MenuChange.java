package Lee;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class MenuChange {

	private JFrame frame;
	private JButton searchBtn;
	static JTable menuTable;
	static DefaultTableModel model;

	public MenuChange() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(new Color(15, 159, 78));
		frame.setLocationRelativeTo(null);

		// 컴포넌트
		// 메뉴변경 버튼
		JButton menuChangeBtn = new JButton("메뉴변경");
		menuChangeBtn.setForeground(Color.WHITE);
		menuChangeBtn.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		menuChangeBtn.setBounds(30, 17, 122, 30);
		frame.getContentPane().add(menuChangeBtn);
		menuChangeBtn.setBackground(new Color(0, 98, 60));
		menuChangeBtn.setBorder(BorderFactory.createLineBorder(Color.decode("#00623C")));

		// 회원정보조회 버튼
		searchBtn = new JButton("회원정보조회");
		searchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MemberList();
				frame.dispose();
			}
		});
		searchBtn.setForeground(Color.WHITE);
		searchBtn.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		searchBtn.setBounds(164, 17, 122, 30);
		frame.getContentPane().add(searchBtn);
		searchBtn.setBackground(new Color(0, 98, 60));
		searchBtn.setBorder(BorderFactory.createLineBorder(Color.decode("#00623C")));

		// 매출조회 버튼
		JButton salesBtn = new JButton("매출조회");
		salesBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SalesList();
				frame.dispose();
			}
		});
		salesBtn.setForeground(Color.WHITE);
		salesBtn.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		salesBtn.setBounds(298, 17, 122, 30);
		frame.getContentPane().add(salesBtn);
		salesBtn.setBackground(new Color(0, 98, 60));
		salesBtn.setBorder(BorderFactory.createLineBorder(Color.decode("#00623C")));

		// 로그아웃 버튼
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
		logoutBtn.setBounds(871, 17, 90, 30);
		frame.getContentPane().add(logoutBtn);
		logoutBtn.setBackground(new Color(0, 98, 60));
		logoutBtn.setBorder(BorderFactory.createLineBorder(Color.decode("#00623C")));

		// 메뉴테이블
		String[] header = { "메뉴", "가격" };
		model = new DefaultTableModel(header, 0);
		menuTable = new JTable(model);
		JScrollPane scroll = new JScrollPane(menuTable, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setBounds(30, 66, 755, 474);
		frame.getContentPane().add(scroll);
		Order_win.createTable(menuTable);
		select();


		// 메뉴수정 버튼
		JButton changeBtn = new JButton("수    정");
		changeBtn.setForeground(Color.WHITE);
		changeBtn.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		changeBtn.setBounds(811, 66, 150, 35);
		frame.getContentPane().add(changeBtn);
		changeBtn.setBackground(new Color(0, 98, 60));
		changeBtn.setBorder(BorderFactory.createLineBorder(Color.decode("#00623C")));

		// 메뉴삭제 버튼
		JButton deleteBtn = new JButton("삭    제");
		deleteBtn.setForeground(Color.WHITE);
		deleteBtn.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		deleteBtn.setBounds(811, 113, 150, 35);
		frame.getContentPane().add(deleteBtn);
		deleteBtn.setBackground(new Color(0, 98, 60));
		deleteBtn.setBorder(BorderFactory.createLineBorder(Color.decode("#00623C")));

		// 메뉴추가 버튼
		JButton addBtn = new JButton("추    가");
		addBtn.setForeground(Color.WHITE);
		addBtn.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		addBtn.setBounds(811, 158, 150, 35);
		frame.getContentPane().add(addBtn);
		addBtn.setBackground(new Color(0, 98, 60));
		addBtn.setBorder(BorderFactory.createLineBorder(Color.decode("#00623C")));

		// 이벤트
		// 메뉴수정 버튼 이벤트
		changeBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (menuTable.getSelectedRow() == -1) {
					JOptionPane.showMessageDialog(null, "수정할 메뉴를 선택하세요..");
				} else {
					new MenuChangePopup();
				}
			}
		});

		// 메뉴삭제 버튼 이벤트
		deleteBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (menuTable.getSelectedRow() == -1) {
					JOptionPane.showMessageDialog(null, "삭제할 메뉴를 선택하세요.");
				} else {
					int result = JOptionPane.showConfirmDialog(null, "정말 삭제하시겠습니까?", "삭제", JOptionPane.YES_NO_OPTION);
					if (result == JOptionPane.YES_OPTION) {
						delete();
					}
				}
			}
		});

		// 메뉴추가 버튼 이벤트
		addBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				new MenuAddPopup();
			}
		});

		frame.setVisible(true);

	}

	// 테이블에 메뉴리스트 보여주는 메서드
	public void select() {

		try {
			String sql = "select * from menu";

			Main.db.pstmt = Main.db.con.prepareStatement(sql);

			Main.db.rs = Main.db.pstmt.executeQuery();

			while (Main.db.rs.next()) {
				String menuName = Main.db.rs.getString("menu_name");
				int menuPrice = Main.db.rs.getInt("menu_price");

				Object[] data = { menuName, menuPrice };

				model.addRow(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 메뉴삭제 메서드
	private void delete() {
		try {
			String sql = "delete from menu where menu_name = ?";

			Main.db.pstmt = Main.db.con.prepareStatement(sql);

			int row = menuTable.getSelectedRow();

			Main.db.pstmt.setString(1, (String) model.getValueAt(row, 0));

			int result = Main.db.pstmt.executeUpdate();

			model.removeRow(row);

			if (result > 0) {
				JOptionPane.showMessageDialog(null, "메뉴를 삭제하였습니다.");
			} else {
				JOptionPane.showMessageDialog(null, "메뉴 삭제를 실패하였습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
