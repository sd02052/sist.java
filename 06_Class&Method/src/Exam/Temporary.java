package Exam;

public class Temporary {
	String name;
	int time;
	int pay;

	public Temporary() {
	}

	public Temporary(String n, int t, int p) {
		name = n;
		time = t;
		pay = p;
	}

	void cal() {
		int total = time * pay;
		int vat = (int) (total * 0.03);
		int money = total - vat;

		System.out.println("이름: " + name);
		System.out.printf("총급여: %,d원\n", total);
		System.out.printf("공제액: %,d원\n", vat);
		System.out.printf("실지급액: %,d원\n", money);
	}
}
