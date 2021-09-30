package ch02;

public class Bird extends Animal{
	String name="새";

	@Override
	void run() {
	System.out.println(name + "가 날라갑니다.");
	}
}