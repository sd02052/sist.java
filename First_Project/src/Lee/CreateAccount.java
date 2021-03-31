package Lee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class CreateAccount {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 * 
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) {
		/*
		 * EventQueue.invokeLater(new Runnable() { public void run() { try {
		 * CreateAccount window = new CreateAccount(); window.frame.setVisible(true); }
		 * catch (Exception e) { e.printStackTrace(); } } });
		 */
		new CreateAccount();
	}

	/**
	 * Create the application.
	 */
	/*
	 * public CreateAccount() { initialize(); }
	 */

	/**
	 * Initialize the contents of the frame.
	 */
	public CreateAccount() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

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

		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(360, 270, 225, 42);
		frame.getContentPane().add(textField_2);

		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(360, 337, 225, 42);
		frame.getContentPane().add(textField_3);

		JLabel lblNewLabel = new JLabel("\uC0C8 \uACC4\uC815 \uC0DD\uC131");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(341, 44, 260, 58);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("\uACC4\uC815 \uC0DD\uC131");
		btnNewButton.setBounds(360, 420, 225, 77);
		frame.getContentPane().add(btnNewButton);

		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MemberLogin();
				frame.dispose();
			}
		});
		btnBack.setBounds(43, 31, 97, 84);
		frame.getContentPane().add(btnBack);

		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(712, 203, 225, 42);
		frame.getContentPane().add(textField_4);

		JLabel lblNewLabel_9 = new JLabel("ID");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(200, 140, 121, 42);
		frame.getContentPane().add(lblNewLabel_9);

		JLabel lblNewLabel_9_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_9_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9_1.setBounds(200, 202, 121, 42);
		frame.getContentPane().add(lblNewLabel_9_1);

		JLabel lblNewLabel_9_2 = new JLabel("\uC774\uB984\r\n");
		lblNewLabel_9_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9_2.setBounds(200, 270, 121, 42);
		frame.getContentPane().add(lblNewLabel_9_2);

		JLabel lblNewLabel_9_3 = new JLabel("\uD734\uB300\uD3F0 \uBC88\uD638");
		lblNewLabel_9_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9_3.setBounds(200, 337, 121, 42);
		frame.getContentPane().add(lblNewLabel_9_3);

		JLabel lblNewLabel_9_4 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778\r\n");
		lblNewLabel_9_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9_4.setBounds(597, 203, 97, 42);
		frame.getContentPane().add(lblNewLabel_9_4);

		frame.setVisible(true);
	}

}
