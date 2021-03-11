package interfaces;

public class Ex05_Remote_Main {
	public static void main(String[] args) {

		Audio audio = new Audio();
		Computer computer = new Computer();
		Tv tv = new Tv();

		// Audio
		audio.turnOn();
		audio.setVolume(7);
		audio.turnOff();

		// Computer
		computer.turnOn();
		computer.setVolume(13);
		computer.turnOff();

		// Tv
		tv.turnOn();
		tv.setVolume(0);
		tv.turnOff();
	}
}
