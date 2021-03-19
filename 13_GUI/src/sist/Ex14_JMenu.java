package sist;

import javax.swing.*;

public class Ex14_JMenu extends JFrame {

	public Ex14_JMenu() {

		setTitle("메뉴");

		JMenuBar bar = new JMenuBar();

		// 1. 메뉴를 만들어 보자.
		JMenu menu1 = new JMenu("파일");
		JMenu menu2 = new JMenu("글자");
		JMenu menu3 = new JMenu("도움말");
		JMenu menu4 = new JMenu("글자체");
		JMenu menu5 = new JMenu("바탕색");

		// 2. 메뉴아이템을 만들어 보자.
		// 2-1. "파일"이라는 메뉴에 들어갈 메뉴 아이템을 만들어 보자.
		JMenuItem jmi1 = new JMenuItem("새파일");
		JMenuItem jmi2 = new JMenuItem("열기");
		JMenuItem jmi3 = new JMenuItem("저장");
		JMenuItem jmi4 = new JMenuItem("종료");

		// 2-2-1. "글자 -> 글자체" 라는 메뉴에 들어갈 메뉴아이템을 만들어 보자.
		JMenuItem jmi5 = new JMenuItem("굴림, 기본, 10");
		JMenuItem jmi6 = new JMenuItem("궁서, 굵게, 20");
		JMenuItem jmi7 = new JMenuItem("돋음, 기울게, 30");

		// 2-2-2. "글자 -> 바탕색" 이라는 메뉴에 들어갈 메뉴아이템을 만들어 보자.
		JMenuItem jmi8 = new JMenuItem("노란색");
		JMenuItem jmi9 = new JMenuItem("회색");
		JMenuItem jmi10 = new JMenuItem("초록색");

		// 2-3. "도움말" 이라는 메뉴에 들어갈 메뉴아이템을 만들어 보자.
		JMenuItem jmi11 = new JMenuItem("도움말");
		JMenuItem jmi12 = new JMenuItem("메모장 정보");

		// 3. 메뉴아이템(JMenuItem)을 메뉴(JMunu)에 올려주어야 한다.
		// 3-1. "파일"이라는 메뉴에 들어갈 메뉴아이템을 올리자.
		menu1.add(jmi1);
		menu1.add(jmi2);
		menu1.add(jmi3);
		menu1.addSeparator(); // 구분선
		menu1.add(jmi4);

		// 3-2. "글자" 메뉴에 "글자체"를 올려야 한다.
		menu4.add(jmi5);
		menu4.add(jmi6);
		menu4.add(jmi7);

		menu2.add(menu4);
		menu2.addSeparator();

		menu5.add(jmi8);
		menu5.add(jmi9);
		menu5.add(jmi10);

		menu2.add(menu5);

		// 3-3. "도움말" 메뉴에 메뉴아이템을 올려야 한다.
		menu3.add(jmi11);
		menu3.addSeparator();
		menu3.add(jmi12);

		// 4. 메뉴를 메뉴바에 올려주어야 한다.
		bar.add(menu1);
		bar.add(menu2);
		bar.add(menu3);

		// 5. 메뉴바를 프레임에 올려야 한다.
		setJMenuBar(bar);

		setBounds(200, 200, 300, 300);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ex14_JMenu();

	}
}
