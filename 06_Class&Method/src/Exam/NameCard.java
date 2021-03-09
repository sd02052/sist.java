package Exam;

public class NameCard {
	String name;
	String phone;
	String addr;
	String level;

	public NameCard() {
	}

	public NameCard(String n, String p, String a, String l) {
		name = n;
		phone = p;
		addr = a;
		level = l;
	}

	void display() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phone);
		System.out.println("주소: " + addr);
		System.out.println("직급: " + level);
	}
}
