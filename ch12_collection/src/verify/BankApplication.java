package verify;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApplication {
	//List로 변경
	static List<Account> accountList  = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	 boolean run=true;
	 while(run) {
		    printMenu();
		 int selectNo = scanner.nextInt();
		 switch(selectNo) {
		 case 1: createAccount(); break;
		 case 2: accountList();break;
		 case 3: deposit();  break;
		 case 4: withdraw(); break;
		 case 5: transfer(); break;
		 case 6: run=false;  break;
		 }
	 }
	 System.out.println("프로그램 종료");
	}
	
	private static void printMenu() {
	 System.out.println("------------------------------------------");
	 System.out.println("1.계좌생성 |2.계좌목록 |3.예금 |4.출금|5.이체|6.종료");
	 System.out.println("------------------------------------------");
	 System.out.println("선택>");
	}
	
	//1번계좌의 balance-=amount, 2번계좌의 balance+=amount;
	private static void transfer() {
		System.out.println("------");
		System.out.println("이체");
		System.out.println("------");
		//보내는 계좌
		System.out.print("보내는 계좌번호>");
		String ano1 = scanner.next();
		//받는 계좌
		System.out.print("받는 계좌번호>");
		String ano2 = scanner.next();
		//이체 금액
		System.out.print("이체액>");
		int amount = scanner.nextInt();
		//보내는 계좌와 받는 계좌 모두 맞아야됨.
		if(findAccount(ano1)==null || findAccount(ano2)==null) {
			System.out.println("계좌번호를 확인하세요!!");
		}else {//계좌번호가 모두 맞으면 이체 처리
			Account a1 = findAccount(ano1);
			Account a2 = findAccount(ano2);
			// 보내는 쪽 : 잔고-이체액,  받는 쪽: 잔고+이체액
			if (a1.getBalance() - amount >= 0) {
				a1.setBalance(a1.getBalance()-amount);
				a2.setBalance(a2.getBalance()+amount);
				System.out.println("이체가 완료되었습니다.");
			 }else {
				System.out.println("결과:잔고가 부족합니다.");
			}
		}//이체 처리
	}
	//계좌생성하기
	private static void createAccount() {
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		System.out.print("계좌주:");
		String owner = scanner.next();
		System.out.print("초기입금액:");
		int balance = scanner.nextInt();
		//계좌 생성
		Account acc = new Account(owner, balance);
		//리스트에 담기
		accountList.add(acc);
		
		System.out.println("결과:계좌가 생성되었습니다.");
	}
	//계좌목록보기
	private static void accountList() {
		System.out.println("------");
		System.out.println("계계좌목록");
		System.out.println("------");
		
		//list에서 index번호에 해당하는 객체 얻기 get(index)
		 for(int i=0;i<accountList.size();i++) {
			    Account account=accountList.get(i);
			    System.out.println(account);
		 }
	}
	
	//예금하기
	private static void deposit() {
		System.out.println("------");
		System.out.println("예금");
		System.out.println("------");
		System.out.print("계좌번호");
		String ano = scanner.next();
		System.out.print("예금액");
		int amount = scanner.nextInt();
		//해당 계좌번호 찾기
		Account acc = findAccount(ano);
		System.out.println("조회결과:"+acc);
		//해당계좌 존재 여부확인
		if (acc != null) {
			acc.setBalance(acc.getBalance() + amount);
            System.out.println("결과:예금이 성공되었습니다.");
		}else {
			System.out.println("결과:계좌번호를 확인해주세요.");
		}
	}
     //출금하기	
	private static void withdraw() {
		System.out.println("------");
		System.out.println("출금");
		System.out.println("------");
		System.out.print("계좌번호");
		String ano = scanner.next();
		System.out.print("출금액");
		int amount = scanner.nextInt();
		//계좌정보 조회
		Account acc = findAccount(ano);
		//계좌 존재확인
		if (acc != null) {//출금
			if (acc.getBalance() - amount >= 0) {
				acc.setBalance(acc.getBalance() - amount);
				System.out.println("결과:출금이 성공되었습니다.");
			}else {
				System.out.println("결과:잔고가 부족합니다.");
			}
		}else {//재확인요청
			System.out.println("결과:계좌번호를 확인해주세요.");
		} 
	}
     
	//Account 배열에서 ano와 동일한 Account 객체 찾기-
	//참조타입 배열의 값 비교
	private static Account findAccount(String ano) {
		//list에 저장된 객체 갯수 size()
		for(int i=0;i<accountList.size();i++) {
			  Account account =accountList.get(i);// 
		   if(account.getAno().equals(ano)) return account;
		}
		return null;	//배열 전체를 찾아도 없으면 null리턴
	}
}