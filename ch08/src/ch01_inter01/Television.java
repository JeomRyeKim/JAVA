package ch01_inter01;

public class Television {
//필드
	private int volume;
	static final int MAX_VOLUME=10;
    static final int MIN_VOLUME=0;
	
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME) {
			volume = MAX_VOLUME;
		}else if (volume > MIN_VOLUME) {
			volume = MIN_VOLUME;
		}
		System.out.println("현재 TV 볼륨");
	}
	
}
