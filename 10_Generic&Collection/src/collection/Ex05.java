package collection;

/*
 * [문제] Ex04 클래스처럼 키보드로 학생 수를 입력받고
 * 		입력받은 학생 수 만큼 정보를 키보드로 입력받아서 
 * 		ArrayList에 학생 정보를 저장 후 화면에 출력해 보세요. 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.StudentDTO;

public class Ex05 {
	public static void main(String[] args) {

		List<StudentDTO> list = new ArrayList<StudentDTO>();

		Scanner sc = new Scanner(System.in);

		System.out.print("학생 수를 입력하세요. : ");
		int count = sc.nextInt();

		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + "번째 학생의 학번, 이름, 학과, 전화번호, 주소를 입력하세요...");

			StudentDTO dto = new StudentDTO();

			dto.setHakbun(sc.nextInt());
			dto.setName(sc.next());
			dto.setMajor(sc.next());
			dto.setPhone(sc.next());
			dto.setAddress(sc.next());

			list.add(dto);
			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		}

		System.out.println("학번\t이름\t학과\t전화번호\t주소");
		System.out.println("--------------------------------------------------------------");

		for (int i = 0; i < list.size(); i++) {
			StudentDTO st = list.get(i);

			System.out.println(st.getHakbun() + "\t" + st.getName() + "\t" + st.getMajor() + "\t" + st.getPhone() + "\t"
					+ st.getAddress());
			System.out.println("==============================================================");
		}

		sc.close();
	}
}
