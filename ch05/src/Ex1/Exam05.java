package Ex1;

import java.util.Scanner;

/*7. while���� Scanner�� �̿��ؼ� Ű����κ��� �Էµ� �����ͷ� ����,���,��ȸ,���� �����
 * �����ϴ� �ڵ带 �ۼ��غ�����. �� ���α׷��� �����Ű�� ������ ���� ���� ����� ���;� �մϴ�.
 * ------------------------------
 * 1.���� | 2.��� | 3.�ܰ� | 4.����
 * ------------------------------
 * ����> 1
 * ���ݾ�>10000 // balance+=10000;
 * ------------------------------
 * 1.���� | 2.��� | 3.�ܰ� | 4.����
 * ------------------------------
 * ����> 2
 * ��ݾ�>2000 // balance-=2000;
 * ------------------------------
 * 1.���� | 2.��� | 3.�ܰ� | 4.����
 * ------------------------------
 * ����> 3
 * �ܰ�>8000 // print(balance);
 * ------------------------------
 * 1.���� | 2.��� | 3.�ܰ� | 4.����
 * ------------------------------
 * ����> 4
 * ���α׷� ���� // run!=run;
 * */
public class Exam05 {
	public static void main(String[] args) {
		//�ݺ�ó���� ���ǹ�
		boolean run = true;//
		//����ݾ� ����
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("------------------------------");
			System.out.println("����> ");
			
			int menu = scanner.nextInt();
			if(menu==1) {
				System.out.println("���ݾ�>");
				balance += scanner.nextInt();
			}else if(menu==2) {
				System.out.println("��ݾ�>");
				balance -= scanner.nextInt();
			}else if(menu==3) {
				System.out.println("�ܰ�>" + balance);			
			}else if(menu==4) {
				run = !run;
			}else {
				System.out.println("�޴���ȣ�� Ȯ���ϼ���");
			}
			
		}//while ��
		
		System.out.println("���α׷� ����");

	}

}
