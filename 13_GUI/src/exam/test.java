package exam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.JPasswordField;

public class test {

	private JFrame frame;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel_9 = new JPanel();
		frame.getContentPane().add(panel_9, BorderLayout.CENTER);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel_9.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 20));
		
		JLabel lblNewLabel = new JLabel("쌍용 강북 교육센터");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(220, 20, 60));
		lblNewLabel.setFont(new Font("문체부 궁체 정자체", Font.PLAIN, 18));
		panel.add(lblNewLabel);
		
		JPanel panel_8 = new JPanel();
		panel_9.add(panel_8, BorderLayout.CENTER);
		FlowLayout flowLayout = (FlowLayout) panel_8.getLayout();
		flowLayout.setVgap(20);
		
		JPanel panel_1 = new JPanel();
		panel_8.add(panel_1);
		panel_1.setLayout(new GridLayout(3, 2, 0, 0));
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panel_2.getLayout();
		flowLayout_3.setAlignment(FlowLayout.RIGHT);
		panel_1.add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("수강번호 : ");
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		
		textField = new JTextField();
		panel_3.add(textField);
		textField.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) panel_4.getLayout();
		flowLayout_4.setAlignment(FlowLayout.RIGHT);
		panel_1.add(panel_4);
		
		JLabel lblNewLabel_2 = new JLabel("비밀번호 : ");
		panel_4.add(lblNewLabel_2);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		panel_5.add(passwordField);
		
		JPanel panel_6 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_6.getLayout();
		flowLayout_1.setAlignment(FlowLayout.RIGHT);
		panel_1.add(panel_6);
		
		JButton btnNewButton = new JButton("로그인");
		panel_6.add(btnNewButton);
		
		JPanel panel_7 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_7.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_1.add(panel_7);
		
		JButton btnNewButton_1 = new JButton("회원가입");
		panel_7.add(btnNewButton_1);
	}

}
