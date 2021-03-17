package model;

public class MemberDTO {

	// 만약 DB상의 테이블의 이름이 member(회원 테이블)이라고 가정했을 때
	// member 테이블의 구성(컬럼)이 id, pwd, name, age, address로
	// 구성되었다고 가정을 하면

	// 멤버변수
	private String id; // 회원 아이디
	private String pwd; // 회원 비밀번호
	private String name; // 회원 이름
	private int age; // 회원 나이
	private String address; // 회원 주소

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
