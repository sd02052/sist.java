//package Lee;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.*;
//
//import javax.swing.*;
//import javax.swing.border.EmptyBorder;
//import javax.swing.table.DefaultTableModel;
//
//public class Order_win extends JFrame {
//
//	private JPanel contentPane;
//	private JTable table;
//	private JTable table_1;
//	private JTextField textField;
//	private JTextField textField_1;
//	private Color backColor = new Color(15, 159, 78);
//	private Color buttonColor = new Color(0, 98, 60);
//	private Color fontColor = new Color(255, 255, 255);
//	private Font font = new Font("맑은 고딕", Font.BOLD, 20);
//	private Font font1 = new Font("맑은 고딕", Font.BOLD, 16);
//
//	public Order_win() {
//
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setTitle("주문창");
//		setBounds(100, 100, 1000, 600);
//		setLocationRelativeTo(null);
//
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		contentPane.setBackground(backColor);
//		setContentPane(contentPane);
//		contentPane.setLayout(null);
//
//		// 메뉴 버튼
//
//		// 상단 4개
//		JButton btnNewButton_1 = new JButton("New button");
//		btnNewButton_1.setBounds(80, 60, 150, 150);
//		contentPane.add(btnNewButton_1);
//
//		JButton btnNewButton_2 = new JButton("New button");
//		btnNewButton_2.setBounds(770, 60, 150, 150);
//		contentPane.add(btnNewButton_2);
//
//		JButton btnNewButton_3 = new JButton("New button");
//		btnNewButton_3.setBounds(540, 60, 150, 150);
//		contentPane.add(btnNewButton_3);
//
//		JButton btnNewButton_4 = new JButton("New button");
//		btnNewButton_4.setBounds(310, 60, 150, 150);
//		contentPane.add(btnNewButton_4);
//
//		// 하단 4개
//		JButton btnNewButton_1_1 = new JButton("New button");
//		btnNewButton_1_1.setBounds(80, 238, 150, 150);
//		contentPane.add(btnNewButton_1_1);
//
//		JButton btnNewButton_2_1 = new JButton("New button");
//		btnNewButton_2_1.setBounds(310, 238, 150, 150);
//		contentPane.add(btnNewButton_2_1);
//
//		JButton btnNewButton_3_1 = new JButton("New button");
//		btnNewButton_3_1.setBounds(540, 238, 150, 150);
//		contentPane.add(btnNewButton_3_1);
//
//		JButton btnNewButton_4_1 = new JButton("New button");
//		btnNewButton_4_1.setBounds(770, 238, 150, 150);
//		contentPane.add(btnNewButton_4_1);
//
//		// 홈과 로그아웃 버튼
//
//		JButton home_button = new JButton("홈");
//		home_button.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				new MemberHome();
//				dispose();
//			}
//		});
//		home_button.setBounds(25, 17, 90, 30);
//		home_button.setForeground(fontColor);
//		home_button.setBackground(buttonColor);
//		home_button.setFont(font1);
//		contentPane.add(home_button);
//
//		JButton logout_button = new JButton("로그아웃");
//		logout_button.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				int result = JOptionPane.showConfirmDialog(null, "로그아웃 하시겠습니까?", "로그아웃", JOptionPane.YES_NO_OPTION);
//				if (result == JOptionPane.YES_OPTION) {
//					new MemberLogin();
//					dispose();
//				}
//			}
//		});
//		logout_button.setBounds(871, 17, 90, 30);
//		logout_button.setForeground(fontColor);
//		logout_button.setBackground(buttonColor);
//		logout_button.setFont(font1);
//		logout_button.setBorder(BorderFactory.createLineBorder(Color.decode("#00623C")));
//		contentPane.add(logout_button);
//
//		// 메뉴 수량 버튼 ( +, - )
//
//		JButton orderUP = new JButton("+");
//		orderUP.setIcon(null);
//		orderUP.setBounds(525, 430, 50, 50);
//		orderUP.setBackground(buttonColor);
//		orderUP.setForeground(fontColor);
//		orderUP.setFont(font);
//		contentPane.add(orderUP);
//
//		JButton orderDown = new JButton("-");
//		orderDown.setIcon(null);
//		orderDown.setBounds(525, 490, 50, 50);
//		orderDown.setFont(font);
//		orderDown.setBackground(buttonColor);
//		orderDown.setForeground(fontColor);
//		contentPane.add(orderDown);
//
//		// 총 금액
//		textField = new JTextField();
//		textField.setText("0");
//		textField.setBounds(587, 435, 178, 39);
//		contentPane.add(textField);
//		textField.setColumns(10);
//
//		// 포인트 금액
//		textField_1 = new JTextField();
//		textField_1.setText("0");
//		textField_1.setColumns(10);
//		textField_1.setBounds(587, 490, 178, 39);
//		contentPane.add(textField_1);
//
//		// 현금 결제 버튼
//		JButton usePoint = new JButton("포인트 사용");
//		usePoint.setBounds(779, 430, 159, 50);
//		usePoint.setBackground(buttonColor);
//		usePoint.setForeground(fontColor);
//		usePoint.setFont(font1);
//		contentPane.add(usePoint);
//
//		// 카드 결제 버튼
//		JButton payment = new JButton("결제 하기");
//		payment.setBounds(779, 490, 159, 50);
//		payment.setBackground(buttonColor);
//		payment.setForeground(fontColor);
//		payment.setFont(font1);
//		contentPane.add(payment);
//		
//		JScrollPane scrollPane = new JScrollPane();
//		scrollPane.setBounds(59, 415, 442, 125);
//		contentPane.add(scrollPane);
//		
//				// 주문 확인 테이블
//		
//				table_1 = new JTable();
//				scrollPane.setViewportView(table_1);
//				table_1.setModel(new DefaultTableModel(new Object[][] { { "카페라떼", 2, 10000 } },
//						new String[] { "\uC81C\uD488\uBA85", "\uC218\uB7C9", "\uAC00\uACA9" }) {
//					Class[] columnTypes = new Class[] { String.class, Integer.class, Integer.class };
//
//					public Class getColumnClass(int columnIndex) {
//						return columnTypes[columnIndex];
//					}
//				});
//
//		setVisible(true);
//
//		/*
//		 * 버튼 이벤트 소스 코드
//		 */
//
//		// 포인트 사용 버튼 이벤트
//		usePoint.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				new PayPoint();
//			}
//		});
//
//		// 결제하기 버튼 이벤트
//		payment.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				new AskPayment();
//			}
//		});
//
//	}
//}

package Lee;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import DTO.OrderDTO;

import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Order_win extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollpane;
	static JTextField textField;
	static JTextField textField_1;
	private Color backColor = new Color(15, 159, 78);
	private Color buttonColor = new Color(0, 98, 60);
	private Color fontColor = new Color(255, 255, 255);
	private Font font = new Font("맑은 고딕", Font.BOLD, 20);
	private Font font1 = new Font("맑은 고딕", Font.BOLD, 16);
	static JTable table;
	static DefaultTableModel model;
	DecimalFormat format = new DecimalFormat("###,###");

	ImageIcon icon1 = new ImageIcon("Image/아메리카노.jpg"); // 사진 경로 설정
	ImageIcon icon2 = new ImageIcon("Image/카페라떼.jpg");
	ImageIcon icon3 = new ImageIcon("Image/돌체라떼.jpg");
	ImageIcon icon4 = new ImageIcon("Image/바닐라 크림 콜드브루.jpg");
	ImageIcon icon5 = new ImageIcon("Image/바닐라 플랫 화이트.jpg");
	ImageIcon icon6 = new ImageIcon("Image/자몽 허니 블랙티.jpg");
	ImageIcon icon7 = new ImageIcon("Image/핑크 자몽 피지오.png");
	ImageIcon icon8 = new ImageIcon("Image/더블 에스프레소 칩 프라푸치노.png");

	public Order_win() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("주문창");
		setBounds(100, 100, 1000, 600);
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(backColor);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// 메뉴 버튼

		// 상단 4개
		JButton btnNewButton_1 = new JButton("아메리카노", icon1);
		btnNewButton_1.setBounds(80, 60, 150, 150);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addMenu(btnNewButton_1);
			}
		});

		JButton btnNewButton_2 = new JButton("카페라떼", icon2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addMenu(btnNewButton_2);
			}
		});
		btnNewButton_2.setBounds(770, 60, 150, 150);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("돌체라떼", icon3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addMenu(btnNewButton_3);
			}
		});
		btnNewButton_3.setBounds(540, 60, 150, 150);
		contentPane.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("바닐라 크림 콜드브루", icon4);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addMenu(btnNewButton_4);
			}
		});
		btnNewButton_4.setBounds(310, 60, 150, 150);
		contentPane.add(btnNewButton_4);

		// 하단 4개
		JButton btnNewButton_1_1 = new JButton("바닐라 플랫 화이트", icon5);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addMenu(btnNewButton_1_1);
			}
		});
		btnNewButton_1_1.setBounds(80, 238, 150, 150);
		contentPane.add(btnNewButton_1_1);

		JButton btnNewButton_2_1 = new JButton("자몽 허니 블랙티", icon6);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addMenu(btnNewButton_2_1);
			}
		});
		btnNewButton_2_1.setBounds(310, 238, 150, 150);
		contentPane.add(btnNewButton_2_1);

		JButton btnNewButton_3_1 = new JButton("핑크 자몽 피지오", icon7);
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addMenu(btnNewButton_3_1);
			}
		});
		btnNewButton_3_1.setBounds(540, 238, 150, 150);
		contentPane.add(btnNewButton_3_1);

		JButton btnNewButton_4_1 = new JButton("더블 에스프레소 칩 프라푸치노", icon8);
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addMenu(btnNewButton_4_1);
			}
		});
		btnNewButton_4_1.setBounds(770, 238, 150, 150);
		contentPane.add(btnNewButton_4_1);

		// 메뉴 이름 라벨
		JLabel menulb1 = new JLabel("아메리카노");
		menulb1.setForeground(Color.WHITE);
		menulb1.setBounds(80, 210, 150, 30);
		menulb1.setHorizontalAlignment(SwingConstants.CENTER);
		menulb1.setFont(new Font("맑은 고딕", Font.BOLD, 11));
		contentPane.add(menulb1);

		JLabel menulb2 = new JLabel("바닐라크림 콜드브루");
		menulb2.setForeground(Color.WHITE);
		menulb2.setBounds(310, 210, 150, 30);
		menulb2.setHorizontalAlignment(SwingConstants.CENTER);
		menulb2.setFont(new Font("맑은 고딕", Font.BOLD, 11));
		contentPane.add(menulb2);

		JLabel menulb3 = new JLabel("스타벅스 돌체라떼");
		menulb3.setForeground(Color.WHITE);
		menulb3.setBounds(540, 210, 150, 30);
		menulb3.setHorizontalAlignment(SwingConstants.CENTER);
		menulb3.setFont(new Font("맑은 고딕", Font.BOLD, 11));
		contentPane.add(menulb3);

		JLabel menulb4 = new JLabel("카페라떼");
		menulb4.setForeground(Color.WHITE);
		menulb4.setBounds(770, 210, 150, 30);
		menulb4.setHorizontalAlignment(SwingConstants.CENTER);
		menulb4.setFont(new Font("맑은 고딕", Font.BOLD, 11));
		contentPane.add(menulb4);

		JLabel menulb5 = new JLabel("바닐라 플랫 화이트");
		menulb5.setForeground(Color.WHITE);
		menulb5.setBounds(80, 388, 150, 30);
		menulb5.setHorizontalAlignment(SwingConstants.CENTER);
		menulb5.setFont(new Font("맑은 고딕", Font.BOLD, 11));
		contentPane.add(menulb5);

		JLabel menulb6 = new JLabel("자몽 허니 블랙티");
		menulb6.setForeground(Color.WHITE);
		menulb6.setBounds(310, 388, 150, 30);
		menulb6.setHorizontalAlignment(SwingConstants.CENTER);
		menulb6.setFont(new Font("맑은 고딕", Font.BOLD, 11));
		contentPane.add(menulb6);

		JLabel menulb7 = new JLabel("핑크 자몽 피지오");
		menulb7.setForeground(Color.WHITE);
		menulb7.setBounds(540, 388, 150, 30);
		menulb7.setHorizontalAlignment(SwingConstants.CENTER);
		menulb7.setFont(new Font("맑은 고딕", Font.BOLD, 11));
		contentPane.add(menulb7);

		JLabel menulb8 = new JLabel("더블 에스프레소 칩 프라푸치노");
		menulb8.setForeground(Color.WHITE);
		menulb8.setBounds(770, 388, 150, 30);
		menulb8.setHorizontalAlignment(SwingConstants.CENTER);
		menulb8.setFont(new Font("맑은 고딕", Font.BOLD, 10));
		contentPane.add(menulb8);

		// 홈과 로그아웃 버튼

		JButton home_button = new JButton("홈");
		home_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MemberHome();
				dispose();
			}
		});
		home_button.setBounds(25, 17, 90, 30);
		home_button.setForeground(fontColor);
		home_button.setBackground(buttonColor);
		home_button.setFont(font1);
		contentPane.add(home_button);

		JButton logout_button = new JButton("로그아웃");
		logout_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "로그아웃 하시겠습니까?", "로그아웃", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					MemberLogin.member = null;
					new MemberLogin();
					dispose();
				}
			}
		});
		logout_button.setBounds(871, 17, 90, 30);
		logout_button.setForeground(fontColor);
		logout_button.setBackground(buttonColor);
		logout_button.setFont(font1);
		logout_button.setBorder(BorderFactory.createLineBorder(Color.decode("#00623C")));
		contentPane.add(logout_button);

		// 주문 확인 테이블 생성
		scrollpane = new JScrollPane();
		getContentPane().add(scrollpane);
		model = new DefaultTableModel(new String[] { "상품명", "수량", "금액" }, 0);
		table = new JTable(model);
		scrollpane.setViewportView(table);
		createTable(table);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.add(scrollpane, BorderLayout.CENTER);
		scrollpane.setBounds(59, 415, 442, 125);

		// 메뉴 수량 버튼 ( +, - )

		JButton orderUP = new JButton("+");
		orderUP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (table.getSelectedRow() == -1) {
					JOptionPane.showMessageDialog(null, "수량을 변경할 항목을 선택하세요.");
				} else {
					plus();
				}
			}
		});
		orderUP.setIcon(null);
		orderUP.setBounds(525, 430, 50, 50);
		orderUP.setBackground(buttonColor);
		orderUP.setForeground(fontColor);
		orderUP.setFont(font);
		contentPane.add(orderUP);

		JButton orderDown = new JButton("-");
		orderDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (table.getSelectedRow() == -1) {
					JOptionPane.showMessageDialog(null, "수량을 변경할 항목을 선택하세요.");
				} else {
					minus();
				}
			}
		});
		orderDown.setIcon(null);
		orderDown.setBounds(525, 490, 50, 50);
		orderDown.setFont(font);
		orderDown.setBackground(buttonColor);
		orderDown.setForeground(fontColor);
		contentPane.add(orderDown);

		// 총 금액
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("0");
		textField.setBounds(587, 435, 137, 39);
		textField.setColumns(10);
		contentPane.add(textField);

		// 포인트 금액
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setText(String.valueOf(MemberLogin.member.getMileage()));
		textField_1.setColumns(10);
		textField_1.setBounds(587, 490, 137, 39);
		contentPane.add(textField_1);

		// 포인트 사용 버튼
		JButton usePoint = new JButton("포인트 사용");
		usePoint.setBounds(779, 430, 159, 50);
		usePoint.setBackground(buttonColor);
		usePoint.setForeground(fontColor);
		usePoint.setFont(font1);
		contentPane.add(usePoint);

		// 결제 버튼
		JButton payment = new JButton("결제 하기");
		payment.setBounds(779, 490, 159, 50);
		payment.setBackground(buttonColor);
		payment.setForeground(fontColor);
		payment.setFont(font1);
		contentPane.add(payment);

		JLabel label = new JLabel("원");
		label.setBounds(727, 452, 21, 15);
		contentPane.add(label);

		JLabel lblP = new JLabel("p");
		lblP.setBounds(727, 502, 21, 15);
		contentPane.add(lblP);

		// 포인트 사용 버튼 이벤트
		usePoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (MemberLogin.member.getMileage() > 0) {
					new PayPoint();
				} else {
					JOptionPane.showMessageDialog(null, "사용할 포인트가 없습니다.");
				}
			}
		});

		// 결제하기 버튼 이벤트
		payment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (table.getRowCount() == 0) {
					JOptionPane.showMessageDialog(null, "장바구니가 비어있습니다.");
				} else {
					new AskPayment();
				}
			}
		});

		setVisible(true);
	}

	// 매뉴 화면 출력 메서드
	public void addMenu(JButton button) {
		try {

			String sql = "select * from menu where menu_name = ?";

			Main.db.pstmt = Main.db.con.prepareStatement(sql);

			Main.db.pstmt.setString(1, button.getText());

			Main.db.rs = Main.db.pstmt.executeQuery();

			while (Main.db.rs.next()) {
				String menu_name = Main.db.rs.getString("menu_name");
				int count = 1;
				int menu_price = Main.db.rs.getInt("menu_price");

				for (int i = 0; i < model.getRowCount(); i++) {
					if (model.getValueAt(i, 0).equals(menu_name)) {
						model.removeRow(i);
					}
				}

				Object[] data = { menu_name, count, menu_price * count };

				model.addRow(data);
			}

			total();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// +
	public void plus() {
		try {
			String menu_name = "";
			int menu_price = 0;
			int row = table.getSelectedRow();
			int cnt = (int) model.getValueAt(row, 1) + 1;
			String sql = "select * from menu where menu_name = ?";

			Main.db.pstmt = Main.db.con.prepareStatement(sql);

			Main.db.pstmt.setString(1, (String) model.getValueAt(row, 0));

			Main.db.rs = Main.db.pstmt.executeQuery();

			while (Main.db.rs.next()) {
				menu_name = Main.db.rs.getString("menu_name");
				menu_price = Main.db.rs.getInt("menu_price");
			}

			Object[] data = { menu_name, cnt, menu_price * cnt };

			model.removeRow(row);
			model.addRow(data);

			total();

			table.changeSelection(row, 0, false, false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -
	public void minus() {
		try {
			String menu_name = "";
			int menu_price = 0;
			int row = table.getSelectedRow();
			int cnt = (int) model.getValueAt(row, 1) - 1;

			String sql = "select * from menu where menu_name = ?";

			Main.db.pstmt = Main.db.con.prepareStatement(sql);

			Main.db.pstmt.setString(1, (String) model.getValueAt(row, 0));

			Main.db.rs = Main.db.pstmt.executeQuery();

			while (Main.db.rs.next()) {
				menu_name = Main.db.rs.getString("menu_name");
				menu_price = Main.db.rs.getInt("menu_price");
			}

			Object[] data = { menu_name, cnt, menu_price * cnt };

			model.removeRow(row);

			if (cnt > 0) {
				model.addRow(data);
			}

			total();
			table.changeSelection(row, 0, false, false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 주문금액, 마일리지 출력
	public void total() {
		int total = 0;

		for (int i = 0; i < model.getRowCount(); i++) {
			total += (int) table.getValueAt(i, 2);
		}

		textField.setText(String.valueOf(total));
		textField_1.setText(String.valueOf(MemberLogin.member.getMileage()));
	}

	public static void createTable(JTable table) {
		DefaultTableCellRenderer tScheduleCellRenderer = new DefaultTableCellRenderer();

		tScheduleCellRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		TableColumnModel tcmSchedule = table.getColumnModel();

		for (int i = 0; i < tcmSchedule.getColumnCount(); i++) {
			tcmSchedule.getColumn(i).setCellRenderer(tScheduleCellRenderer);
		}
	}
}
