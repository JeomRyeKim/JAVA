package ch02_polymorphism;

public class Car {
	//필드 초기화 int = 10;
	//필드의 다형성
	//Tire tire = new Tire();
	//Tire tire = new HanKookTire();
	Tire tire = new KumhoTire();
}
class Tire{
	void run() {}
}

class HanKookTire extends Tire{}
class KumhoTire extends Tire{}