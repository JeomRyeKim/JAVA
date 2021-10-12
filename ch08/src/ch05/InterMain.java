package ch05;

public class InterMain {
	public static void main(String[] args) {
		//CA -> C -> A
		InterfaceA ia = new CA();
		ia.methodA();
		//interfaceA에 없는 메소드
//		ia.methodC();
		
		//CA -> C -> B
		InterfaceB ib = new CA();
		ib.methodB();
		//interfaceB에 없는 메소드
//		ib.methodC();
			
		

	}

}
