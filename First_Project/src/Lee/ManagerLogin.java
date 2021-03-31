package Lee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ManagerLogin {

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
//					ManagerLogin window = new ManagerLogin();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});

		new ManagerLogin();
	}

	/**
	 * Create the application.
	 */
//	public ManagerLogin() {
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	public ManagerLogin() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		tfPass = new JPasswordField();
		tfPass.setHorizontalAlignment(SwingConstants.LEFT);
		tfPass.setBounds(360, 203, 225, 42);
		frame.getContentPane().add(tfPass);

		tfId = new JTextField();
		tfId.setHorizontalAlignment(SwingConstants.LEFT);
		tfId.setColumns(10);
		tfId.setBounds(360, 140, 225, 42);
		frame.getContentPane().add(tfId);

		JLabel lblNewLabel_3 = new JLabel("ID\r\n");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(200, 140, 121, 42);
		frame.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("PASSWORD");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(200, 202, 121, 42);
		frame.getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("\uAD00\uB9AC\uC790 \uBA54\uB274\r\n");
		lblNewLabel_5.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(341, 44, 260, 58);
		frame.getContentPane().add(lblNewLabel_5);

		JButton btnNewButton_5 = new JButton("BACK");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MemberLogin();
				frame.dispose();
			}
		});
		btnNewButton_5.setBounds(43, 31, 97, 84);
		frame.getContentPane().add(btnNewButton_5);

		JButton btnLogin = new JButton("\uB85C\uADF8\uC778");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = tfId.getText();
				String pass = tfPass.getText();
				if (id.equals(pass)) {
					new MenuChange();
					frame.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "아이디와 비밀번호가 일치하지 않습니다.", "Message", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnLogin.setFont(new Font("굴림", Font.PLAIN, 18));
		btnLogin.setBounds(360, 420, 225, 77);
		frame.getContentPane().add(btnLogin);

		frame.setVisible(true);

	}
}
