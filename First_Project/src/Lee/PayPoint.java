package Lee;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PayPoint extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public PayPoint() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 360);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel(" 주문 금액 :  1,000,000 원 ");
		lblNewLabel.setBounds(175, 53, 170, 42);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel(" 보유 포인트 :  1,000,000 원");
		lblNewLabel_1.setBounds(170, 80, 170, 42);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel(" 사용할 포인트를 입력하세요. ");
		lblNewLabel_1_1.setBounds(162, 128, 183, 42);
		contentPane.add(lblNewLabel_1_1);

		textField = new JTextField();
		textField.setBounds(180, 170, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnYes = new JButton("사용");
		btnYes.setBounds(102, 237, 117, 29);
		contentPane.add(btnYes);

		JButton btnNo = new JButton("취소");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNo.setBounds(294, 237, 117, 29);
		contentPane.add(btnNo);

		// 이벤트

		// yes button - DB 연동 후
		/*
		 * btnYes.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) {
		 * 
		 * } });
		 */

		/*
		 * 미구현 // no button - 창 닫기 btnNo.addActionListener(new ActionListener() { public
		 * void actionPerformed(ActionEvent e) {
		 * 
		 * } });
		 */

		setVisible(true);
	}

}
