package sist;

/*
 * 1~100 까지의 합을 구하는데 합이 200이 되는 순간까지만 합을 구하자.
 */

public class Ex38 {
	public static void main(String[] args) {
		int sum = 0;
		int su = 0;
		for (su = 1; su <= 100; su++) {
			sum += su;
			if (sum >= 200) {
				break;
			}
		}

		System.out.println("sum >>> " + sum);
		System.out.println("빠져나올때 숫자 >>> " + su);
	}
}
