package classes;

public class Ex09_Static {
	
	/*
	 * JVM이 main() 메서드를 호출하게 됨. 미리 메모리에 로딩이 되어 있지 않다면
	 * 인스턴스 객체를 생성하고 난 후에 main() 메서드를 호출해야 함.
	 * 불편하기 때문에 기본적으로 main() 메서드를 자동으로 호출하기 위해서
	 * static 키워드를 봍여준 것임.
	 */
	
	public static void main(String[] args) {

		System.out.println(Static.num);
		System.out.println(Static.adder(150, 36));
		
		Static static1 = new Static();
		System.out.println(static1.su1);
		System.out.println(static1.su2);
		static1.sum();
	}
}
