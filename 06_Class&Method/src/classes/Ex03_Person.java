package classes;

public class Ex03_Person {
	public static void main(String[] args) {

		Person person = new Person();

		person.name = "홍길동";

		person.age = 27;

		String mar = "";

		if (person.marrige) {
			mar = "기혼";
		} else {
			mar = "미혼";
		}

		System.out.println("이름 >>> " + person.name);
		System.out.println("나이 >>> " + person.age);
		System.out.println("결혼여부 >>> " + mar);
		System.out.println("자녀수 >>> " + person.numberOfChild);

	}
}
