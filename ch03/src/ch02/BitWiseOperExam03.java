package ch02;

public class BitWiseOperExam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// 1 2 3 4 5 6 7 8 9 a b c d e f
	short a = (short)0x55ff;// 5 5 15 15 => 5*16^3 + 5*16^2 + 15*16^1 + 15*16^0 = 20480+1280+240+15=22015;
					 //	5	5		f	f
					 //0101 0101  1111 1111
	short b = (short)0x00ff;// 0 0 15 15 => 225;
					 //	0	0		f	f
					 //0000 0000  1111 1111
	System.out.println(a);//short -> int
	System.out.println(b);//short -> int

	//비트 논리 연산
	System.out.println("[비트 연산 결과]");
	//printf()문 출력 포멧 메소드, printf("%출력포멧",값);//값을 포멧 형태로 출력해줌.
	System.out.println((short)(a&b));// A and B
	//System.out.printf("%04x\n",(short)(a&b));// A and B,%포멧 시작, 0x는 16진수, \n은 escape문자 다음줄로 이동
	System.out.printf("%04x\n",(short)(a&b));// A and B,%포멧 시작, 0x는 16진수, 04x=>0x사이의 4는 출력 길이표시
	System.out.printf("%04x\n",(short)(a|b));// 0101 0101 1111 1111
	System.out.printf("%04x\n",(short)(a^b));// 0101 0101 0000 0000
	System.out.printf("%04x\n",(short)(~a));// ~0101 0101 1111 1111 => 1010 1010 0000 0000 => 10 10 0 0 = a a 0 0
	
	System.out.println("hello");
	System.out.printf("hello");// 옆에 붙어서 출력됨.
	System.out.println("hello");
	}

}
