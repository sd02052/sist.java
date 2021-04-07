package Lee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberDelete extends JFrame {

	private JFrame frame;

	public MemberDelete(int x, int y) {
		frame = new JFrame();
		frame.setBounds(x, y, 400, 150);
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(15, 159, 78));
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setVgap(20);
		frame.getContentPane().add(panel, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("정말 삭제하시겠습니까?");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();

		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(1, 2, 0, 0));
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(15, 159, 78));
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		JButton btnNewButton = new JButton("예");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		btnNewButton.setBorder(BorderFactory.createLineBorder(Color.decode("#00623C")));
		btnNewButton.setBackground(new Color(0, 98, 60));
		btnNewButton.setBounds(117, 10, 63, 23);
		panel_2.add(btnNewButton);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(15, 159, 78));
		panel_1.add(panel_3);
		panel_3.setLayout(null);

		JButton btnNewButton_1 = new JButton("아니요");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		btnNewButton_1.setBorder(BorderFactory.createLineBorder(Color.decode("#00623C")));
		btnNewButton_1.setBackground(new Color(0, 98, 60));
		btnNewButton_1.setBounds(12, 10, 89, 23);
		panel_3.add(btnNewButton_1);

		frame.setVisible(true);
	}
}
