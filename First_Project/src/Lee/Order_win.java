package Lee;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Order_win extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTextField textField;
	private JTextField textField_1;
	private Color backColor = new Color(15, 159, 78);
	private Color buttonColor = new Color(0, 98, 60);
	private Color fontColor = new Color(255, 255, 255);
	private Font font = new Font("맑은 고딕", Font.BOLD, 20);
	private Font font1 = new Font("맑은 고딕", Font.BOLD, 16);

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
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(80, 60, 150, 150);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(770, 60, 150, 150);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(540, 60, 150, 150);
		contentPane.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(310, 60, 150, 150);
		contentPane.add(btnNewButton_4);

		// 하단 4개
		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.setBounds(80, 238, 150, 150);
		contentPane.add(btnNewButton_1_1);

		JButton btnNewButton_2_1 = new JButton("New button");
		btnNewButton_2_1.setBounds(310, 238, 150, 150);
		contentPane.add(btnNewButton_2_1);

		JButton btnNewButton_3_1 = new JButton("New button");
		btnNewButton_3_1.setBounds(540, 238, 150, 150);
		contentPane.add(btnNewButton_3_1);

		JButton btnNewButton_4_1 = new JButton("New button");
		btnNewButton_4_1.setBounds(770, 238, 150, 150);
		contentPane.add(btnNewButton_4_1);

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

		// 메뉴 수량 버튼 ( +, - )

		JButton orderUP = new JButton("+");
		orderUP.setIcon(null);
		orderUP.setBounds(525, 430, 50, 50);
		orderUP.setBackground(buttonColor);
		orderUP.setForeground(fontColor);
		orderUP.setFont(font);
		contentPane.add(orderUP);

		JButton orderDown = new JButton("-");
		orderDown.setIcon(null);
		orderDown.setBounds(525, 490, 50, 50);
		orderDown.setFont(font);
		orderDown.setBackground(buttonColor);
		orderDown.setForeground(fontColor);
		contentPane.add(orderDown);

		// 총 금액
		textField = new JTextField();
		textField.setText("0");
		textField.setBounds(587, 435, 178, 39);
		contentPane.add(textField);
		textField.setColumns(10);

		// 포인트 금액
		textField_1 = new JTextField();
		textField_1.setText("0");
		textField_1.setColumns(10);
		textField_1.setBounds(587, 490, 178, 39);
		contentPane.add(textField_1);

		// 현금 결제 버튼
		JButton usePoint = new JButton("포인트 사용");
		usePoint.setBounds(779, 430, 159, 50);
		usePoint.setBackground(buttonColor);
		usePoint.setForeground(fontColor);
		usePoint.setFont(font1);
		contentPane.add(usePoint);

		// 카드 결제 버튼
		JButton payment = new JButton("결제 하기");
		payment.setBounds(779, 490, 159, 50);
		payment.setBackground(buttonColor);
		payment.setForeground(fontColor);
		payment.setFont(font1);
		contentPane.add(payment);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(59, 415, 442, 125);
		contentPane.add(scrollPane);
		
				// 주문 확인 테이블
		
				table_1 = new JTable();
				scrollPane.setViewportView(table_1);
				table_1.setModel(new DefaultTableModel(new Object[][] { { "카페라떼", 2, 10000 } },
						new String[] { "\uC81C\uD488\uBA85", "\uC218\uB7C9", "\uAC00\uACA9" }) {
					Class[] columnTypes = new Class[] { String.class, Integer.class, Integer.class };

					public Class getColumnClass(int columnIndex) {
						return columnTypes[columnIndex];
					}
				});

		setVisible(true);

		/*
		 * 버튼 이벤트 소스 코드
		 */

		// 포인트 사용 버튼 이벤트
		usePoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PayPoint();
			}
		});

		// 결제하기 버튼 이벤트
		payment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AskPayment();
			}
		});

	}
}
