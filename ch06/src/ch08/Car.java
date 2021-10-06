package ch08;

public class Car {
	//필드
	private int speed;
	private boolean stop;
	
	//생성자
	//메소드
	public int getSpeed() {//get + speed -> 값을 가져옴.
		return speed;
	}
	public void setSpeed(int speed) {//set + Speed -> 값 변경해줌.
		this.speed = speed;//this.필드 = 로컬변수
	}	
	
	public boolean isStop() {//boolean은 get대신 is를 사용함.
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop=stop;
	}
}
