package Lee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberFind extends JFrame {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

		new MemberFind();
	}

	/**
	 * Create the application.
	 */
//	public MemberFind() {
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	public MemberFind() {
		frame = new JFrame();
		frame.setBounds(200, 200, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 77, 755, 474);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		table.setBackground(SystemColor.inactiveCaption);
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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FindNo((int) frame.getLocationOnScreen().getX() + 300,
						(int) frame.getLocationOnScreen().getY() + 200);
			}
		});
		btnNewButton.setBounds(813, 77, 142, 31);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("아이디로 찾기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FindId((int) frame.getLocationOnScreen().getX() + 300,
						(int) frame.getLocationOnScreen().getY() + 200);
			}
		});
		btnNewButton_1.setBounds(813, 118, 142, 31);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("이름으로 찾기");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FindName((int) frame.getLocationOnScreen().getX() + 300,
						(int) frame.getLocationOnScreen().getY() + 200);
			}
		});
		btnNewButton_2.setBounds(813, 159, 142, 31);
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("닉네임으로 찾기");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FindNickname((int) frame.getLocationOnScreen().getX() + 300,
						(int) frame.getLocationOnScreen().getY() + 200);
			}
		});
		btnNewButton_3.setBounds(813, 200, 142, 31);
		frame.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("삭제");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MemberDelete((int) frame.getLocationOnScreen().getX() + 300,
						(int) frame.getLocationOnScreen().getY() + 200);
			}
		});
		btnNewButton_4.setBounds(884, 519, 71, 31);
		frame.getContentPane().add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("메뉴변경");
		btnNewButton_5.setBounds(12, 30, 97, 23);
		frame.getContentPane().add(btnNewButton_5);

		JButton btnNewButton_1_1 = new JButton("회원정보 조회");
		btnNewButton_1_1.setBounds(121, 30, 109, 23);
		frame.getContentPane().add(btnNewButton_1_1);

		JButton btnNewButton_2_1 = new JButton("매출 조회");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SalesList();
				frame.dispose();
			}
		});
		btnNewButton_2_1.setBounds(242, 30, 97, 23);
		frame.getContentPane().add(btnNewButton_2_1);

		JButton btnNewButton_4_1 = new JButton("홈");
		btnNewButton_4_1.setBounds(789, 30, 57, 23);
		frame.getContentPane().add(btnNewButton_4_1);

		JButton btnNewButton_3_1 = new JButton("로그아웃");
		btnNewButton_3_1.setBounds(858, 30, 97, 23);
		frame.getContentPane().add(btnNewButton_3_1);

		frame.setVisible(true);
	}

}
