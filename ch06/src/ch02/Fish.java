package ch02;

public class Fish extends Animal{
	String name = "fish";

	@Override
	void run() {
		System.out.println(name + "가 헤엄칩니다.");
	}
	

}
