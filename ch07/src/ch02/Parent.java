package ch02;

public class Parent {
public static void main(String[] args) {
	Child child = new Child();
	child.method3();
}
void method1() {}
void method2() {System.out.println("부모메소드");}
}
class Child extends Parent{
	//재정의 - 실행부{}를 다시 선언.
	void method2() {System.out.println("자식메소드");}
	//추가
	void method3() {
		method2();//재정의된 자식메소드 호출
		//부모클래스의 메소드 호출 : 명시적으로 super.부모메소드()를 사용.
		super.method2();//원래의 부모메소드 호출
	}
}