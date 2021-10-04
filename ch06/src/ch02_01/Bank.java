package ch02_01;
//은행업무 클래스(설계도)
public class Bank {
	//현재잔고 금액 필드
	private int balance=0;
	//입금기능
	public void deposit(int amount) {
		balance += amount;
	}
	//출금
	public void withdraw(int amount) {
		if(balance - amount >= 0)
		balance -= amount;
	}
	//잔고 출력
	public void currentBalance() {
		System.out.println("잔고:" + balance);
	}
	

}
