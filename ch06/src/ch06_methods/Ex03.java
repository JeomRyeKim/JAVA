package ch06_methods;

public class Ex03 {

	public static void main(String[] args) {
	Car1 c1 = new Car1();
	//3유형 메소드 호출
	c1.setCc(1000);
	c1.setColor("red");
	c1.setKind("sonata");
	}

}

class Car1{
	//필드
	String kind;
	int cc;
	String color;
	//3유형 메소드(매개변수O, 리턴타입X)
	public void setKind(String kind) {
		this.kind = kind;
	}
	//3유형
	public void setCc(int cc) {
		this.cc = cc;
	}
	//3유형
	public void setColor(String color) {
		this.color = color;
	}
	
	//
}