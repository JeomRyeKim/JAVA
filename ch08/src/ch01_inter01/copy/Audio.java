package ch01_inter01.copy;

public class Audio implements RemoteControl {
//필드
	private int volume;
	static final int MAX_VOLUME = 10;
	static final int MIN_VOLUME = 0;
	
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
	}
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME) {
			volume = MAX_VOLUME;
		}else if (volume > MIN_VOLUME) {
			volume = MIN_VOLUME;
		}
		System.out.println("현재 Audio 볼륨");
	}
	
}
