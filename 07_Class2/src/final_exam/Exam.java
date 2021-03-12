package final_exam;

public class Exam {
	public static void main(String[] args) {

		Student student1 = new Student("이성욱", 50000);
		Student student2 = new Student("이순신", 20000);

		Bus bus100 = new Bus(100);

		Subway subwayGreen = new Subway(2);

		student1.takeBus(bus100);

		student2.takeSubway(subwayGreen);

		// 학생에 대한 정보 출력
		student1.showStudentInfo();
		student2.showStudentInfo();
		
		// 버스, 지하철에 대한 정보 출력
		bus100.showBusInfo();
		subwayGreen.showSubwayInfo();
		
	}
}
