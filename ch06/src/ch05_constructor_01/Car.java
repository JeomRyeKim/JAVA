package ch05_constructor_01;


public class Car{
	//필드
	String model;
	String color;
	int maxSpeed;
	//생성자
	//클래스명(매개변수1,매개변수2,매개변수3){}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
/*컴파일시 Car(매개변수1,매개변수2,매개변수3,...){}
 * 생성자가 존재하므로 클래스파일에 기본생성자를 추가하지않음.
 * public class Car{
 * X -> Car(){}기본생성자를 추가하지 않음.
 *  String model;
	String color;
	int maxSpeed;
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
 * */
