package abstracts;

public class Ex03_SmartPhone {
	public static void main(String[] args) {

		Galaxy galaxy = new Galaxy();
		IPhone iPhone = new IPhone();

		galaxy.purpose();
		galaxy.spec(); // 추상메서드 재정의한 메서드를 호출

		System.out.println();

		iPhone.purpose();
		iPhone.spec(); // 추상메서드 재정의한 메서드를 호출
	}
}
