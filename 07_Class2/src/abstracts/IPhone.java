package abstracts;

public class IPhone extends SmartPhone {

	@Override
	void spec() {
		company = "애플";
		name = "IPhone 12 pro";
		color = "black";
		size = "22cm";
		weight = "200g";
		price = "130만원";

		System.out.println(company + " / " + name + " / " + color + " / " + size + " / " + weight + " / " + price);
	}
}
