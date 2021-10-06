package ch07_staticVsnotStartic;

public class Ex14 {
	public static void main(String[] args) {
		Car2 c1 = new Car2();
		c1.printCarNo();
		Car2 c2 = new Car2();
		c2.printCarNo();
		Car2 c3 = new Car2();
		c3.printCarNo();
		
		System.out.println(Car2.seq);
	}
}

class Car2{
	//static멤버
	static int seq;//클래스 로딩시 0으로 초기화, 생성된 객체들이 공유
	//non-static멤버
	int no;//no=0;
	//생성자
	Car2() {
		no = ++seq;
	}
	void printCarNo() {
		System.out.println(no);
	}
}