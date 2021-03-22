package sist;

import java.awt.BorderLayout;

import javax.swing.*;

public class Ex22_Layout04 extends JFrame {

	public Ex22_Layout04() {
		setTitle("성적 처리");

		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();

		JLabel jl1 = new JLabel("이름 : ");
		JTextField jtf1 = new JTextField(10);
		JLabel jl2 = new JLabel("국어 : ");
		JTextField jtf2 = new JTextField(4);
		JLabel jl3 = new JLabel("영어 : ");
		JTextField jtf3 = new JTextField(4);
		JLabel jl4 = new JLabel("수학 : ");
		JTextField jtf4 = new JTextField(4);

		JTextArea jta = new JTextArea(10, 30);
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);

		JButton jb1 = new JButton("계산");
		JButton jb2 = new JButton("종료");
		JButton jb3 = new JButton("취소");

		jp1.add(jl1);
		jp1.add(jtf1);

		jp2.add(jl2);
		jp2.add(jtf2);
		jp2.add(jl3);
		jp2.add(jtf3);
		jp2.add(jl4);
		jp2.add(jtf4);

		jp3.add(jb1);
		jp3.add(jb2);
		jp3.add(jb3);

		JPanel pg = new JPanel(new BorderLayout());
		
		pg.add(jp2, BorderLayout.NORTH);
		pg.add(jsp, BorderLayout.CENTER);
		pg.add(jp3, BorderLayout.SOUTH);

		add(jp1, BorderLayout.NORTH);
		add(pg, BorderLayout.CENTER);

		setBounds(200, 200, 400, 300);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ex22_Layout04();

	}
}
