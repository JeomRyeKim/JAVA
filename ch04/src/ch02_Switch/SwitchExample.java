package ch02_Switch;

public class SwitchExample {
public static void main(String[] args) {
		int time = (int)(Math.random()*4)+8; // 8, 0,1,2,3, 8,9,10,11
		
		System.out.println("[현재시각: " + time + "시");
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		case 11:
			System.out.println("외근을 나갑니다.");
		}
	}

}
