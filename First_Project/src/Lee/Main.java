package Lee;

public class Main {
	public Main() {
		DBConnection db = new DBConnection();
		db.connect();
		new MemberLogin();
		db.disconnect();
	}
}
