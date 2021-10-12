package ch01;

public class InterMain1 {
	public static void main(String[] args) {
		//인터페이스로 생성자를 호출해서 객체 생성불가 G1()
//		G1 g1 = new G1();
		G2 g2 = new G2();
		G3 g3 = new G3();
		//선언은 인터페이스타입 = 객체의 생성은 실체 클래스
		G1 g1 = g2;
		//다형성 - G1인 G2타입으로 변환
		g1.a();
		//다형성
		g1 = g3;
		//G1이 G3타입으로 변환
		g1.a();
	}

}
