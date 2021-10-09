package ch02_polymorphism_args;

public class MethodOverridngEx {
	//매개변수의 다형성
 static void paint(Shape p) {
	 p.draw();
 }
 public static void main(String[] args) {
	Line line = new Line();
	paint(line);
	paint(new Shape());
	paint(new Line());
	paint(new Rect());
	paint(new Circle());
}
}
