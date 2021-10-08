package ch03_abstract;

/* 추상클래스 - 일반메소드, 추상메소드 */
public abstract class AbstractEx1 {
	//
 void print() {System.out.println("일반메소드");}
}

//추상메소드가 있는 클래스는 반드시 추상클래스
abstract class AbstractEx2{
	abstract void print2();
}
