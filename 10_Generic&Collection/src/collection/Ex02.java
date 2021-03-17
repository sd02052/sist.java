package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02 {
	public static void main(String[] args) {

		// 다형성으로 객체 생성
		List<String> list = new ArrayList<String>(); // 부모의 참조변수를 이용해서 자식의 객체를 생성 - 다형성

		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");

		// 자바의 컬렉션 프레임워크에서 컬렉션에 저장되어 있는 요소들을
		// 읽어오는 방법을 표준화 해 놓은 객체 Iterator 객체임.
		Iterator<String> it = list.iterator();

		// hasNext() : 다음 요소가 있는지, 읽어올 요소가 있는지 확인하는 메서드. boolean형
		while (it.hasNext()) {
			// next() : 다음 요소를 가져오는 메서드
			System.out.println(it.next());
		}
	}
}
