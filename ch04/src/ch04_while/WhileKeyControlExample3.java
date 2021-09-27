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
		
		//스캐너는 enter키 값을 제거 한 후 값을 리턴.
		while(run) {
			if(KeyCode != -1) {//
				System.out.println("----------------");
				System.out.println(("1.증속 | 2. 감속 | 3. 중지:"));
				System.out.println("----------------");
				System.out.println("선택: ");
			}
			KeyCode = scanner.nextInt();//키보드로부터 int타입 값 입력
			
			if(KeyCode == 1) {//"1"
				speed++;
				System.out.println("현재 속도=" + speed);
			}else if (KeyCode == 2) {//"2"
				speed--;
				System.out.println("현재 속도=" + speed);
			}else if (KeyCode == 3) {//"3"
				run = false;
			}
			
			
		}//while끝.
		System.out.println("종료");
	}

}
