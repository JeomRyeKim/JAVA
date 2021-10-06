package ch07_staticVsnotStartic;

public class CarMain {
public static void main(String[] args) {
	//non-static멤버는 객체를 생성 후 접근가능
	//non=static멤버는 객체마다 개별적으로 생성	
	Car myCar = new Car();
	myCar.gas=10;
	myCar.setSpeed(80);
	//객체 소멸시 같이 사라짐.
	myCar=null;
	
	Car yourCar = new Car();
	yourCar.gas=20;
	yourCar.setSpeed(100);
	yourCar=null;
}
}
class Car{
	//필드
	int gas;//gas=0
	
	//메소드
	void setSpeed(int speed) {}
}