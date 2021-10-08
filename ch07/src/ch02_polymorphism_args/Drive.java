package ch02_polymorphism_args;

public class Drive {
 void drive(Vehicle v) {
	 v.run();	 
 }
 void drive(Vehicle[] vs) {
	 for(Vehicle v:vs) {
		 v.run();
	 }
 }
 public static void main(String[] args) {
	Drive drv = new Drive();
	
	Vehicle v1 = new Vehicle();
	drv.drive(v1);
	//매개변수의 다형성
	Bus bus = new Bus();
	drv.drive(bus);
	//매개변수의 다형성
	Truck truck = new Truck();
	drv.drive(truck);
	
	Vehicle[] vehicles = new Vehicle[4];
	vehicles[0]=v1;
	vehicles[1]=bus;
	vehicles[2]=truck;
	vehicles[3]=bus;
	
	drv.drive(vehicles);
}
}
