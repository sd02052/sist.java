package interfaces;

public class GoodCalc implements Calculator {

	@Override
	public int add(int su1, int su2) {
		return su1 + su2;
	}

	@Override
	public int sub(int su1, int su2) {
		return su1 - su2;
	}

	@Override
	public int mul(int su1, int su2) {
		return su1 * su2;
	}

	@Override
	public int div(int su1, int su2) {
		return su1 / su2;
	}

}
