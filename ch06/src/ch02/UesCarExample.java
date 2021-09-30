package ch02;

public class UesCarExample {
	public static void main(String[] args) {
		//Car鸥涝 函荐 = new Car();
		Car car = new Car();
		System.out.println(car.model);
		car.run();
		//Truck按眉 积己
		Truck truck = new Truck();
		System.out.println(truck.model);
		truck.run();
		
		//Bus按眉 积己
		Bus bus = new Bus();
		System.out.println(bus.model);
		bus.run();
	}

}
