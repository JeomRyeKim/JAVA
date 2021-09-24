package ch02_Switch;

/* 자바 6까지 switch()문 안에 - byte,char,short,int,long변수나 정수값을 산출하는 연산식만 올 수 있음.*/
public class SwitchCharExample {
public static void main(String[] args) {
		char grade = 'A';
		
		switch(grade) {
		case 'A':
		case 'a': // 'A' 와 'a'를 같은 수로 보겠다
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':// 'B' 와 'b'를 같은 수로 보겠다
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
		}

	}

}
