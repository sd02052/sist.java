package member;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class AskPayment extends JFrame {

	private JPanel contentPane;
	private Color backColor = new Color(15, 159, 78);
	private Color buttonColor = new Color(0, 98, 60);
	private Color fontColor = new Color(255, 255, 255);
	private Font font = new Font("맑은 고딕", Font.BOLD, 20);
	Font font1 = new Font("맑은 고딕", Font.BOLD, 16);

	public AskPayment() {

		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 360);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(backColor);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("결제 수단을 선택해 주세요.");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel.setBounds(152, 99, 206, 16);
		lblNewLabel.setFont(font1);
		lblNewLabel.setForeground(fontColor);
		lblNewLabel.setBackground(buttonColor);
		contentPane.add(lblNewLabel);

		JButton card = new JButton("카드 결제");
		card.setBounds(92, 192, 122, 30);
		card.setBackground(buttonColor);
		card.setFont(font1);
		card.setForeground(fontColor);
		contentPane.add(card);

		JButton money = new JButton("현금 결제");
		money.setBounds(286, 192, 122, 30);
		money.setBackground(buttonColor);
		money.setForeground(fontColor);
		money.setFont(font1);
		contentPane.add(money);

		// 이벤트 리스터

		// 카드 결제
		card.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PayCard();
				dispose();
			}
		});

		// 현금 결제
		money.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PayMoney();
				dispose();
			}
		});

		setVisible(true);
	}

}
