package ch07_singleton_01;

/* 싱글톤으로 클래스 선언 */
public class SingleTon {
//1.자신타입의 static필드 선언 = 초기화();
	private static SingleTon instance;//null
//2.생성자를 외부에서 접근 못하게 private로 처리
	private SingleTon(){}
//3.public 메소드로 접근하도록 메소드 선언
	public static SingleTon getInstance() {
		if(instance==null) instance = new SingleTon(); //뒤에 만들어야해서 속도가 좀 더 느림
		return instance;//null
	}
	
	
	
}
