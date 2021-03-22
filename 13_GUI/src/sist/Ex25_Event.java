package sist;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex25_Event extends JFrame {

	public Ex25_Event() {

		setTitle("버튼 테스트");

		JPanel panel = new JPanel();

		// 1. 컴포넌트를 만들어 보자.
		JButton button = new JButton("JAVA");

		// 중요함
		// 이벤트를 처리하는 방법 - 두번째
		// 이벤트 관련하여 독립된 클래스 생성하여 처리하는 방법.
		MyButton listener = new MyButton();

		button.addActionListener(listener);

		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		panel.add(button);

		// 3. 컨테이를 프레임에 올려야 한다.
		add(panel);

		// 중요함

		setBounds(200, 200, 300, 150);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);
	}

	public static void main(String[] args) {

		new Ex25_Event();
	}
}

// 독립된 클래스를 작성하여 이벤트를 처리
class MyButton implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		//getSource() : 현재 발생한 이벤트에 소스 컴포넌트의 정보를 반환해 줌.
		JButton button = (JButton) e.getSource();

		if (button.getText().equals("JAVA")) {
			button.setText("자바");
		} else {
			button.setText("JAVA");
		}
	}

}
