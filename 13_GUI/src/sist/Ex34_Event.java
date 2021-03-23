package sist;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex34_Event extends JFrame {

	public Ex34_Event() {

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

		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = jtf1.getText();
				int kor = Integer.parseInt(jtf2.getText());
				int eng = Integer.parseInt(jtf3.getText());
				int math = Integer.parseInt(jtf4.getText());
				int total = kor + eng + math;
				double avg = total / 3;
				String grade = "";

				if (avg >= 90) {
					grade = "A";
					if (avg >= 95) {
						grade = "A+";
					}
				} else if (avg >= 80) {
					grade = "B";
					if (avg >= 85) {
						grade = "B+";
					}
				} else if (avg >= 70) {
					grade = "C";
					if (avg > 75) {
						grade = "C+";
					}
				} else if (avg >= 60) {
					grade = "D";
					if (avg >= 65) {
						grade = "D+";
					}
				} else {
					grade = "F";
				}

				jta.append("***" + name + "님 성적결과***\n");
				jta.append("이름 : " + name + "\n");
				jta.append("국어점수 : " + kor + "\n");
				jta.append("영어점수 : " + eng + "\n");
				jta.append("수학점수 : " + math + "\n");
				jta.append("총점 : " + total + "\n");
				jta.append("평균 : " + String.format("%.2f점\n", avg));
				jta.append("학점 : " + grade + "\n\n");

				jtf1.setText(null);
				jtf2.setText(null);
				jtf3.setText(null);
				jtf4.setText(null);

				jtf1.requestFocus();
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
				jtf1.setText(null);
				jtf2.setText(null);
				jtf3.setText(null);
				jtf4.setText(null);
				jta.setText(null);

				jtf1.requestFocus();
			}
		});
	}

	public static void main(String[] args) {

		new Ex34_Event();
	}
}
