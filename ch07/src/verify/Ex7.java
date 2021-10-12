package verify;

public class Ex7 {
public static void main(String[] args) {
	SnowTire snowTire = new SnowTire();
	Tire tire = snowTire;//promotion(upcasting)
	
	//오버라이딩된 메소드의 동적바인딩 
	//메소드의 실행내용이 호출시점에 결정
	//자식클래스에서 재정의된 메소드는 부모타입으로 형 변환이 되어도
	//자식클래스에서 재졍의된 메소드의 내용이 실행됨 - 다형성
	snowTire.run();
	tire.run();
}
}
class Tire{
	public void run(){System.out.println("일반 타이어가 굴러갑니다.");}
}
class SnowTire extends Tire{
	@Override
	public void run() {System.out.println("스노우 타이어가 굴러갑니다.");}
}