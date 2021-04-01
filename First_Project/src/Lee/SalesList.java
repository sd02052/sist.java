package Lee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SalesList extends JFrame {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					SalesList window = new SalesList();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
		new SalesList();
	}

	/**
	 * Create the application.
	 */
//	public SalesList() {
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	public SalesList() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(200, 200, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 77, 755, 474);
		frame.getContentPane().add(scrollPane_1);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "\uD310\uB9E4\uC561", "\uC218\uB7C9", "\uD310\uB9E4\uC561" }) {
			Class[] columnTypes = new Class[] { Integer.class, Integer.class, Integer.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_1.setViewportView(table);

		JButton btnNewButton_5 = new JButton("날짜 선택");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Calender((int) (btnNewButton_5.getLocationOnScreen().getX() - 7),
						(int) (btnNewButton_5.getLocationOnScreen().getY()) + 30);
			}
		});
		btnNewButton_5.setBounds(813, 77, 142, 31);
		frame.getContentPane().add(btnNewButton_5);

		JLabel lblNewLabel = new JLabel("총 매출 : ");
		lblNewLabel.setBounds(813, 184, 57, 15);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("1,000,000");
		lblNewLabel_1.setBounds(872, 184, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("카드 : ");
		lblNewLabel_2.setBounds(813, 209, 57, 15);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("현금 : ");
		lblNewLabel_3.setBounds(813, 234, 57, 15);
		frame.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("800,000");
		lblNewLabel_4.setBounds(872, 209, 57, 15);
		frame.getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("200,000");
		lblNewLabel_5.setBounds(872, 234, 57, 15);
		frame.getContentPane().add(lblNewLabel_5);

		JButton btnNewButton = new JButton("메뉴변경");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MenuChange();
				frame.dispose();
			}
		});
		btnNewButton.setBounds(12, 30, 97, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("회원정보 조회");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MemberList();
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(121, 30, 125, 23);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("매출 조회");
		btnNewButton_2.setBounds(258, 30, 97, 23);
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("로그아웃");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "로그아웃 하시겠습니까?", "로그아웃", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					new ManagerLogin();
					frame.dispose();
				}
			}
		});
		btnNewButton_3.setBounds(858, 30, 97, 23);
		frame.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("홈");
		btnNewButton_4.setBounds(789, 30, 57, 23);
		frame.getContentPane().add(btnNewButton_4);

		frame.setVisible(true);
	}
}
