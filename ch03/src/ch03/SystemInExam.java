package ch03;

/* 스캐너를 풀어쓰면 이렇게 나옴 그치만 현재는 안 씀.*/

public class SystemInExam {

	//표준 입력스트림으로 값 입력시 I/O에러 발생 가능성 있음 - 예외 처리
	public static void main(String[] args) throws Exception{//예외처리 구문 Throws Exception 추가
		// TODO Auto-generated method stub
	//표준 입력스트림으로 값 입력 받기
		System.out.println("입력:");
		int a = System.in.read();//'A' -> ascii 65로 인식
		System.out.println("출력: " + a);//Keyboard로 키를 입력 후 Enter키를 누름 (Enter키 = '\r''\n'
		System.in.read();
		System.in.read();
		
		//System.in.read()=48 or '0'; ==숫자
		System.out.println("입력:");
		int num = System.in.read() - 48; // ascii - 48  48-48=0
		// int num = System.in.read()- '0';
		System.out.println("출력: " + num);
		System.in.read();//\r
		System.in.read();//\n
		
		// (char)System.in.read(); == 문자
		System.out.println("입력: ");
		char char_ = (char) System.in.read();//'A' -> 65(int) -> char 'A'
		// int num = System.in.read()- '0';
		System.out.println("출력: " + char_);

	}

}
