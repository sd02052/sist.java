package Exam;

public class Permanent extends Employee {

	private int pay; // 급여
	private int bonus; // 보너스

	public Permanent() {
	} // 기본 생성자

	public Permanent(String name, int pay, int bonus) {
		super(name);
		this.pay = pay;
		this.bonus = bonus;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	int getPays() {
		return pay + bonus;
	}

}
