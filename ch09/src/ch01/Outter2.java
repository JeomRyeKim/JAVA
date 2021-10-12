package ch01;

//자바8 이후 표현방식 - final이 없어도 여전히 상수인것은 변함없음.
public class Outter2 {
 void method(int arg) {//자동 상수가 됨
//	 arg = 100;
	 int localVariable;//자동 상수가 됨
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
