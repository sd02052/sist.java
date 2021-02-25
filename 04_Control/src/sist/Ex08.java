package sist;

import javax.swing.JOptionPane;

/*
 *  키보드로 입력 받은 정수값을 5로 나누어서 0으로 떨어지면 
 *  "이 값은 5로 나누어 집니다." 라고 출력을 하고, 그렇지 않으면
 *  "이 값은 5로 나누어지지 않습니다." 라고 화면에 출력해 보세요.
 *  단, 음수값이 입력이 되면 "음수값이 입력되었습니다" 라고 출력해 보세요.
 */
public class Ex08 {
	public static void main(String[] args) {
		
		// 1. 키보드로 정수를 입력을 받자.
		int num = Integer.parseInt(JOptionPane.showInputDialog("정수를 입력하세요."));

		if (num < 0) {
			System.out.println("음수값이 입력되었습니다.");
		} else {
			if (num % 5 == 0) {
				System.out.println("이 값은 5로 나누어 집니다.");
			} else {
				System.out.println("이 값은 5로 나누어지지 않습니다.");
			}
		}
	}
}
