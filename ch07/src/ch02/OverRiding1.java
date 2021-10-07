package ch02;

class D1{
	void a() {
		System.out.println("대박 부모 메소드");
	}
}
//overrinding 메소드명, 매개변수, 반환형 일치, 접근지정자는 자식이 부모모다 넓어야.
class D2 extends D1{
	public void a() { System.out.println("대박 자식 메소드");	}//overriding
	public void a(int k) {//추가된 메소드, -overloading
		System.out.println("k method");
	}
}

public class OverRiding1{
	public static void main(String[] args) {
	 D1 d1 = new D1(); d1.a();
	 D2 d2 = new D2(); d2.a(); d2.a(7);
	 //자식객체를 생성하여 부모타입으로 형변환 후 메소드 실행
	 //자식클래스에서 재정의된 메소드는 부모클래스로 형변환하더라도 실행시 재정의된 내용으로 실행
	 //자식클래스에서 추가된 메소드는 부모클래스로 형변환시 실행불가(원래 부모메소드에 없었기 때문)
	 D1 d3 = new D2(); d3.a(); 
	 //d3.a(7);//
	 
	}
}