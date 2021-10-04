package ch04;

public class Person {
	//Car객체 생성
	//필드선언 객체로 초기화
	Car myCar = new Car();
	
	//필드 사용
	void useCar() {
		//외부객체(person)에서
		//Car객체의 필드 접근
		//참조변수.필드명
		myCar.speed=60;
	}
}
