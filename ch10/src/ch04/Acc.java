package ch04;

public class Acc {
 private String ano;
 private String owner;
 private int balance;
 
public Acc(String ano, String owner, int balance) {
	this.ano = ano;
	this.owner = owner;
	this.balance = balance;
}

public String getAno() {
	return ano;
}

public void setAno(String ano) {
	this.ano = ano;
}

public String getOwner() {
	return owner;
}

public void setOwner(String owner) {
	this.owner = owner;
}

public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	this.balance = balance;
}
 
//입금
public void deposit(int amount) {
	balance += amount;
}

//출금
public void withdraw(int amount) {
	//예외 발생
	try {
	if(balance-amount < 0) { 
		throw new Exception("잔고부족 예외");
	}
	 balance -= amount;//따로 빼놔야 실행 안 됨.
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
}


}
