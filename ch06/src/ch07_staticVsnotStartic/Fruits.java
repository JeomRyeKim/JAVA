package ch07_staticVsnotStartic;

public class Fruits {
	//필드
	//static
	static int currentAmount = 100;
	//non-static
	int amount;	
	//생성자
	Fruits(int amount){
		this.amount=amount;
		currentAmount -= amount;
	}
}
