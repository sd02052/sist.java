package sist;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex32_Event extends JFrame {

	public Ex32_Event() {

		setTitle("간단한 계산기 예제");

		JPanel north = new JPanel();
		JPanel center = new JPanel();
		JPanel south = new JPanel();

		// 1. 컴포넌트를 만들어 보자
		// 1-1. north(상단)에 들어갈 컴포넌트를 만들자.
		JLabel jl1 = new JLabel("수1 : ");
		JTextField su1 = new JTextField(5);

		JLabel jl2 = new JLabel("수2 : ");
		JTextField su2 = new JTextField(5);

		JLabel jl3 = new JLabel("연산자 : ");
		JTextField op = new JTextField(1);

		// 1-2. center(중앙)에 들어갈 컴포넌트를 만들자.
		JTextArea jta = new JTextArea(5, 20);
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		jta.setLineWrap(true);

		// 1-3. south(하단)에 들어갈 컴포넌트를 만들자.
		JButton jb1 = new JButton("계산");
		JButton jb2 = new JButton("종료");
		JButton jb3 = new JButton("취소");

		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		// 2-1. north 컨테이너에 1-1 컴포넌트들을 올려 주면 된다.
		north.add(jl1);
		north.add(su1);
		north.add(jl2);
		north.add(su2);
		north.add(jl3);
		north.add(op);

		// 2-2. center 컨테이너에 1-2 컴포넌트들을 올려 주면 된다.
		center.add(jsp);

		// 2-3. south 컨테이너에 1-3 컴포넌트들을 올려 주면 된다.
		south.add(jb1);
		south.add(jb2);
		south.add(jb3);

		// 3. 3개의 컨테이너를 프레임에 올리되, 배치해서 올리자.
		add(north, BorderLayout.NORTH);
		add(center, BorderLayout.CENTER);
		add(south, BorderLayout.SOUTH);

		setBounds(200, 200, 350, 250);

		pack();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);

		// 4. 이벤트 처리
		// 계산(jb1) 버튼을 클릭했을 때 이벤트 처리
		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(su1.getText());
				int num2 = Integer.parseInt(su2.getText());
				String operator = op.getText();

				String result = "";

				switch (operator) {
				case "+":
					result = "결과 >>> " + num1 + " + " + num2 + " = " + (num1 + num2);
					break;
				case "-":
					result = "결과 >>> " + num1 + " - " + num2 + " = " + (num1 - num2);
					break;
				case "*":
					result = "결과 >>> " + num1 + " * " + num2 + " = " + (num1 * num2);
					break;
				case "/":
					result = "결과 >>> " + num1 + " / " + num2 + " = " + (num1 / num2);
					break;
				}

				jta.append(result + "\n");
				su1.setText("");
				su2.setText(null);
				op.setText(null);

				su1.requestFocus();
			}
		});

		// 종료(jb2) 버튼을 클릭했을 때 이벤트 처리
		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 시스템을 종료시키는 명령어
				System.exit(0);
			}
		});

		// 취소(jb3) 버튼을 클릭했을 때 이벤트 처리
		jb3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				su1.setText("");
				su2.setText(null);
				op.setText(null);
				jta.setText(null);

				su1.requestFocus();
			}
		});
	}

	public static void main(String[] args) {

		new Ex32_Event();

	}
}
