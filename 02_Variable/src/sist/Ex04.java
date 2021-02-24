package sist;

/*
 * 단일 문자형: char형 ==> 2byte
 * - 자바에서는 유니코드 체계로 단일문자가 처리가 됨.
 * 		==> C 언어에서는 ASCII 코드 체계로 처리가 됨.
 */
public class Ex04 {
	public static void main(String[] args) {
		char ch = 'A';
		System.out.println("ch >>> " + ch);
		// 더하면 유니코드상 10진수로 바껴서 66이 됨.
		// 그걸 char형으로 변환하면 B가 됨.
		System.out.println((char) (ch + 1));
	}
}
