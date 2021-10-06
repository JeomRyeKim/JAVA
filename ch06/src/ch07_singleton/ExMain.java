package ch07_singleton;

public class ExMain {
	public static void main(String[] args) {
		//multiton방식 - new 생성자();
		//SingleTon s1 = new SingleTon(); - private으로 접근 불가.
		//SingleTon s1 = SingleTon.instance; - private으로 접근 불가.
		//클래스명.static메소드호출();
		SingleTon s1 = SingleTon.getInstance();// - public 메소드 + getInstance로 접근 가능.
		SingleTon s2 = SingleTon.getInstance();
	
		System.out.println(s1==s2 ? "같은객체" : "다른객체");
	
	}

}
