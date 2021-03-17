package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.MemberDTO;

public class Ex04 {
	public static void main(String[] args) {

		List<MemberDTO> list = new ArrayList<MemberDTO>();

		Scanner sc = new Scanner(System.in);

		System.out.print("회원 수를 입력하세요. : ");
		int count = sc.nextInt();

		// 1. 키보드로 회원의 수만큼 회원 정보를 입력받아서 list에 저장해 보자.
		for (int i = 0; i < count; i++) {

			MemberDTO dto = new MemberDTO();

			System.out.println((i + 1) + "번째 회원의 아이디, 비밀번호, 이름, 나이, 주소를 입력하세요...");

			dto.setId(sc.next());
			dto.setPwd(sc.next());
			dto.setName(sc.next());
			dto.setAge(sc.nextInt());
			dto.setAddress(sc.next());

			list.add(dto);
			System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

		}

		System.out.println("아이디\t비밀번호\t이름\t나이\t주소");

		// list에 있는 데이터들을 화면에 출력해 보자.
		for (int i = 0; i < list.size(); i++) {
			MemberDTO memberdto = list.get(i);
			System.out.println(memberdto.getId() + "\t" + memberdto.getPwd() + "\t" + memberdto.getName() + "\t"
					+ memberdto.getAge() + "\t" + memberdto.getAddress());
//			System.out.println(list.get(i).getId() + "\t" + list.get(i).getPwd() + "\t" + list.get(i).getName() + "\t"
//					+ list.get(i).getAge() + "\t" + list.get(i).getAddress());
			System.out.println("=================================================================");
		}

		sc.close();
	}
}
