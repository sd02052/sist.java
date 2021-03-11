package interfaces;

public interface RemoteControl {
	int max_volume = 10;
	int min_volume = 1;

	void turnOn();

	void turnOff();

	void setVolume(int volume);

}
