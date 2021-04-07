package DTO;

public class MemberDTO {

	private int no;
	private String name;
	private String nickName;
	private String id;
	private String pass;
	private int mileage;

	public MemberDTO(int no, String name, String nickname, String id, String pass, int mileage) {
		this.no = no;
		this.name = name;
		this.nickName = nickname;
		this.id = id;
		this.pass = pass;
		this.mileage = mileage;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

}
