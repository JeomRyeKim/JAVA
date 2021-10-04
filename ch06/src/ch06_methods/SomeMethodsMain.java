package ch06_methods;

public class SomeMethodsMain {
	public static void main(String[] args) {
		SomeMethods sm = new SomeMethods();
		//외부에서 SomeMethods클래스내의 메소드 호출
		//참조변수명.메소드명(dot-notation:.표기법)으로 호출
		sm.run();
		sm.innerMethod();
		sm.stop();

	}

}
