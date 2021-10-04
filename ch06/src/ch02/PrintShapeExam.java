package ch02;

public class PrintShapeExam {
	public static void main(String[] args) {
		Shape shape = new Shape();
		Triangle triangle = new Triangle();
		Circle circle = new Circle();
		Square square = new Square();
		
		System.out.println(triangle.name);
		System.out.println(circle.name);
		System.out.println(square.name);

	}

}
