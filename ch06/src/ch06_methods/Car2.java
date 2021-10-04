package ch06_methods;

//클래스 멤버 - 필드, 생성자, 메소드
public class Car2 {
	//메소드
int gas;
//리턴타입 없는 메소드에서 return문은
//메소드를 종료하는 역할 - 결과를 되돌려주는 것은 아님.
void run() {
	while(true) {
		if(gas>0) {
			System.out.println("달립니다.(gas잔량:"+gas+")");
			gas--;
		}else {
			System.out.println("멈춥니다.(gas잔량:"+gas+")");
			return;//메소드 종료 - 메소드를 멈추는 역할, 값을 되돌려주는 역할은 아님.
		}
	}
}
}
