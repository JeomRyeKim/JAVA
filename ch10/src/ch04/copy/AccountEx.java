package ch04.copy;

public class AccountEx {
public static void main(String[] args) {
	Acc acc = new Acc("111-001","홍길동",10000);
	//입금
	acc.deposit(10000);
	System.out.println(acc.getBalance());
	//출금
	try {
	acc.withdraw(15000);
	System.out.println(acc.getBalance());
	
	acc.withdraw(15000);
	System.out.println(acc.getBalance());
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}
