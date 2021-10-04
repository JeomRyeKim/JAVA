package ch04;

//클래스의 구성 멤버 - 필드, 생성자, 메소드
public class Car {
	//필드
	int speed;
	//생성자
	Car(){
		speed=0;//같은 클래스내에서 필드 접근 "필드명"으로 접근
	}
	//메소드
	void method(int value) {
		speed = value;//같은 클래스내에서 필드 접근 "필드명"으로 접근
	}
}
