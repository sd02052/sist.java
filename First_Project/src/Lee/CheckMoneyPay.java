package Lee;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CheckMoneyPay extends JFrame {

	private JPanel contentPane;

	public CheckMoneyPay() {

		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 360);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("현금 결제가 완료되었습니다.");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel.setBounds(161, 138, 193, 16);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("  주문 금액 000,000원");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(169, 101, 152, 16);
		contentPane.add(lblNewLabel_1);

		JButton btnNewButton = new JButton("확인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(183, 208, 117, 29);
		contentPane.add(btnNewButton);

		// 이벤트리스너

		/*
		 * btnNewButton.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { } });
		 */

		setVisible(true);

	}
}
