package ch01_If_02;

import java.util.Scanner;

public class If8_JustEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���: ");
		int num = scanner.nextInt();
		
		if (num == 12 || num == 1 || num ==2 ) {
			System.out.println("�ܿ�");
		}else if (num == 3 || num == 4 || num == 5 ) {
			System.out.println("��");
		}else if (num == 6 || num == 7 || num == 8 ) {
			if (num == 6) System.out.println("�ʿ���");
			else if (num == 7) System.out.println("�ֿ���");
			else System.out.println("������");
			
		}else if (num == 9 || num == 10 || num == 11 ) {
			System.out.println("����");
		}else {
			System.out.println("�� �� �Է��ϼ̽��ϴ�.");
		}
			

	}

}
