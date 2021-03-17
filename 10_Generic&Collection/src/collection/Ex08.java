package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 2. Set 계열의 컬렉션 프레임워크  특징
 *    - 자료에 순서가 없다(정렬 기능 없음 -> index가 없다)
 *    - 중복 데이터 허용 불가.
 *    - Set 인터페이스의 자식클래스를 이용하여 구현.
 *      ==> HashSet(O), TreeSet(X) - Set 자체를 잘 사용하지 않는다.
 *      
 */

public class Ex08 {
	public static void main(String[] args) {

		// Set 인터페이스의 자식클래스를 이용하여 객체 생성.
		Set<Integer> set = new HashSet<Integer>();

		// 1. add("값") : 원소를 추가하는 메서드
		set.add(100); // wrapper 클래스 - 자동 박싱됨
		set.add(200);
		set.add(300); // 중복 데이터 발생
		set.add(400);
		set.add(500);
		set.add(300); // 중복 데이터 발생

		// 2. size() : 원소의 크기를 알려주는 메서드
		System.out.println("Set 컬렉션 크기 >>> " + set.size());
		System.out.println();
		System.out.println();

		// 3. 원소를 출력
		for (Integer k : set) {
			System.out.print(k + "\t");
		}
		System.out.println();

		Iterator<Integer> it = set.iterator();

		while (it.hasNext()) {
			System.out.println("Set 요소 >>> " + it.next());
		}
	}
}
