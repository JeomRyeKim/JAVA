package ch02;

public class Bus extends Car {
	String model="Bus";

	@Override
	public void run() {
		System.out.println("Bus�� �޸��ϴ�.");
		//super.run();// - �θ�Ŭ������ �ִ� ���� �����϶�.
	}
	

}
