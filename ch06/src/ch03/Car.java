package ch03;

import ch01.Engine;
import ch01.Handle;
import ch01.Tire;

//클래스의 구성 멤버-필드, 생성자, 메소드
public class Car {
	//필드 선언
	//타입 필드명[=초기값];
	//필드 선언시 초기값을 주지 않으면
	//해당 타입의 기본값으로 초기화됨.
	
	//고유속성
	String company = "현대자동차";//참조타입 필드
	String model = "그랜저";//참조타입 필드
	int maxSpeed = 300;//기본타입 필드
	
	int productionYear;//기본타입 필드 - 값:0
	
	//현재 상태
	int currentSpeed;//기본타입 필드 - 값:0
	boolean engineStart;//기본타입 필드 - 값:false
	
	//부품
	Engine engine;//참조타입 필드 - 값:null
	Handle handle;//참조타입 필드 - 값:null
	Tire tire;//참조타입 필드 - 값:null
}
