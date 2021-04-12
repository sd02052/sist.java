package Lee;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class PayPoint extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private Color backColor = new Color(15, 159, 78);
	private Color buttonColor = new Color(0, 98, 60);
	private Color fontColor = new Color(255, 255, 255);
	private Font font = new Font("맑은 고딕", Font.BOLD, 20);
	private Font font1 = new Font("맑은 고딕", Font.BOLD, 16);

	public PayPoint() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 360);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(backColor);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("주문 금액 : ");
		lblNewLabel.setBounds(165, 53, 86, 42);
		lblNewLabel.setFont(font1);
		lblNewLabel.setForeground(fontColor);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("보유 포인트 : ");
		lblNewLabel_1.setBounds(149, 80, 102, 42);
		lblNewLabel_1.setFont(font1);
		lblNewLabel_1.setForeground(fontColor);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel(" 사용할 포인트를 입력하세요. ");
		lblNewLabel_1_1.setBounds(145, 132, 220, 42);
		lblNewLabel_1_1.setFont(font1);
		lblNewLabel_1_1.setForeground(fontColor);
		contentPane.add(lblNewLabel_1_1);

		textField = new JTextField();
		textField.setBounds(180, 170, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnYes = new JButton("사용");
		btnYes.setBounds(102, 237, 122, 30);
		btnYes.setBackground(buttonColor);
		btnYes.setFont(font1);
		btnYes.setForeground(fontColor);
		contentPane.add(btnYes);

		JButton btnNo = new JButton("취소");
		btnNo.setBounds(294, 237, 122, 30);
		btnNo.setBackground(buttonColor);
		btnNo.setFont(font1);
		btnNo.setForeground(fontColor);
		contentPane.add(btnNo);

		JLabel lblNewLabel_2 = new JLabel(Order_win.textField.getText());
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(252, 69, 86, 15);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel(Order_win.textField_1.getText());
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(252, 96, 86, 15);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("원");
		lblNewLabel_4.setBounds(340, 69, 25, 15);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("p");
		lblNewLabel_5.setBounds(340, 96, 25, 15);
		contentPane.add(lblNewLabel_5);

		// 이벤트

		// yes button

		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usePoint();
				dispose();
			}
		});

		// no button - 창 닫기
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		setVisible(true);
	}

	public void usePoint() {
		if (Integer.parseInt(textField.getText()) > MemberLogin.member.getMileage()) {
			JOptionPane.showMessageDialog(null, "사용할 포인트가 보유 포인트보다 많습니다.");
		} else {
			String total = Order_win.textField.getText();
			String point = Order_win.textField_1.getText();
			int finalTotal = Integer.parseInt(total) - Integer.parseInt(textField.getText());
			int finalPoint = Integer.parseInt(point) - Integer.parseInt(textField.getText());
			Order_win.textField.setText(String.valueOf(finalTotal));
			Order_win.textField_1.setText(String.valueOf(finalPoint));
			dispose();
		}
	}
}
