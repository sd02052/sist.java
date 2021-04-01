package Lee;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Order_win extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTextField textField;
	private JTextField textField_1;

	// btnNewButton_1, btnNewButton_2 btnNewButton_3 btnNewButton_4
	// btnNewButton_1_1, btnNewButton_2_1 btnNewButton_3_1 btnNewButton_4_1
	// home_button logout_button orderUP orderDown payment usePoint

	public Order_win() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("주문창");
		setBounds(100, 100, 1000, 600);
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
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
		home_button.setBounds(23, 6, 117, 29);
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
		logout_button.setBounds(864, 6, 117, 29);
		contentPane.add(logout_button);

		// 메뉴 수량 버튼 ( +, - )

		JButton orderUP = new JButton("+");
		orderUP.setIcon(null);
		orderUP.setBounds(525, 430, 50, 50);
		contentPane.add(orderUP);

		JButton orderDown = new JButton("-");
		orderDown.setIcon(null);
		orderDown.setBounds(525, 490, 50, 50);
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
		contentPane.add(usePoint);

		// 카드 결제 버튼
		JButton payment = new JButton("결제 하기");
		payment.setBounds(779, 490, 159, 50);
		contentPane.add(payment);

		// 주문 확인 테이블

		table_1 = new JTable();
		table_1.setBounds(62, 420, 442, 125);
		contentPane.add(table_1);

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

		/*
		 * 만들어야 하는 이벤트
		 * 
		 * 1. 홈 버튼 -> 홈 화면 이동 2. 로그아웃 버튼 -> 로그인 창 이동 3. + , - 버튼 주문 수량 변경
		 * 
		 */

	}

	public static void main(String[] args) {

		new Order_win();

	}
}
