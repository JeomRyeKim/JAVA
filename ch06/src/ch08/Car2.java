package ch08;

public class Car2 {
	//필드
	private int speed;
	private boolean stop;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {//값을 받아서 변화시켜야하니 매개변수가 있어야함.
		if(speed<0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;		
		}
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {//값을 받아서 변화시켜야하니 매개변수가 있어야함.
		this.stop = stop;
		this.speed=0;//초기화
	}
	
}
