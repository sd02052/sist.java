package Lee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberLogin {

	private JFrame frame;
	private JPasswordField tfPass;
	private JTextField tfId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MemberLogin window = new MemberLogin();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
		new MemberLogin();
	}

	/**
	 * Create the application.
	 */
//	public MemberLogin() {
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	public MemberLogin() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton_4 = new JButton("\uAD00\uB9AC\uC790 \uBA54\uB274");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ManagerLogin();
				frame.dispose();
			}
		});
		btnNewButton_4.setBounds(842, 54, 97, 84);
		frame.getContentPane().add(btnNewButton_4);

		JButton btnNewButton_3 = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CreateAccount();
				frame.dispose();
			}
		});
		btnNewButton_3.setBounds(360, 283, 100, 77);
		frame.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_1 = new JButton("\uBE44\uBC00\uBC88\uD638 \r\n\uCC3E\uAE30");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ForgotPassword();
				frame.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 12));
		btnNewButton_1.setBounds(485, 283, 100, 77);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnLogin = new JButton("\uB85C\uADF8\uC778\r\n");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = tfId.getText();
				String pass = tfPass.getText();

				if (id.equals(pass)) {
					new MemberHome();
					frame.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "아이디와 비밀번호가 일치하지 않습니다.", "Message", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnLogin.setBounds(360, 420, 225, 77);
		frame.getContentPane().add(btnLogin);

		tfPass = new JPasswordField();
		tfPass.setToolTipText("");
		tfPass.setHorizontalAlignment(SwingConstants.LEFT);
		tfPass.setBounds(360, 200, 225, 42);
		frame.getContentPane().add(tfPass);

		tfId = new JTextField();
		tfId.setHorizontalAlignment(SwingConstants.LEFT);
		tfId.setColumns(10);
		tfId.setBounds(360, 140, 225, 42);
		frame.getContentPane().add(tfId);

		JLabel lblNewLabel_1 = new JLabel("\uC544\uC774\uB514");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(200, 140, 121, 42);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("\uBE44\uBC00\uBC88\uD638\r\n");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(200, 202, 121, 42);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel = new JLabel("\uD584\uBC84\uAC70 \uD68C\uC6D0 \uB85C\uADF8\uC778");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel.setBounds(341, 44, 260, 58);
		frame.getContentPane().add(lblNewLabel);

		frame.setVisible(true);
	}
}
