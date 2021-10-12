package ch01;

//자바7 까지 표현
public class Outter {
 void method(final int arg) {
//	 arg = 100; - final때문에 사용X
	 final int localVariable;
	 localVariable=1;
//	 localVariable=10;
	 //로컬클래스
	 System.out.println(arg);
	 //메소드내의 로컬클래스에서 사용되는 변수는 
	 //무조건 final 필드여야한다.
	 class Innter{
		 public void method() {
			 int result=arg+localVariable;
		 }
	 }
 }
}
