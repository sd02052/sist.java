package Lee;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class AskPayment extends JFrame {

	private JPanel contentPane;

	public AskPayment() {

		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 360);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("결제 수단을 선택해 주세요.");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel.setBounds(159, 100, 186, 16);
		contentPane.add(lblNewLabel);

		JButton card = new JButton("카드 결제");
		card.setBounds(92, 192, 117, 29);
		contentPane.add(card);

		JButton money = new JButton("현금 결제");
		money.setBounds(286, 192, 117, 29);
		contentPane.add(money);

		// 이벤트 리스터

		// 카드 결제
		card.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CheckCardPay();
				dispose();
			}
		});

		// 현금 결제
		money.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CheckMoneyPay();
				dispose();
			}
		});

		setVisible(true);
	}
}
