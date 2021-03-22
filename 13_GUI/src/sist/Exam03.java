package sist;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Exam03 extends JFrame {

	public Exam03() {

		setTitle("커피 자판기");

		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		JPanel jp4 = new JPanel();

		JLabel jl1 = new JLabel("원하는 커피 선택");

		JRadioButton jrb1 = new JRadioButton("아메리카노(2500)");
		JRadioButton jrb2 = new JRadioButton("카페모카(2500)");
		JRadioButton jrb3 = new JRadioButton("에스프레소(2500)");
		JRadioButton jrb4 = new JRadioButton("카페라떼(4000)");

		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);

		JLabel jl2 = new JLabel("수량 : ");
		JTextField jtf1 = new JTextField(10);
		JLabel jl3 = new JLabel("입금액 : ");
		JTextField jtf2 = new JTextField(10);

		JTextArea jta = new JTextArea(10, 40);
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);

		JButton jb1 = new JButton("계산");
		JButton jb2 = new JButton("종료");
		JButton jb3 = new JButton("취소");

		jp1.add(jl1);

		jp2.add(jrb1);
		jp2.add(jrb2);
		jp2.add(jrb3);
		jp2.add(jrb4);

		jp3.add(jl2);
		jp3.add(jtf1);
		jp3.add(jl3);
		jp3.add(jtf2);

		jp4.add(jb1);
		jp4.add(jb2);
		jp4.add(jb3);

		JPanel jp5 = new JPanel(new BorderLayout());
		JPanel jp6 = new JPanel(new BorderLayout());

		jp5.add(jp1, BorderLayout.NORTH);
		jp5.add(jp2, BorderLayout.CENTER);
		jp5.add(jp3, BorderLayout.SOUTH);

		jp6.add(jsp, BorderLayout.NORTH);
		jp6.add(jp4, BorderLayout.CENTER);

		add(jp5, BorderLayout.NORTH);
		add(jp6, BorderLayout.CENTER);

		setBounds(200, 200, 300, 300);

		pack();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);

		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int cnt = Integer.parseInt(jtf1.getText());
				int money = Integer.parseInt(jtf2.getText());
				String result = "";

				if (jrb1.isSelected()) {
					result = "아메리카노 " + cnt + "잔 >>> " + (2500 * cnt) + "원, 거스름돈 >>> " + (money - (2500 * cnt));
				} else if (jrb2.isSelected()) {
					result = "카페모카 " + cnt + "잔 >>> " + (2500 * cnt) + "원, 거스름돈 >>> " + (money - (2500 * cnt));
				} else if (jrb3.isSelected()) {
					result = "에스프레소 " + cnt + "잔 >>> " + (2500 * cnt) + "원, 거스름돈 >>> " + (money - (2500 * cnt));
				} else if (jrb4.isSelected()) {
					result = "카페라떼 " + cnt + "잔 >>> " + (4000 * cnt) + "원, 거스름돈 >>> " + (money - (4000 * cnt));
				}

				jta.append(result + "\n");
				jtf1.setText(null);
				jtf2.setText(null);

				jtf1.requestFocus();
			}
		});

		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});

		jb3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				jtf1.setText(null);
				jtf2.setText(null);
				jta.setText(null);

				jtf1.requestFocus();
			}
		});
	}

	public static void main(String[] args) {

		new Exam03();
	}
}
