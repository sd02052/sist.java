package Lee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ForgotPassword {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		/*
		 * EventQueue.invokeLater(new Runnable() { public void run() { try {
		 * ForgotPassword window = new ForgotPassword(); window.frame.setVisible(true);
		 * } catch (Exception e) { e.printStackTrace(); } } });
		 */
		new ForgotPassword();
	}

	/**
	 * Create the application.
	 */

	/* public ForgotPassword() { initialize(); } */

	/**
	 * Initialize the contents of the frame.
	 */
	public ForgotPassword() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 1000, 600);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel_6 = new JLabel("\uC774\uB984");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(200, 140, 121, 42);
		frame.getContentPane().add(lblNewLabel_6);

		JLabel label = new JLabel("\uBE44\uBC00\uBC88\uD638 \uCC3E\uAE30");
		label.setFont(new Font("굴림", Font.PLAIN, 18));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(282, 44, 361, 58);
		frame.getContentPane().add(label);

		JLabel lblNewLabel_7 = new JLabel("\uD734\uB300\uD3F0 \uBC88\uD638");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(200, 204, 121, 42);
		frame.getContentPane().add(lblNewLabel_7);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(360, 203, 225, 42);
		frame.getContentPane().add(textField);

		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(360, 140, 225, 42);
		frame.getContentPane().add(textField_1);

		JButton btnNewButton_6 = new JButton("BACK");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MemberLogin();
				frame.dispose();
			}
		});
		btnNewButton_6.setBounds(43, 31, 97, 84);
		frame.getContentPane().add(btnNewButton_6);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(360, 337, 225, 42);
		frame.getContentPane().add(textField_2);

		JLabel lblNewLabel_8 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(200, 337, 121, 42);
		frame.getContentPane().add(lblNewLabel_8);
	}

}
