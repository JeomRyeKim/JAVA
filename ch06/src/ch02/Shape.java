package ch02;

//하나의 소스파일에 여러개의 클래스 선언가능
public class Shape {
 String name="다각형";
}
//삼각형 사각형 오각형

//Shape클래스를 상속받은 도형들 클래스 - 내가 따로 클래스를 만들지 않았지만 bin파일에는 생김.
class Circle extends Shape{
	String name="circle";//다형성
}
class Square extends Shape{
	String name="square";
}
class Triangle extends Shape{
	String name="triangle";
}
