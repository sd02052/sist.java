package Lee;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;

public class MemberList {

	private JFrame frame;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberList window = new MemberList();
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
	public MemberList() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 972, 551);
		frame.getContentPane().add(tabbedPane);

		JPanel jp1 = new JPanel();
		jp1.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("메뉴변경", null, jp1, null);
		tabbedPane.setBackgroundAt(0, Color.WHITE);

		JPanel jp2 = new JPanel();
		jp2.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("회원정보 조회", null, jp2, null);
		tabbedPane.setBackgroundAt(1, Color.WHITE);
		jp2.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 27, 755, 474);
		jp2.add(scrollPane);

		table = new JTable();
		table.setBackground(SystemColor.inactiveCaption);
		table.setModel(
				new DefaultTableModel(
						new Object[][] {
								{ new Integer(1), "\uC774\uC21C\uC2E0123", "1234", "\uC774\uC21C\uC2E0", "1",
										new Integer(1) },
								{ new Integer(2), "2", "5678", "2", "2", new Integer(2) },
								{ new Integer(3), "3", "1234", "3", "3", new Integer(5000) }, },
						new String[] { "\uD68C\uC6D0\uBC88\uD638", "\uC544\uC774\uB514", "\uBE44\uBC00\uBC88\uD638",
								"\uB2C9\uB124\uC784", "\uBE44\uBC00\uBC88\uD638", "\uB9C8\uC77C\uB9AC\uC9C0" }) {
					Class[] columnTypes = new Class[] { Integer.class, String.class, String.class, String.class,
							String.class, Integer.class };

					public Class getColumnClass(int columnIndex) {
						return columnTypes[columnIndex];
					}
				});
		scrollPane.setViewportView(table);

		JButton btnNewButton = new JButton("회원번호로 찾기");
		btnNewButton.setBounds(813, 27, 142, 31);
		jp2.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("아이디로 찾기");
		btnNewButton_1.setBounds(813, 68, 142, 31);
		jp2.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("이름으로 찾기");
		btnNewButton_2.setBounds(813, 109, 142, 31);
		jp2.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("닉네임으로 찾기");
		btnNewButton_3.setBounds(813, 150, 142, 31);
		jp2.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("삭제");
		btnNewButton_4.setBounds(884, 469, 71, 31);
		jp2.add(btnNewButton_4);

		JPanel jp3 = new JPanel();
		jp3.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("매출 조회", null, jp3, null);
		tabbedPane.setBackgroundAt(2, Color.WHITE);
		jp3.setLayout(null);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 27, 755, 474);
		jp3.add(scrollPane_1);

		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "\uBA54\uB274\uBA85", "\uC218\uB7C9", "\uD310\uB9E4\uC561" }) {
			Class[] columnTypes = new Class[] { String.class, Integer.class, Integer.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_1.setViewportView(table_1);

		JButton btnNewButton_5 = new JButton("날짜 선택");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new aaa();
			}
		});
		btnNewButton_5.setBounds(813, 27, 142, 31);
		jp3.add(btnNewButton_5);

		JLabel lblNewLabel = new JLabel("총 매출 : ");
		lblNewLabel.setBounds(813, 134, 57, 15);
		jp3.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("1,000,000");
		lblNewLabel_1.setBounds(872, 134, 57, 15);
		jp3.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("카드 : ");
		lblNewLabel_2.setBounds(813, 159, 57, 15);
		jp3.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("현금 : ");
		lblNewLabel_3.setBounds(813, 184, 57, 15);
		jp3.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("800,000");
		lblNewLabel_4.setBounds(872, 159, 57, 15);
		jp3.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("200,000");
		lblNewLabel_5.setBounds(872, 184, 57, 15);
		jp3.add(lblNewLabel_5);

		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
