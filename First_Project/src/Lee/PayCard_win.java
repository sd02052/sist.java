package Lee;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class PayCard_win extends JFrame {

	private JPanel contentPane;

	public PayCard_win() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel(" 현금으로 결제하시겠습니까?");
		lblNewLabel.setBounds(170, 95, 169, 42);
		contentPane.add(lblNewLabel);

		JButton btnYes = new JButton("YES");
		btnYes.setBounds(102, 237, 117, 29);
		contentPane.add(btnYes);

		JButton btnNo = new JButton("NO");
		btnNo.setBounds(294, 237, 117, 29);
		contentPane.add(btnNo);

		setVisible(true);
	}

}
