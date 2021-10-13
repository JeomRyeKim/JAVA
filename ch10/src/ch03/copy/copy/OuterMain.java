package ch03.copy.copy;

public class OuterMain {
//최종 main메소드는 예외를 받아서 자체처리하든지
//떠넘길 수 있습니다.(jvm에게)
public static void main(String[] args) throws Exception{
	Outter out = new Outter();
	//Outter클래스의 필드 a의 메소드 호출
	out.method();
	}
}
