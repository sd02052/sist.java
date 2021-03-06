package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 3. Map 계열의 컬렉션 프레임워크 특징
 *    - key와 value를 한 쌍으로 해서 데이터를 저장하고,
 *      검색하는 기능을 제공함. => 검색에 최적화된 컬렉션 프레임워크
 *    - key는 중복 불가, value는 중복 가능.
 *    - Map 인터페이스의 자식클래스로 구현
 *      ==> HashMap(O), HashTable(O), Properties(가끔), TreeMap(X)
 */

public class Ex09 {
	public static void main(String[] args) {

		// Map 인터페이스의 자식클래스를 이용하여 객체 생성.
		Map<String, Integer> map = new HashMap<String, Integer>();

		// 1. put() : 데이터를 저장하는 메서드
		// 이름을 키(key)로 저장, 점수를 값(value)으로 저장
		map.put("홍길동", 95);
		map.put("유관순", 90);
		map.put("세종대왕", 100);
		map.put("김유신", 88);
		map.put("김연아", 89);

		// 2. get(key) : 저장된 데이터를 검색(가져오는) 메서드.
		// key에 해당하는 value값을 반환.
		System.out.println("김유신 점수 >>> " + map.get("김유신"));
		System.out.println();

		Scanner sc = new Scanner(System.in);

		System.out.print("검색할 이름을 입력하세요. : ");
		String searchName = sc.next();

		if (map.containsKey(searchName)) { // containsKey(searchName) - searchName을 키로 포함하고 있는게 있느냐
			System.out.println(searchName + " 님의 점수 >>> " + map.get(searchName));
		} else {
			System.out.println("일치하는 이름이 없습니다.");
		}
		System.out.println();

		// 3. keySet() : map의 전체 내용을 출력하는 메서드
		for (String k : map.keySet()) {
			System.out.println(k + " 님의 점수 >>> " + map.get(k));
		}

		System.out.println(map.keySet());
		sc.close();
	}
}
