package sist;

import javax.swing.JOptionPane;

public class Ex14 {
	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("이름은?");
		int jumsu = Integer.parseInt(JOptionPane.showInputDialog("점수를 입력하세요"));
		
		System.out.println(name);
		
		if (jumsu >= 90) {
			if (jumsu >= 95) {
				System.out.println("A+학점 입니다.");
			} else {
				System.out.println("A학점 입니다.");
			}
		} else if (jumsu >= 80) {
			if (jumsu >= 85) {
				System.out.println("B+학점 입니다.");
			} else {
				System.out.println("B학점 입니다.");
			}
		} else if (jumsu >= 70) {
			if (jumsu >= 75) {
				System.out.println("C+학점 입니다.");
			} else {
				System.out.println("C학점 입니다.");
			}
		} else if (jumsu >= 60) {
			if (jumsu >= 65) {
				System.out.println("D+학점 입니다.");
			} else {
				System.out.println("D학점 입니다.");
			}
		} else {
			System.out.println("F학점 입니다.");
		}

	}
}
