package ch05_fields;

//public을 붙이지 않은 클래스는 하나의 소스파일에 여러개 선언가능
class Car4{
	String kind;
	static String color;
	static int count;
}

//소스파일명과 public으로 선언한 클래스명은 동일해야함.
public class Car1Ex {
	public static void main(String[] args) {
		//Car4클래스로부터 Car4객체(instance)생성
		Car4 c1 = new Car4();
	}
}
