package stockApplicaiton;

import java.util.Scanner;

public class StockApplication {
	private static Stock[] stockArray = new Stock[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int idx;// idx = 0; �ʱ�ȭ

	public static void main(String[] args) {
	 boolean run=true;

	 while(run) {
		 System.out.println("--------------------------------------");
		 System.out.println("1.��ǰ��� | 2.����� | 3.�԰� | 4.��� | 5.����");
		 System.out.println("--------------------------------------");
		 System.out.println("����>");

		 int selectNo = scanner.nextInt();

		 switch(selectNo) {
		 case 1: createStock(); break;
		 case 2: stockList();break;
		 case 3: input();  break;
		 case 4: output(); break;
		 case 5: run=false;  break;
		 }
	 }//while ��
	 System.out.println("���α׷� ����");
	}//main ��
	
	//��ǰ����ϱ�
	private static void createStock() {
		System.out.println("------");
		System.out.println("��ǰ���");
		System.out.println("------");
		System.out.print("��ǰ��:");
		String name = scanner.next();
		System.out.print("���:");
		int qty = scanner.nextInt();
		Stock stock = new Stock(name, qty);
		stockArray[idx++] = stock;
		System.out.println("���: ��ǰ�� ��ϵǾ����ϴ�.");
	}
	//����Ϻ���
	private static void stockList() {
		System.out.println("------");
		System.out.println("�����");
		System.out.println("------");
		 for(int i=0;i<stockArray.length;i++) {
			 Stock stock =stockArray[i];
			 if(stock!=null) {
				 System.out.println("��ǰ��ȣ:"+stock.getItem());
				 System.out.println("��ǰ��:"+stock.getName());
				 System.out.println("���:"+stock.getQty());
				 System.out.println(stock.toString());
			 }
		  }
	}
	//�԰��ϱ�
	private static void input() {
		System.out.println("------");
		System.out.println("�԰�");
		System.out.println("------");
		System.out.print("��ǰ��ȣ");
		String item = scanner.next();
		System.out.print("�԰�");
		int amount = scanner.nextInt();
		Stock stock = findStock(item);

		if (stock != null) {
			stock.setQty(stock.getQty() + amount);
            System.out.println("���: �԰� �Ϸ�Ǿ����ϴ�.");
		}else {
			System.out.println("���: ��ǰ��ȣ�� Ȯ�����ּ���.");
		}
	}
     //����ϱ�	
	private static void output() {
		System.out.println("------");
		System.out.println("���");
		System.out.println("------");
		System.out.print("��ǰ��ȣ");
		String item = scanner.next();
		System.out.print("���");
		int amount = scanner.nextInt();
		Stock stock = findStock(item);

		if (stock != null) {
			if (stock.getQty() - amount >= 0) {
				stock.setQty(stock.getQty() - amount);
				System.out.println("���: ��� �Ϸ�Ǿ����ϴ�.");
			}else {
				System.out.println("���: ����� �����մϴ�.");
			}
		}else {
			System.out.println("���: ��ǰ��ȣ�� Ȯ�����ּ���.");
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