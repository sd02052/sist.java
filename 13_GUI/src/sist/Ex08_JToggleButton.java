package sist;

import javax.swing.*;

public class Ex08_JToggleButton extends JFrame {

	public Ex08_JToggleButton() {

		JPanel jp = new JPanel();

		// 1. 컴포넌트를 만들어 보자.
		JToggleButton tb1 = new JToggleButton("토글버튼1");
		JToggleButton tb2 = new JToggleButton("토글버튼2");
		JToggleButton tb3 = new JToggleButton("토글버튼3");

		// 2. 컴포넌트는 컨테이너 위에 올려야 한다.
		jp.add(tb1);
		jp.add(tb2);
		jp.add(tb3);

		// 3. 컨테이너는 프레임 위에 올려야 한다.
		add(jp);

		setBounds(100, 100, 300, 300);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ex08_JToggleButton();
	}
}
