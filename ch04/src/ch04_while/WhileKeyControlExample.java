package ch04_while;

import java.io.IOException;

public class WhileKeyControlExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		boolean run = true;
		int speed = 0;
		int KeyCode = 0;
		
		while(run) {
			if(KeyCode != 13 && KeyCode != 10) {//EnterŰ�� �ƴϸ�
				System.out.println("----------------");
				System.out.println(("1.���� | 2. ���� | 3. ����:"));
				System.out.println("----------------");
				System.out.println("����: ");
			}
			KeyCode = System.in.read();//Ű����κ��� �Է�
			
			if(KeyCode == 49) {//"1"
				speed++;
				System.out.println("���� �ӵ�=" + speed);
			}else if (KeyCode == 50) {//"2"
				speed--;
				System.out.println("���� �ӵ�=" + speed);
			}else if (KeyCode == 51) {//"3"
				run = false;
			}
			
			
		}//while��.
		System.out.println("����");
	}

}
