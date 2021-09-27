package ch04_while;

import java.io.IOException;

public class WhileKeyControlExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		boolean run = true;
		int speed = 0;
		int KeyCode = 0;
		
		while(run) {
			if(KeyCode != 13 && KeyCode != 10) {//Enter키가 아니면
				System.out.println("----------------");
				System.out.println(("1.증속 | 2. 감속 | 3. 중지:"));
				System.out.println("----------------");
				System.out.println("선택: ");
			}
			KeyCode = System.in.read();//키보드로부터 입력
			
			if(KeyCode == 49) {//"1"
				speed++;
				System.out.println("현재 속도=" + speed);
			}else if (KeyCode == 50) {//"2"
				speed--;
				System.out.println("현재 속도=" + speed);
			}else if (KeyCode == 51) {//"3"
				run = false;
			}
			
			
		}//while끝.
		System.out.println("종료");
	}

}
