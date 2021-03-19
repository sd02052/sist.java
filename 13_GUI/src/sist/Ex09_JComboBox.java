package sist;

import javax.swing.*;

public class Ex09_JComboBox extends JFrame {

	public Ex09_JComboBox() {

		JPanel jp = new JPanel();

		setTitle("JComboBox 예제");

		// 1. 컴포넌트를 만들어 보자.

		String[] job = { "회사원", "공무원", "학생", "주부", "무직" };
		JComboBox<String> jcb = new JComboBox<String>(job);

		// jcb.setSelectedIndex(3); // 콤보박스 초기값 설정
		jcb.setSelectedItem("공무원");

		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		jp.add(jcb);

		// 3. 컨테이너를 프레임에 올려야 한다.
		add(jp);

		setBounds(100, 100, 300, 300);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ex09_JComboBox();
	}
}
