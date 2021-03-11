package interfaces;

interface Camera {

	// 사진을 찍는 기능
	void photo();
}

interface DMB {

	// TV를 보는 기능
	void viewTv();
}

interface MP3 {

	// 음악을 듣는 기능
	void playMP3();
}

class MyPhone implements Camera, DMB, MP3 {

	@Override
	public void playMP3() {
		System.out.println("음악 듣기");
	}

	@Override
	public void viewTv() {
		System.out.println("TV 보기");
	}

	@Override
	public void photo() {
		System.out.println("사진 찍기");
	}

}

public class Ex04_Main {
	public static void main(String[] args) {

		MyPhone myPhone = new MyPhone();
		myPhone.photo();
		myPhone.playMP3();
		myPhone.viewTv();
	}
}
