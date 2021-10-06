package ch06_methods_01;

public class Ex01 {

	public static void main(String[] args) {
		//객체 생성
		A1 a1 = new A1();
		//메소드 호출 - 참조변수.메소드명(값,값);
		a1.add(10, 10);//기본타입 값
		a1.print("hello");//참조타입 값 전달
	}

}
class A1{
	//기본타입 매개변수
	void add(int x, int y) {
		System.out.println("합계:" + (x+y));
	}
	//참조타입 매개변수
	void print(String msg) {
		System.out.println("전달사항:" + msg);
	}
}