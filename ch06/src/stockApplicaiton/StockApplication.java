package stockApplicaiton;

import java.util.Scanner;

public class StockApplication {
	private static Stock[] stockArray = new Stock[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int idx;// idx = 0; 초기화

	public static void main(String[] args) {
	 boolean run=true;

	 while(run) {
		 System.out.println("--------------------------------------");
		 System.out.println("1.상품등록 | 2.재고목록 | 3.입고 | 4.출고 | 5.종료");
		 System.out.println("--------------------------------------");
		 System.out.println("선택>");

		 int selectNo = scanner.nextInt();

		 switch(selectNo) {
		 case 1: createStock(); break;
		 case 2: stockList();break;
		 case 3: input();  break;
		 case 4: output(); break;
		 case 5: run=false;  break;
		 }
	 }//while 끝
	 System.out.println("프로그램 종료");
	}//main 끝
	
	//상품등록하기
	private static void createStock() {
		System.out.println("------");
		System.out.println("상품등록");
		System.out.println("------");
		System.out.print("상품명:");
		String name = scanner.next();
		System.out.print("재고량:");
		int qty = scanner.nextInt();
		Stock stock = new Stock(name, qty);
		stockArray[idx++] = stock;
		System.out.println("결과: 상품이 등록되었습니다.");
	}
	//재고목록보기
	private static void stockList() {
		System.out.println("------");
		System.out.println("재고목록");
		System.out.println("------");
		 for(int i=0;i<stockArray.length;i++) {
			 Stock stock =stockArray[i];
			 if(stock!=null) {
				 System.out.println("상품번호:"+stock.getItem());
				 System.out.println("상품명:"+stock.getName());
				 System.out.println("재고:"+stock.getQty());
				 System.out.println(stock.toString());
			 }
		  }
	}
	//입고하기
	private static void input() {
		System.out.println("------");
		System.out.println("입고");
		System.out.println("------");
		System.out.print("상품번호");
		String item = scanner.next();
		System.out.print("입고량");
		int amount = scanner.nextInt();
		Stock stock = findStock(item);

		if (stock != null) {
			stock.setQty(stock.getQty() + amount);
            System.out.println("결과: 입고가 완료되었습니다.");
		}else {
			System.out.println("결과: 상품번호를 확인해주세요.");
		}
	}
     //출고하기	
	private static void output() {
		System.out.println("------");
		System.out.println("출고");
		System.out.println("------");
		System.out.print("상품번호");
		String item = scanner.next();
		System.out.print("출고량");
		int amount = scanner.nextInt();
		Stock stock = findStock(item);

		if (stock != null) {
			if (stock.getQty() - amount >= 0) {
				stock.setQty(stock.getQty() - amount);
				System.out.println("결과: 출고가 완료되었습니다.");
			}else {
				System.out.println("결과: 재고량이 부족합니다.");
			}
		}else {
			System.out.println("결과: 상품번호를 확인해주세요.");
		} 
	}
	private static Stock findStock(String item) {
		Stock stock=null;
		for(int i=0;i<stockArray.length;i++) {
			  stock =stockArray[i];
			if(stock!=null) {  
			  if(stock.getItem().equals(item))
				break;
			}
		}
		return stock;
	}
}