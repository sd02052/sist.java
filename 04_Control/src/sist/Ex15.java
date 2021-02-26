package sist;

import javax.swing.JOptionPane;

/*
 * 학생 성적 처리
 * - 이름, 국어점수, 영어점수, 수학점수, 자바점수를 키보드로 입력받아서
 * 	총점, 평균, 학점까지 출력해 보자.
 */
public class Ex15 {
	public static void main(String[] args) {

		// 1. 키보드로 이름과 국어점수, 영어점수, 수학점수, 자바점수를 입력받자.
		String name = JOptionPane.showInputDialog("이름을 입력하세요.");
		int kor = Integer.parseInt(JOptionPane.showInputDialog("국어점수를 입력하세요."));
		int eng = Integer.parseInt(JOptionPane.showInputDialog("영어점수를 입력하세요."));
		int math = Integer.parseInt(JOptionPane.showInputDialog("수학점수를 입력하세요."));
		int java = Integer.parseInt(JOptionPane.showInputDialog("자바점수를 입력하세요."));

		// 2. 총점을 구하자.
		int total = kor + eng + math + java;

		// 3. 평균을 구하자.
		double avg = total / 4.0;

		// 4. 학점을 구하자.
		String grade;
		if (avg >= 90) {
			if (avg >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if (avg >= 80) {
			if (avg >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		} else if (avg >= 70) {
			if (avg >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}
		} else if (avg >= 60) {
			if (avg >= 65) {
				grade = "D+";
			} else {
				grade = "D";
			}
		} else {
			grade = "F";
		}

		// 5. 성적을 화면에 출력해 보자.
		System.out.println("이름 >>> " + name);
		System.out.println("국어점수 >>> " + kor);
		System.out.println("영어점수 >>> " + eng);
		System.out.println("수학점수 >>> " + math);
		System.out.println("자바점수 >>> " + java);
		System.out.println("총점 >>> " + total);
		System.out.printf("평균 >>> %.2f\n",avg);
		System.out.println("학점 >>> " + grade);
		
	}
}
