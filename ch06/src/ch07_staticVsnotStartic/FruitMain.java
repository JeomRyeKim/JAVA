package ch07_staticVsnotStartic;

public class FruitMain {
	public static void main(String[] args) {
		//객체들이 공유할 수 있는 멤버 - static멤버
		Fruits f1 = new Fruits(10);
		Fruits f2 = new Fruits(50);
		Fruits f3 = new Fruits(30);
		System.out.println("첫번째 소비:"+f1.amount);
		System.out.println("두번째 소비:"+f2.amount);
		System.out.println("세번째 소비:"+f3.amount);
		System.out.println("현재 과일량:"+Fruits.currentAmount);
	}
}
