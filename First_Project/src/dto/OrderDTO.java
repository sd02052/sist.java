package dto;

public class OrderDTO {

	private String order_date;
	private String menu_name;
	private int order_count;
	private int order_total;
	private String payment;

	public String getOrder_date() {
		return order_date;
	}

	public void setOrderdate(String order_date) {
		this.order_date = order_date;
	}

	public String getMenu_name() {
		return menu_name;
	}

	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}

	public int getOrder_count() {
		return order_count;
	}

	public void setOrder_count(int order_count) {
		this.order_count = order_count;
	}

	public void setOrder_total(int order_total) {
		this.order_total = order_total;
	}

	public int getOrder_total() {
		return order_total;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getPayment() {
		return payment;
	}

}
