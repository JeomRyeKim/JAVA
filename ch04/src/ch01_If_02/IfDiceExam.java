package ch01_If_02;

/* 주사위(dice) 1~6 눈을 가진 주사위*/
public class IfDiceExam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		//0+1 <= (int)(Math.random()*6)+1 < 6+1
		
		num = (int)(Math.random()*6)+1; // 1, 2, 3, 4, 5, 6 중에서 나옴.
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		}else if(num==2) {
			System.out.println("2번이 나왔습니다.");
		}else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		}else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		}else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		}else //if(num==6); {
			System.out.println("6번이 나왔습니다.");
		

	}

}
