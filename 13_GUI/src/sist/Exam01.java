package sist;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Exam01 extends JFrame {

	public Exam01() {
		setTitle("계산기 예제 - 3");

		JPanel north_1 = new JPanel();
		JPanel north_2 = new JPanel();
		JPanel south = new JPanel();

		// 1. 컴포넌트를 만들어 보자
		// 1-1. notrh_1 컨테이너에 들어갈 컴포넌트
		JLabel jl1 = new JLabel("수1 : ");
		JTextField su1 = new JTextField(7);

		JLabel jl2 = new JLabel("수2 : ");
		JTextField su2 = new JTextField(7);

		// 1-2. north_2 컨테이너에 들어갈 컴포넌트
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

		// 1-3. TextArea 컴포넌트를 만들어 보자.
		JTextArea jta = new JTextArea(5, 25);
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		jta.setLineWrap(true);

		// 1-4. south 컨테이너에 들어갈 컴포넌트
		JButton jb1 = new JButton("계산");
		JButton jb2 = new JButton("종료");
		JButton jb3 = new JButton("취소");

		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		// 2-1. 1-1 컴포넌트들을 north_1 컨테이너에 올려야 한다.
		north_1.add(jl1);
		north_1.add(su1);
		north_1.add(jl2);
		north_1.add(su2);

		// 2-2. 1-2 컴포넌트들을 north_2 컨테이너에 올려야 한다.
		north_2.add(jl3);
		north_2.add(jrb1);
		north_2.add(jrb2);
		north_2.add(jrb3);
		north_2.add(jrb4);

		// 2-3. 1-4 컴포넌트들을 south 컨테이너에 올려야 한다.
		south.add(jb1);
		south.add(jb2);
		south.add(jb3);

		// 중요한 부분
		// 컨테이너를 하나 더 만들자
		JPanel pg = new JPanel(new BorderLayout());

		// 새로 추가한 컨테이너에 기존의 컨테이너를 올려주자.
		pg.add(north_2, BorderLayout.NORTH);
		pg.add(jsp, BorderLayout.CENTER);
		pg.add(south, BorderLayout.SOUTH);

		// 3. 컨테이너를 프레임에 올려주어야 한다.
		add(north_1, BorderLayout.NORTH);
		add(pg, BorderLayout.CENTER);

		setBounds(200, 200, 300, 300);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);

		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(su1.getText());
				int b = Integer.parseInt(su2.getText());
				String result = "";
				if (jrb1.isSelected()) {
					result = "결과 >>> " + a + " + " + b + " = " + (a + b);
				} else if (jrb2.isSelected()) {
					result = "결과 >>> " + a + " - " + b + " = " + (a - b);
				} else if (jrb3.isSelected()) {
					result = "결과 >>> " + a + " * " + b + " = " + (a * b);
				} else if (jrb4.isSelected()) {
					result = "결과 >>> " + a + " / " + b + " = " + (a / b);
				}
				jta.append(result + "\n");
				
				System.out.println(bg.getSelection());

				su1.setText(null);
				su2.setText(null);

				su1.requestFocus();
			}
		});

		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		jb3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				su1.setText(null);
				su2.setText(null);
				jta.setText(null);

				su1.requestFocus();
			}
		});
	}

	public static void main(String[] args) {

		new Exam01();
	}
}
