package Lee;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MenuChange {

	private JFrame frame;
	private JTable menuTable;
	private JButton searchBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuChange window = new MenuChange();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuChange() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// 메뉴변경 버튼
		JButton menuChangeBtn = new JButton("메뉴변경");
		menuChangeBtn.setBounds(30, 30, 122, 35);
		frame.getContentPane().add(menuChangeBtn);

		// 회원정보조회 버튼
		searchBtn = new JButton("회원정보조회");
		searchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MemberList();
				frame.dispose();
			}
		});
		searchBtn.setBounds(164, 30, 122, 35);
		frame.getContentPane().add(searchBtn);

		// 매출조회 버튼
		JButton salesBtn = new JButton("매출조회");
		salesBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SalesList();
				frame.dispose();
			}
		});
		salesBtn.setBounds(298, 30, 122, 35);
		frame.getContentPane().add(salesBtn);

		// 홈 버튼
		JButton homeBtn = new JButton("홈");
		homeBtn.setBounds(765, 30, 90, 35);
		frame.getContentPane().add(homeBtn);

		// 로그아웃 버튼
		JButton logoutBtn = new JButton("로그아웃");
		logoutBtn.setBounds(867, 30, 90, 35);
		frame.getContentPane().add(logoutBtn);

		// 메뉴테이블
		JScrollPane scroll = new JScrollPane((Component) null, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setBounds(31, 96, 623, 428);
		frame.getContentPane().add(scroll);

		menuTable = new JTable();
		menuTable.setModel(new DefaultTableModel(new Object[][] { { "빅맥", "5000원" }, { "1955버거", "6000원" },
				{ "상하이버거", "5500원" }, { "베이컨토마토디럭스", "6500원" } }, new String[] { "\uBA54\uB274", "\uAC00\uACA9" }) {
			Class[] columnTypes = new Class[] { String.class, Integer.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scroll.setViewportView(menuTable);

		// 메뉴수정 버튼
		JButton changeBtn = new JButton("수    정");
		changeBtn.setBounds(765, 96, 196, 42);
		frame.getContentPane().add(changeBtn);

		// 메뉴수정 버튼 이벤트
		changeBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				MenuChangePopup menuChange = new MenuChangePopup();
				menuChange.setLocationRelativeTo(null);
				menuChange.setVisible(true);
			}
		});

		// 메뉴삭제 버튼
		JButton deleteBtn = new JButton("삭    제");
		deleteBtn.setBounds(765, 155, 196, 42);
		frame.getContentPane().add(deleteBtn);

		// 메뉴삭제 버튼 이벤트
		deleteBtn.addActionListener(new ActionListener() { // ★★★★★★★★★★

			@Override
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "정말 삭제하시겠습니까?", "삭제", JOptionPane.YES_NO_OPTION);
			}
		});

		// 메뉴추가 버튼
		JButton addBtn = new JButton("추    가");
		addBtn.setBounds(765, 217, 196, 42);
		frame.getContentPane().add(addBtn);

		// 메뉴추가 버튼 이벤트
		addBtn.addActionListener(new ActionListener() { // ★★★★★★★★★★

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
