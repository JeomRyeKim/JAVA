package ch07_singleton;

/* 싱글톤으로 클래스 선언 */
public class SingleTon {
//1.자신타입의 static필드 선언 = 초기화();
	private static SingleTon instance = new SingleTon();//미리 만들기때문에 속도가 점 더 빠름.
//2.생성자를 외부에서 접근 못하게 private로 처리
	private SingleTon(){}
//3.public 메소드로 접근하도록 메소드 선언
	public static SingleTon getInstance() {
		return instance;
	}
	
	
	
}
