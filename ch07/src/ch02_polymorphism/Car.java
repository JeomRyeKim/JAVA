package ch02_polymorphism;

public class Car {
	//�ʵ� �ʱ�ȭ int = 10;
	//�ʵ��� ������
	//Tire tire = new Tire();
	//Tire tire = new HanKookTire();
	Tire tire = new KumhoTire();
}
class Tire{
	void run() {}
}

class HanKookTire extends Tire{}
class KumhoTire extends Tire{}