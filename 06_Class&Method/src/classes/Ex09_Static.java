package classes;

public class Ex09_Static {
	public static void main(String[] args) {

		System.out.println(Static.num);
		System.out.println(Static.adder(150, 36));
		
		Static static1 = new Static();
		System.out.println(static1.su1);
		System.out.println(static1.su2);
		static1.sum();
	}
}
