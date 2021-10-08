package ch03_abstract;
//1.객체생성불가
//2.추상메소드는 자식클래스에서 반드시 재정의 해야함
public abstract class Animal {
	abstract void run();//실행부가 없고 선언부만 존재하는 메소드 - 추상메소드:상속받은 메소드들 반드시 재정의해야함.
	void method() {}//실행부가 있는 메소드
	
	
public static void main(String[] args) {
	//실체(객체)를 생성할 수 없는 클래스 - abstract클래스
	//Animal a = new Animal();
	Fish f = new Fish();
	Bird b = new Bird();
	Insect i = new Insect();
	//a.run();
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
	//반드시 메소드 재정의 해야함.
	void run() {System.out.println("기어갑니다.");}	
}