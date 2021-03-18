package sist;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex05_JCheckBox {
	public static void main(String[] args) {

		JFrame jf = new JFrame();
		jf.setTitle("JCheckBox 예제");

		// 컨테이너를 만들자.
		JPanel jp = new JPanel();

		// 1. 컴포넌트를 만들자.
		JCheckBox cb1 = new JCheckBox("게임");
		JCheckBox cb2 = new JCheckBox("독서");
		JCheckBox cb3 = new JCheckBox("영화감상", true);
		JCheckBox cb4 = new JCheckBox("운동");
		JCheckBox cb5 = new JCheckBox("잠자기");

		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		jp.add(cb1);
		jp.add(cb2);
		jp.add(cb3);
		jp.add(cb4);
		jp.add(cb5);

		// 3. 컨테이너를 프레임에 올려야 한다.
		jf.add(jp);

		jf.setBounds(100, 100, 400, 400);

		jf.setVisible(true);

	}
}
