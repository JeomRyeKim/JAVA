package ch06_methods;

//클래스 멤버 필드, 생성자, 메소드
public class Car {
	//메소드
	//리턴타입 메소드명(매개변수){실행부 내에 return문 반드시 있어야함.}
boolean isLefrGas() {
	int gas = 5;
	//조건에 따라 return문이 실행되는
	//로직인 경우 뒤에 return 처리 후에 
	//조건이 false일 경우 실행할 명령문이 올 수 있다.
	if(gas==0) {
		System.out.println("gas가 없습니다.");
		return false;
	}
	System.out.println("gas가 있습니다.");
	return true;
}
}
