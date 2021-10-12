package ch01.copy.copy;

public class A {
//인스턴스 멤버 클래스
class B{
	 B(){}
	 int field1;
	 //static int field2;
	 void method1() {}
	 //static void method2() {}
 }
 static class C{
	 C(){}
	 int field1;
	 static int field2;
	 void method1() {}
	 static void method2() {}
 }
 
 void method() {
	 //로컬 클래스 
	 class D{
		 D(){System.out.println("로컬클래스 생성자");}
		 int field1;
		 //static int field2;
		 void method1() {System.out.println("로컬클래스 D의 메소드");}
		 //static void method2() {}
	 }
	 D d=new D();
	 d.field1=3;
	 d.method1();
 }
  void method2() {
	  
 //로컬 클래스 
 class D{
	 D(){System.out.println("로컬클래스 생성자");}
	 int field1;
	 //static int field2;
	 void method1() {System.out.println("로컬클래스 D의 메소드");}
	 //static void method2() {}
 }
 D d=new D();
 d.field1=3;
 d.method1();
 
  }
}
//class B{}