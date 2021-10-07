package ch01;

//생성자는 상속에서 제외됨.
public class GrandParent {
	public GrandParent() {
		System.out.println("최상위 부모생성자는 가장 나중에 호출되지만, 실행은 가장 먼저 됨.");
	}
}
//상속된 클래스의 컴파일시 자식생성자에 super()메소드가 자동추가됨.
class Parent extends GrandParent{
	public Parent() {
		//super();
	 System.out.println("자식클래스로부터 호출된 후 부모클래스를 호출, 부모클래스 실행 후 실행됨.");	
	}
}

class Child extends Parent{
	public Child() {
		//super();
		System.out.println("가장 먼저 호출되지만, 실행은 부모생성자 완료 후 가장 나중에 실행됨.");
	}
}