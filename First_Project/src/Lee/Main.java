package Lee;

public class Main {
	static public DBConnection db = new DBConnection();

	public static void main(String args[]) {
		db.connect();
		new MemberLogin();
	}
}
