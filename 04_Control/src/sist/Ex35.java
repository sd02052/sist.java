package sist;

/*
 * 다중 for문을 이용하여 구구단을 화면에 출력해 보자.
 */

public class Ex35 {
	public static void main(String[] args) {

		for (int i = 2; i <= 9; i++) { // 구구단에서의 단
			System.out.println("***" + i + "단***");
			for (int j = 1; j <= 9; j++) { // 구구단에서의 수
				System.out.println(i + " X " + j + "= " + (i * j));
			}
			System.out.println();
		}
		
		for (int k = 2; k <= 9; k++) {
			System.out.print("***" + k + "단***\t");
		}
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + " X " + i + "= " + (i * j) + "\t");
			}
			System.out.println();
		}
		
	}
}
