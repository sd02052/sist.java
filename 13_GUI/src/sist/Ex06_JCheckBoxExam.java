package sist;

import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex06_JCheckBoxExam {
	public static void main(String[] args) {

		JFrame jf = new JFrame();

		JPanel jp = new JPanel();

		jf.setTitle("과일 체크박스 예제");

		// 1-1. 과일 이미지 아이콘을 만들어 보자.
		ImageIcon kiwi = new ImageIcon("images/kiwi.jpg");
		ImageIcon mango = new ImageIcon("images/mango.jpg");
		ImageIcon apple = new ImageIcon("images/apple.jpg");

		// 1-2. 컴포넌트를 만들어 보자.
		JCheckBoxMenuItem cb1 = new JCheckBoxMenuItem("키위", kiwi);
		JCheckBoxMenuItem cb2 = new JCheckBoxMenuItem("망고", mango);
		JCheckBoxMenuItem cb3 = new JCheckBoxMenuItem("사과", apple);

		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		jp.add(cb1);
		jp.add(cb2);
		jp.add(cb3);

		// 3. 컨테이너를 프레임에 올려야 한다.
		jf.add(jp);

		jf.setBounds(100, 100, 300, 600);

		jf.setVisible(true);

	}
}
