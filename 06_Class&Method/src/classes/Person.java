package classes;

public class Person {

	// 멤버변수
	String name;
	int age;
	boolean marrige;
	int numberOfChild;

	// 멤버메서드
	void display() {

		String mar;

		if (marrige) {
			mar = "기혼";
		} else {
			mar = "미혼";
		}

		System.out.println("이름 >>> " + name);
		System.out.println("나이 >>> " + age);
		System.out.println("결혼여부 >>> " + mar);
		System.out.println("자녀수 >>> " + numberOfChild);
	}
}
