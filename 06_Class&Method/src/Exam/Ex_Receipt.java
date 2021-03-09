package Exam;

import java.util.Scanner;

public class Ex_Receipt {
	public static final double BUGASE_RATE = 1.1;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("항목 갯수를 입력하세요. : ");

		Receipt[] re = new Receipt[sc.nextInt()];
		int total = 0;

		for (int i = 0; i < re.length; i++) {
			System.out.println("품명, 단가, 수량을 입력하세요.........");
			re[i] = new Receipt(sc.next(), sc.nextInt(), sc.nextInt());
			re[i].total = re[i].price * re[i].cnt;
			total += re[i].total;
		}

		System.out.println("품명\t단가\t수량\t금액");
		System.out.println("==================================");

		for (int i = 0; i < re.length; i++) {
			re[i].display();
		}

		int gong = (int) (total / Ex_Receipt.BUGASE_RATE);
		int bugase = total - gong;
		int chung = gong + bugase;

		System.out.println("==================================");
		System.out.printf("공급가액\t\t\t%,8d원\n", gong);
		System.out.printf("부가세\t\t\t%,8d원\n", bugase);
		System.out.println("==================================");
		System.out.printf("청구금액\t\t\t%,8d원\n", chung);

		sc.close();
	}
}
