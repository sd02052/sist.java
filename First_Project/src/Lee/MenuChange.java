package Lee;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MenuChange {

	private JFrame frame;
	private JTable menuTable;
	private JButton searchBtn;

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
		JScrollPane scroll = new JScrollPane((Component) null, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setBounds(30, 66, 755, 474);
		frame.getContentPane().add(scroll);

		menuTable = new JTable();
		menuTable
				.setModel(
						new DefaultTableModel(
								new Object[][] { { "아메리카노", "4100원" }, { "스타벅스 돌체라떼", "5600원" },
										{ "바닐라 플랫 화이트", "5600원" }, { "자몽 허니 블랙 티", "5300원" } },
								new String[] { "\uBA54\uB274", "\uAC00\uACA9" }) {
							Class[] columnTypes = new Class[] { String.class, Integer.class };

							public Class getColumnClass(int columnIndex) {
								return columnTypes[columnIndex];
							}
						});
		scroll.setViewportView(menuTable);

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

				MenuChangePopup menuChange = new MenuChangePopup();
				menuChange.setLocationRelativeTo(null);
				menuChange.setVisible(true);
			}
		});

		// 메뉴삭제 버튼 이벤트
		deleteBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "정말 삭제하시겠습니까?", "삭제", JOptionPane.YES_NO_OPTION);
			}
		});

		// 메뉴추가 버튼 이벤트
		addBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				MenuAddPopup menuAdd = new MenuAddPopup();
				menuAdd.setLocationRelativeTo(null);
				menuAdd.setVisible(true);
			}
		});

		frame.setVisible(true);

	}

}
