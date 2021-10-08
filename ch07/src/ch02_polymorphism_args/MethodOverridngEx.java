package ch02_polymorphism_args;

public class MethodOverridngEx {
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
