package inheritance;

public class Ex03_Human {
	public static void main(String[] args) {

		Student student = new Student();
		student.name = "홍길동";
		student.age = 27;
		student.job = "학생";
		student.major = "경제학과";

		student.studentInfo();

		System.out.println();

		Employee employee = new Employee();
		employee.name = "이순신";
		employee.age = 37;
		employee.job = "장군";
		employee.salary = 5000;

		employee.employeeInfo();

	}
}
