package ch02_priority;

public class MainThreadExample {
public static void main(String[] args) {
	//공유객체
	Calculator calculator = new Calculator();
	
	User1 user1 = new User1();
	user1.setCalculator(calculator);//객체 공유
	user1.start();
	
	User2 user2 = new User2();
	user2.setCalculator(calculator);//공유
	user2.start();
}
}
