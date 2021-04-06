package Lee;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PayMoney extends JFrame {

	private JPanel contentPane;
	private Color backColor = new Color(15, 159, 78);
	private Color buttonColor = new Color(0, 98, 60);
	private Color fontColor = new Color(255, 255, 255);
	Font font1 = new Font("맑은 고딕", Font.BOLD, 16);

	public PayMoney() {

		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 360);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(backColor);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("현금 결제가 완료되었습니다.");
		lblNewLabel.setFont(font1);
		lblNewLabel.setBounds(144, 138, 222, 16);
		lblNewLabel.setForeground(fontColor);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("주문 금액 : ");
		lblNewLabel_1.setFont(font1);
		lblNewLabel_1.setBounds(144, 102, 98, 16);
		lblNewLabel_1.setForeground(fontColor);
		contentPane.add(lblNewLabel_1);

		JButton btnNewButton = new JButton("확인");
		btnNewButton.setBackground(buttonColor);
		btnNewButton.setForeground(fontColor);
		btnNewButton.setFont(font1);
		btnNewButton.setBounds(183, 208, 117, 29);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel_2 = new JLabel("1,000,000원");
		lblNewLabel_2.setFont(font1);
		lblNewLabel_2.setBounds(243, 102, 159, 15);
		lblNewLabel_2.setForeground(fontColor);
		contentPane.add(lblNewLabel_2);

		// 이벤트리스너

		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();

			}
		});

		setVisible(true);

	}
}
