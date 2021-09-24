package ch02_Switch;

/* 주사위(dice) 1~6 눈을 가진 주사위*/
public class SwitchDiceExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		num = (int)(Math.random()*6)+1; // 1, 2, 3, 4, 5, 6 중에서 나옴.
		System.out.println(num);
		
		switch(num) {//변수 - 누적해서 나옴.
		case 1: System.out.println("1번이 나왔습니다.");
		case 2: System.out.println("2번이 나왔습니다.");
		case 3: System.out.println("3번이 나왔습니다.");
		case 4: System.out.println("4번이 나왔습니다.");
		case 5: System.out.println("5번이 나왔습니다.");
		default: System.out.println("6번이 나왔습니다.");
		}

	}

}
