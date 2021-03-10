package inheritance;

import java.util.Scanner;

class Volume {

	int vol = 1;

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	void volume_up() {
		vol++;
		if (vol > 15) {
			vol = 15;
		}
	}

	void volume_down() {
		vol--;
		if (vol < 1) {
			vol = 1;
		}
	}
}

class Tv extends Volume {

}

class Computer extends Volume {

}

class Radio extends Volume {

}

public class Ex05_Remote {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Tv tv = new Tv();
		Computer computer = new Computer();
		Radio radio = new Radio();

		int menu, volume;

		while (true) {
			System.out.print("1. TV / 2. Radio / 3. Computer / 4. 종료 : ");
			menu = sc.nextInt();

			if (menu == 4) {
				break;
			}

			System.out.print("1. 볼륨 Up / 2. 볼륨 Down :");
			volume = sc.nextInt();

			switch (menu) {
			case 1:
				if (volume == 1) {
					tv.volume_up();
				} else if (volume == 2) {
					tv.volume_down();
				}
				break;
			case 2:
				if (volume == 1) {
					radio.volume_up();
				} else if (volume == 2) {
					radio.volume_down();
				}
				break;
			case 3:
				if (volume == 1) {
					computer.volume_up();
				} else if (volume == 2) {
					computer.volume_down();
				}
				break;
			}

			System.out.println();
			System.out.println("::::::::::::::::::::::::::::::::::::");
			System.out.println(
					"Tv : " + tv.getVol() + " / Radio : " + radio.getVol() + " / Computer: " + computer.getVol());
		}

		System.out.println();
		System.out.println("수고하셨습니다.");

		sc.close();
	}
}
