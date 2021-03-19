package sist;

import java.awt.BorderLayout;

import javax.swing.*;

public class Ex20_Layout02 extends JFrame {

	public Ex20_Layout02() {
		setTitle("계산기 예제");

		JPanel north = new JPanel();
		JPanel south = new JPanel();

		JLabel jl1 = new JLabel("수1 : ");
		JTextField su1 = new JTextField(5);
		JLabel jl2 = new JLabel("수2 : ");
		JTextField su2 = new JTextField(5);
		JLabel jl3 = new JLabel("연산자 : ");
		JRadioButton jrb1 = new JRadioButton("+");
		JRadioButton jrb2 = new JRadioButton("-");
		JRadioButton jrb3 = new JRadioButton("X");
		JRadioButton jrb4 = new JRadioButton("/");
		JRadioButton jrb5 = new JRadioButton("%");

		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		bg.add(jrb5);

		JTextArea jta = new JTextArea(5, 25);
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);

		JButton jb1 = new JButton("계산");
		JButton jb2 = new JButton("종료");
		JButton jb3 = new JButton("취소");

		north.add(jl1);
		north.add(su1);
		north.add(jl2);
		north.add(su2);
		north.add(jl3);
		north.add(jrb1);
		north.add(jrb2);
		north.add(jrb3);
		north.add(jrb4);
		north.add(jrb5);

		south.add(jb1);
		south.add(jb2);
		south.add(jb3);

		add(north, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(south, BorderLayout.SOUTH);

		setBounds(200, 200, 500, 200);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);
	}

	public static void main(String[] args) {

		new Ex20_Layout02();

	}
}
