package ch03;
//멤버 - 필드,메소드,생성자
public class SomeClass3 {
	//필드에 값을 저장하는 방법 1.선언시 초기화
	int f1=10;//필드
	
	//생성자 - 필드초기화
	SomeClass3(){this.f1=10;}//3.생성자로 필드를 초기화
	
	//메소드
	void method() {
		int f1=0;//로컬변수
		System.out.print(this.f1);
	}
	
	void method2() {//클래스범위에서 선언된 변수
		this.f1=10;//2.메소드에서 대입 명령문으로 값 저장
		System.out.println(f1);
		
	}
	
}
