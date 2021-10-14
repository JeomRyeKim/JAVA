package ch01_Object.copy.copy;

import java.util.Date;

public class ToStringEx {
	public static void main(String[] args) {
		A a = new A();
		a.f1="field1";
		a.i1=10;
		System.out.println(a.toString());//15db9742이 toString메소드(16진수로 되어있음)
		
		//Date클래스의 toString()은 날짜정보출력하도록 재정의 됨.
		Date date=new Date();
		System.out.println(date.toString());
		
		//System.out.print()메소드의 매개변수로 참조변수가 전달되면
		// toString()메소드가 자동 호출
		System.out.println(a);//toString()자동 호출
		System.out.println(date);//toString()자동 호출
	}
}
class A extends Object{
	String f1;
	int i1;
	@Override
	public String toString() {
		return "A[f1=" + f1 + ", i1=" + i1 + "]";
	}
	
	
	
}