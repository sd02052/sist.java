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
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;

public class MemberList extends JFrame {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MemberFind window = new MemberFind();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//
//		new MemberList();
//	}

	/**
	 * Create the application.
	 */
//	public MemberFind() {
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 */
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

		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
						{ new Integer(1), "이순신", "\uC774\uC21C\uC2E0123", "1234", "\uC774\uC21C\uC2E0", "1",
								new Integer(1) },
						{ new Integer(2), "김연아", "2", "5678", "2", "2", new Integer(2) },
						{ new Integer(3), "세종대왕", "3", "1234", "3", "3", new Integer(5000) }, },
				new String[] { "\uD68C\uC6D0\uBC88\uD638", "\uC774\uB984", "\uC544\uC774\uB514",
						"\uBE44\uBC00\uBC88\uD638", "\uB2C9\uB124\uC784", "\uBE44\uBC00\uBC88\uD638",
						"\uB9C8\uC77C\uB9AC\uC9C0" }) {
			Class[] columnTypes = new Class[] { Integer.class, String.class, String.class, String.class, String.class,
					String.class, Integer.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);

		JButton btnNewButton = new JButton("회원번호로 찾기");
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 98, 60));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FindNo((int) frame.getLocationOnScreen().getX() + 300,
						(int) frame.getLocationOnScreen().getY() + 200);
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
				new FindId((int) frame.getLocationOnScreen().getX() + 300,
						(int) frame.getLocationOnScreen().getY() + 200);
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
				new FindName((int) frame.getLocationOnScreen().getX() + 300,
						(int) frame.getLocationOnScreen().getY() + 200);
			}
		});
		btnNewButton_2.setBounds(813, 148, 142, 31);
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("닉네임으로 찾기");
		btnNewButton_3.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(0, 98, 60));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FindNickname((int) frame.getLocationOnScreen().getX() + 300,
						(int) frame.getLocationOnScreen().getY() + 200);
			}
		});
		btnNewButton_3.setBounds(813, 189, 142, 31);
		frame.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("삭제");
		btnNewButton_4.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(0, 98, 60));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MemberDelete((int) frame.getLocationOnScreen().getX() + 300,
						(int) frame.getLocationOnScreen().getY() + 200);
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
					new ManagerLogin();
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

}
