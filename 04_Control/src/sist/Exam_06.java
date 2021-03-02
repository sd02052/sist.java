package sist;

import java.util.Scanner;

/*
 * [문제6] 커피메뉴 선택하기
 */

public class Exam_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("*** Coffee 메뉴 ***");
		System.out.println("1. 아메리카노 - 3,000원");
		System.out.println("2. 카페라떼 - 4,000원");
		System.out.println("3. 마끼야또 - 4,500원");
		System.out.println("4. 바닐라라떼 - 4,500원");
		System.out.print("위 메뉴 중 하나를 선택하세요 >>> ");
		int menuNum = sc.nextInt();

		System.out.print("주문수량 >>> ");
		int amount = sc.nextInt();

		System.out.print("입금액 >>> ");
		int money = sc.nextInt();

		String coffeeStr = " ";
		int price = 0;

		switch (menuNum) {
		case 1:
			coffeeStr = "아메리카노";
			price = 3000;
			break;
		case 2:
			coffeeStr = "카페라떼";
			price = 4000;
			break;
		case 3:
			coffeeStr = "마끼야또";
			price = 4500;
			break;
		case 4:
			coffeeStr = "바닐라라떼";
			price = 4500;
			break;
		default:
			System.out.println("선택하신 커피는 없는 메뉴입니다...");
		}

		// 공급가액 계산(단가 * 수량)
		int sum = (price * amount);
		// 부가세액 계산((단가 * 수량)*0.1)
		int vat = (int) (sum * 0.1);
		// 총 금액 계산(공급가액+부가세액)
		int total = sum + vat;
		// 잔액(거스름돈) 계산 (입금액-총 금액)
		int change = money - total;
		// 화면에 출력해 보자.
		System.out.println("주문한 메뉴: " + coffeeStr);
		System.out.printf("커피 단가: %,d 원\n", price);
		System.out.println("주문 수량: " + amount);
		System.out.printf("입금액: %,d 원\n", money);
		System.out.printf("공급금액: %,d 원\n", sum);
		System.out.printf("부가세액: %,d 원\n", vat);
		System.out.printf("총 금액: %,d 원\n", total);
		System.out.printf("거스름돈: %,d 원\n", change);
		
		sc.close();
	}
}
