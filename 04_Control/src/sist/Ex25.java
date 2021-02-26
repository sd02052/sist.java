package sist;

public class Ex25 {
	public static void main(String[] args) {

		// ABCDEFGHIJKLMN......XYZ 문자를 출력해 보자.
		char alpha = 'A';
		while (alpha <= 'Z') {
			System.out.print(alpha);
			alpha++;
		}
		System.out.println();
		System.out.println();

		// ZYXWV......DCBA 문자를 출력해 보자.
		char alpha1 = 'Z';
		while (alpha1 >= 'A') {
			System.out.print(alpha1);
			alpha1--;
		}
	}
}
