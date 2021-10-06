package ch07_initialBlock;

public class Init3Ex {
	public static void main(String[] args) {
		System.out.println("초기화 테스트");
		Block b1 = new Block();//static초기화 -> 인스턴스 초기화 -> 생성자 출력
		Block b2 = new Block();//인스턴스 초기화 -> 생성자 출력
		//Block b3 = new Block();//인스턴스 초기화 -> 생성자 출력
	}

}
//실행순서 - static초기화 -> 인스턴스 초기화 -> 생성자
class Block{
	{//인스턴스 초기화 블럭
		System.out.println("인스턴스 초기화 블럭");
	}
	//static의 특성 - unique특성 - 최초 클래스 로드시 한번만 실행
	static {//static 초기화 블럭
		System.out.println("클래스-static 초기화 블럭");
	}
	//생성자
	Block(){System.out.println("생성자");}
}