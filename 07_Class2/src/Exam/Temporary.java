package Exam;

public class Temporary extends Employee {
	private int time;
	private int pay;

	public Temporary() {
	}

	public Temporary(String name, int time, int pay) {
		super(name);
		this.time = time;
		this.pay = pay;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	@Override
	int getPays() {
		return time * pay;
	}
}
