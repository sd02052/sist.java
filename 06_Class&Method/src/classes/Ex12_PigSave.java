package classes;

public class Ex12_PigSave {
	public static void main(String[] args) {

		// 돼지 저금통 객체 생성
		PigSave pig = new PigSave(0);

		pig.deposite(3000); // 입금
		pig.deposite(5000); // 입금

		pig.withdraw(2000); // 출금
		pig.withdraw(10000); // 출금

		// pig.balance = 10000; // 이렇게 직접 접근을 하면 안됨.
		
		
		
	}
}
