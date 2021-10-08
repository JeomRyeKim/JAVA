package ch02_polymorphism;

public class Shape {
//필드
 public Shape next;
 protected String name;
//생성자
 public Shape() {next=null;}
//메소드
 public void draw() {System.out.println("Shape");}

 public void paint() {draw();}
}//Shape끝
 
class Line extends Shape{
	public void draw() {System.out.println("Line");}
}
class Rect extends Shape{
	public void draw() {System.out.println("Rect");}
}
class Circle extends Shape{
	public void draw() {
		name="Circle";//자식클래스에서 재할당된 값
		System.out.println("Circle");
		super.name="Shape";//부모필드 접근 - 정적바인딩.
		super.draw();//부모메소드호출 - 정적바인딩
		System.out.println(name);
	}
}