package ch06_methods_ValuePassingVs_ReferencePassig_02;

public class ReferencePassing {
	public static void main(String[] args) {
	//Circle객체 생성
	Circle pizza = new Circle(10);
	//매개변수로 객체를 전달
	increase(pizza);
	//결과?
	System.out.println(pizza.radius);//11

	}
	static void increase(Circle m) {
		m.radius++;//11
	}

}

class Circle{
	//필드
	int radius;
	
	//생성자
	Circle(int r) {
		radius=r;
	}
	
	
}