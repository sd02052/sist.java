package method;

import java.util.Scanner;

public class Ex02 {

	// 1부터 키보드로 입력받는 수까지의 합을 구하는 메서드
	public static void total() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 >>> ");
		int su = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= su; i++) {
			sum += i;
		}

		System.out.println("1~" + su + "까지의 합 >>> " + sum);

		sc.close();
	}

	public static void main(String[] args) {

		System.out.println("프로그램 시작");

		// [문제] 1~500까지의 합을 구하는 메서드를 호출

		total();

		System.out.println("프로그램 종료");
	}
}
