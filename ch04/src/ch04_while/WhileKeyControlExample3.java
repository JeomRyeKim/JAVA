package ch04_while;

import java.io.IOException;
import java.util.Scanner;

public class WhileKeyControlExample3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		boolean run = true;
		int speed = 0;
		int KeyCode = 0;
		Scanner scanner = new Scanner(System.in);
		
		//��ĳ�ʴ� enterŰ ���� ���� �� �� ���� ����.
		while(run) {
			if(KeyCode != -1) {//
				System.out.println("----------------");
				System.out.println(("1.���� | 2. ���� | 3. ����:"));
				System.out.println("----------------");
				System.out.println("����: ");
			}
			KeyCode = scanner.nextInt();//Ű����κ��� intŸ�� �� �Է�
			
			if(KeyCode == 1) {//"1"
				speed++;
				System.out.println("���� �ӵ�=" + speed);
			}else if (KeyCode == 2) {//"2"
				speed--;
				System.out.println("���� �ӵ�=" + speed);
			}else if (KeyCode == 3) {//"3"
				run = false;
			}
			
			
		}//while��.
		System.out.println("����");
	}

}
