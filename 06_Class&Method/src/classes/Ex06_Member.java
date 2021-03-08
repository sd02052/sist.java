package classes;

public class Ex06_Member {
	public static void main(String[] args) {

		// 기본 생성자로 객체 생성
		Member member1 = new Member();
		member1.name = "홍길동";
		member1.age = 28;
		member1.phone = "010-2484-0902";
		member1.job = "학생";

		member1.getMemberInfo();
		System.out.println();

		Member member2 = new Member("김유신", 30, "010-1111-1111", "화랑도");
		member2.getMemberInfo();
	}
}
