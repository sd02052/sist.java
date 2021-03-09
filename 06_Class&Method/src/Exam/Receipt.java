package Exam;

public class Receipt {
	String name;
	int price;
	int cnt;
	int total;

	public Receipt() {
	}

	public Receipt(String n, int p, int c) {
		name = n;
		price = p;
		cnt = c;
	}

	void display() {
		System.out.printf("%s\t%5d\t%3d\t%,8d원\n", name, price, cnt, total);
	}

}
