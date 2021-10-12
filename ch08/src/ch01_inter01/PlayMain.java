package ch01_inter01;

public class PlayMain {
	// 필드
	//사용하는 객체에 직접 접근시 - 종속적
	//사용하는 객체가 변경
//	Television tv = new Television();
	Audio audio = new Audio();
	
	public static void main(String[] args) {
		PlayMain p = new PlayMain();
		//사용하는 객체 변경에 따라 내용(소스 코드) 변경
//		p.tv.turnOn();
//		p.tv.setVolume(5);
//		p.tv.turnOff();
		
		p.audio.turnOn();
		p.audio.setVolume(5);
		p.audio.turnOff();

	}

}
