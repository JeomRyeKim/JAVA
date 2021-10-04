package ch02_01;

public class UserBank {
	public static void main(String[] args) {
		// Bank객체 생성
		Bank bank = new Bank();
		//System.out.println("잔고:" + bank.balance);
		//bank.balance=10000;
		//if(bank.balance - 15000>=0)
		//bank.balance=bank.balance - 15000;
		//입금기능 호출
		bank.deposit(10000);
		
		//출금기능 호출
		//bank.withdraw(15000);
		
		//잔고 출력
		bank.currentBalance();

	}

}
