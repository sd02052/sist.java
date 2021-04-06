package Lee;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PayCard extends JFrame {

	private JPanel contentPane;
	private Color backColor = new Color(15, 159, 78);
	private Color buttonColor = new Color(0, 98, 60);
	private Color fontColor = new Color(255, 255, 255);
	private Font font = new Font("맑은 고딕", Font.BOLD, 20);
	Font font1 = new Font("맑은 고딕", Font.BOLD, 16);

	public PayCard() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 360);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(backColor);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("주문 금액 : ");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lblNewLabel_1.setBounds(144, 102, 98, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("1,000,000원");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lblNewLabel_2.setBounds(243, 102, 159, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("현금 결제가 완료되었습니다.");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lblNewLabel.setBounds(144, 138, 222, 16);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("확인");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnNewButton.setBackground(new Color(0, 98, 60));
		btnNewButton.setBounds(183, 208, 117, 29);
		contentPane.add(btnNewButton);

		setVisible(true);
	}
}
