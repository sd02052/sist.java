package inheritance;

public class Student extends Human {

	String major; // 학과

	void studentInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("직업: " + job);
		System.out.println("학과: " + major);
	}
}
