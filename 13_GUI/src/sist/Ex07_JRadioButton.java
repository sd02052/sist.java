package sist;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex07_JRadioButton extends JFrame {

	public Ex07_JRadioButton() {

		JPanel jp = new JPanel();

		setTitle("JRadioButton 예제");

		// 1. 컴포넌트를 만들어 보자.

		JRadioButton rb1 = new JRadioButton("게임");
		JRadioButton rb2 = new JRadioButton("영화감상", true);
		JRadioButton rb3 = new JRadioButton("여행");
		JRadioButton rb4 = new JRadioButton("운동");

		// 라디오버튼은 반드시 ButtonGroup에 올려져야 한다.
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		bg.add(rb4);

		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		jp.add(rb1);
		jp.add(rb2);
		jp.add(rb3);
		jp.add(rb4);

		// 3. 컨테이너를 프레임에 올려야 한다.
		add(jp);

		setBounds(100, 100, 300, 300);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);
	}

	public static void main(String[] args) {

		new Ex07_JRadioButton();

	}
}
