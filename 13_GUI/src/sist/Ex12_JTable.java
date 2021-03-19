package sist;

import javax.swing.*;

public class Ex12_JTable extends JFrame {

	public Ex12_JTable() {

		// JTable 컴포넌트는 컨테이너에 올리지 않고
		// 바로 JFrame에 올려주면 된다.

		// 1. 컴포넌트를 만들어 보자
		String[] head = { "학생이름", "국어점수", "영어점수", "수학점수", "JAVA점수" };
		String[][] contents = { { "홍길동", "100", "88", "90", "90" }, { "이순신", "90", "88", "90", "90" },
				{ "유관순", "84", "88", "90", "90" }, { "강감찬", "74", "88", "90", "90" }, { "김유신", "64", "88", "90", "90" },
				{ "김연아", "54", "88", "90", "90" }, { "세종대왕", "44", "88", "90", "90" },
				{ "백종원", "34", "88", "90", "90" }, { "유재석", "24", "88", "90", "90" },
				{ "강호동", "14", "88", "90", "90" } };

		JTable jt = new JTable(contents, head);

		// 1-1. 스크롤 기능을 추가해 보자.
		JScrollPane jsp = new JScrollPane(jt, // 스크롤바가 보여질 컴포넌트
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, // 수직으로 스크롤바를 설치할 것인지 여부 확인
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER // 수평으로 스크롤바를 설치할 것인지 여부 확인
		);

		// 2. JTable은 바로 프레임에 올려 주면 된다.
		add(jsp); // 스크롤에 포함된 테이블이 같이 올라온다.

		setBounds(100, 100, 400, 400);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ex12_JTable();

	}
}
