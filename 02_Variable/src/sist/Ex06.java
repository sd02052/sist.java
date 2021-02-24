package sist;

/*
 * [문제] 두 수를 서로 교환하여 보자.
 */
public class Ex06 {
	public static void main(String[] args) {
		int x = 47;
		int y = 81;

		System.out.println("변경 전>>> " + x + ", " + y);
		System.out.println(" ");
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("변경 후>>> " + x + ", " + y);
	}
}
