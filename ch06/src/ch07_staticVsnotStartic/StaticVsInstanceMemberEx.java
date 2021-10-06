package ch07_staticVsnotStartic;

public class StaticVsInstanceMemberEx {
	public static void main(String[] args) {
		int a=10;//로컬변수-main메소드 내에서만 사용.
	}
}

class A1{
	//인스턴스 필드와 메소드
	int field1;
	void method1() {}
	
	//정석 필드와 메소드
	static int field2;
	static void method2() {}
	
	//인스턴스 메소드에서 같은 클래스내의 static멤버, instance멤버 모두 접근(호출)가능
	void method4() {
		this.field1=0;//인스턴스 필드
		field2=10;//static 필드
		method1();//인스턴스 메소드
		method2();//static 메소드
	}
	
	//static 메소드 내에서는 static으로 선언된 멤버(필드와 메소드)만 사용가능.
	//static 메소드 내에서는 this. 사용 불가.
	//this는 객체가 만들어진 이후에 사용가능 -> 힙영역에 인스턴스(객체)가 만들어지고 사용됨.
	//힙영역에 있는 this는 스테틱영역에 있는 static(객체X)은 this 사용 불가함.
	static void method3() {
		//field1=0;//인스턴스 필드 
		//this.fidld1=10; //this키워드 사용불가.
		field2=10;//static 필드
		//method1();//인스턴스 메소드
		//this.method1(); // this키워드 사용불가.
		method2();//static 메소드
	}
	
}