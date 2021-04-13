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
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;

public class SalesList extends JFrame {

	private JFrame frame;
	private JTable table;
	static DefaultTableModel model;
	static String year;
	static String month;
	static String date;
	static JLabel lblNewLabel_1;
	static JLabel lblNewLabel_4;
	static JLabel lblNewLabel_5;
	DecimalFormat format = new DecimalFormat("###,###");

	public SalesList() {

		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(15, 159, 78));
		frame.setResizable(false);
		frame.setBounds(200, 200, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(30, 66, 755, 474);
		frame.getContentPane().add(scrollPane_1);

		model = new DefaultTableModel(new String[] { "주문날짜", "주문메뉴", "수량", "금액", "결제방법" }, 0);
		table = new JTable(model);
		Order_win.createTable(table);
		model.setRowCount(0);
		scrollPane_1.setViewportView(table);

		JButton btnNewButton_5 = new JButton("날짜 선택");
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setBackground(new Color(0, 98, 60));
		btnNewButton_5.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnNewButton_5.setBorder(BorderFactory.createLineBorder(Color.decode("#00623C")));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Calender((int) (btnNewButton_5.getLocationOnScreen().getX() - 7),
						(int) (btnNewButton_5.getLocationOnScreen().getY()) + 30);
			}
		});
		btnNewButton_5.setBounds(813, 192, 142, 31);
		frame.getContentPane().add(btnNewButton_5);

		JLabel lblNewLabel = new JLabel("총 매출 : ");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel.setBounds(819, 275, 51, 15);
		frame.getContentPane().add(lblNewLabel);

		lblNewLabel_1 = new JLabel("0");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(872, 275, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("카드 : ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(829, 300, 41, 15);
		frame.getContentPane().add(lblNewLabel_2);

		lblNewLabel_4 = new JLabel("0");
		lblNewLabel_4.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(872, 300, 57, 15);
		frame.getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_3 = new JLabel("현금 : ");
		lblNewLabel_3.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(835, 325, 35, 15);
		frame.getContentPane().add(lblNewLabel_3);

		lblNewLabel_5 = new JLabel("0");
		lblNewLabel_5.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(872, 325, 57, 15);
		frame.getContentPane().add(lblNewLabel_5);

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
		searchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MemberList();
				frame.dispose();
			}
		});
		searchBtn.setForeground(Color.WHITE);
		searchBtn.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		searchBtn.setBorder(BorderFactory.createLineBorder(Color.decode("#00623C")));
		searchBtn.setBackground(new Color(0, 98, 60));
		searchBtn.setBounds(164, 17, 122, 30);
		frame.getContentPane().add(searchBtn);

		JButton salesBtn = new JButton("매출조회");
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

		JButton btnNewButton_5_1 = new JButton("전체 조회");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orderSelect();
				lblNewLabel_1.setText(format.format(totalPrice()));
				lblNewLabel_4.setText(format.format(cardPrice()));
				lblNewLabel_5.setText(format.format(moneyPrice()));
			}
		});
		btnNewButton_5_1.setForeground(Color.WHITE);
		btnNewButton_5_1.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnNewButton_5_1.setBorder(BorderFactory.createLineBorder(Color.decode("#00623C")));
		btnNewButton_5_1.setBackground(new Color(0, 98, 60));
		btnNewButton_5_1.setBounds(813, 137, 142, 31);
		frame.getContentPane().add(btnNewButton_5_1);

		frame.setVisible(true);
	}

	private void orderSelect() {
		model.setRowCount(0);
		try {
			String sql = "select * from order1 order by order_date desc";
			Main.db.pstmt = Main.db.con.prepareStatement(sql);

			Main.db.rs = Main.db.pstmt.executeQuery();

			while (Main.db.rs.next()) {
				String order_date = Main.db.rs.getString("order_date").substring(0, 10);
				String menu_name = Main.db.rs.getString("menu_name");
				int order_count = Main.db.rs.getInt("order_count");
				int order_total = Main.db.rs.getInt("order_total");
				String payment = Main.db.rs.getString("payment");
				Object[] data = { order_date, menu_name, order_count, format.format(order_total), payment };

				model.addRow(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private int totalPrice() {
		int total = 0;
		try {
			String sql = "select sum(order_total) from order1 ";

			Main.db.pstmt = Main.db.con.prepareStatement(sql);

			Main.db.rs = Main.db.pstmt.executeQuery();

			while (Main.db.rs.next()) {
				total = Main.db.rs.getInt(1);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}

	private int cardPrice() {
		int total = 0;
		try {
			String sql = "select sum(order_total) from order1 where payment ='카드'";

			Main.db.pstmt = Main.db.con.prepareStatement(sql);

			Main.db.rs = Main.db.pstmt.executeQuery();

			while (Main.db.rs.next()) {
				total = Main.db.rs.getInt(1);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}

	private int moneyPrice() {
		int total = 0;
		try {
			String sql = "select sum(order_total) from order1 where payment ='현금'";

			Main.db.pstmt = Main.db.con.prepareStatement(sql);

			Main.db.rs = Main.db.pstmt.executeQuery();

			while (Main.db.rs.next()) {
				total = Main.db.rs.getInt(1);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
}
