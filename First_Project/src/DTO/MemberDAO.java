package DTO;

public class MemberDAO {

	private static MemberDAO instace = null;

	private MemberDAO() { // private으로 외부접근 막고
	}

	public static MemberDAO getInstance() { // 내부에서 인스턴스 생성.
		if (instace == null) {
			instace = new MemberDAO();
		}
		return instace;
	}
}
