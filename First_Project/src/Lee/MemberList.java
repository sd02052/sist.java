package Lee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class MemberList {

	private JFrame frame;
	private JTable table;

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
		frame.setBounds(100, 100, 600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("메뉴변경", null, panel, null);
		tabbedPane.setBackgroundAt(0, Color.GRAY);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("회원정보 조회", null, panel_1, null);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 27, 367, 374);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{1, "\uC774\uC21C\uC2E0123", "1234", "\uC774\uC21C\uC2E0", "1", 1},
				{2, "2", "5678", "2", "2", 2},
				{3,"3","1234","3","3",5000}
			},
			new String[] {
				"\uD68C\uC6D0\uBC88\uD638", "\uC544\uC774\uB514", "\uBE44\uBC00\uBC88\uD638", "\uB2C9\uB124\uC784", "\uBE44\uBC00\uBC88\uD638", "\uB9C8\uC77C\uB9AC\uC9C0"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class, String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("회원번호로 찾기");
		btnNewButton.setBounds(409, 30, 142, 31);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("아이디로 찾기");
		btnNewButton_1.setBounds(409, 71, 142, 31);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("이름으로 찾기");
		btnNewButton_2.setBounds(409, 112, 142, 31);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("닉네임으로 찾기");
		btnNewButton_3.setBounds(409, 153, 142, 31);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("삭제");
		btnNewButton_4.setBounds(496, 370, 71, 31);
		panel_1.add(btnNewButton_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("매출 조회", null, panel_2, null);
	}
}
