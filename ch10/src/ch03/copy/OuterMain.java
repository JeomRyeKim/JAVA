package ch03.copy;

public class OuterMain {
public static void main(String[] args) {
	Outter out = new Outter();
	//Outter클래스의 필드 a의 메소드 호출
	try { //최종적으로 호출한 이곳에서 마지막으로 예외 처리해주는것
	out.method();
	}catch (Exception e) {}
	}
}
