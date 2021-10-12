package ch04.copy;

public class Car {
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new KumhoTire(),
			new KumhoTire(),
	};
	
//	void run() {
//		for(int i=0; i<tires.length; i++)
//			tires[i].roll();
	
	void run() {
		for(Tire tire : tires)
			tire.roll();
	}
	
public static void main(String[] args) {
	Car myCar = new Car();
	myCar.run();
}
}
