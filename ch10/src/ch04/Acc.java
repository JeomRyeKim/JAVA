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
 
//�Ա�
public void deposit(int amount) {
	balance += amount;
}

//���
public void withdraw(int amount) {
	//���� �߻�
	try {
	if(balance-amount < 0) { 
		throw new Exception("�ܰ����� ����");
	}
	 balance -= amount;//���� ������ ���� �� ��.
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
}


}
