package ch06_methods_01;

public class Ex05 {
public static void main(String[] args) {
	//객체 생성
	E1 e1 = new E1();
	e1.greet(7);
}
}

class E1{
	//매개변수O,리턴타입X
	//자기자신을 호출하는 메소드 - 재귀호출 메소드
	void greet(int x) {
	System.out.println("안녕:" + x);
	if(x<1) return;//void메소드내의 return의 실행 종료.
	greet(--x);
	}
}