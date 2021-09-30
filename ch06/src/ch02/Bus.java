package ch02;

public class Bus extends Car {
	String model="Bus";

	@Override
	public void run() {
		System.out.println("Bus가 달립니다.");
		//super.run();// - 부모클래스에 있는 것을 실행하라.
	}
	

}
