package ch03;

public class Animal {
	void run() {
		System.out.println("이동합니다");
	}
public static void main(String[] args) {
	//실체(객체)를 생성
	Animal a = new Animal();
	Fish f = new Fish();
	Bird b = new Bird();
	Insect i = new Insect();
	a.run();
	f.run();
	i.run();
	}
}

class Fish extends Animal{
	void run() {System.out.println("헤엄칩니다.");}
}
class Bird extends Animal{
	void run() {System.out.println("날아갑니다.");}	
}
class Insect extends Animal{
	//메소드 재정의 안 함.
}