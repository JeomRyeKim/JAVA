package ch05_constructor_01;

public class UserCar {
public static void main(String[] args) {
	/*Car(String model, String color, int maxSpeed){
	this.model = model;
	this.color = color;
	this.maxSpeed = maxSpeed;
	가 있었기 때문에 따로 Car(){}기본생성자를 추가하지 않음.*/
	
	//컴파일된 클래스에 Car()기본생성자가 없음.
	//호출불가이므로 오류 발생
	//Car car = new Car();
	//다른 생성자 - 클ㄹ스에 있는 생성자 호출.
Car car = new Car("소나타","흰색",200);
	}

}
