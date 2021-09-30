package ch04_array2;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //1. id="hong", pwd="1234"
	  // id와 pwd를 scanner로 입력받아서 id와 pwd가 둘다 같으면 "login성공",
	  // 아니면 "1회 실패하였습니다". 출력
	  // 5회 실패하면, "5회 실패하였습니다. 프로그램을 종료 합니다" 출력 후 종료
	  Scanner scanner = new Scanner(System.in);
	  int cnt=0;//초기화
	  for(;;) {//무한반복
		   String id,pwd;//참조타입 변수
		   //cnt증가하는 로직
		   if(cnt==5) {//기본데이타 타입의 값 비교 - 명령문이 1개이면 {}필요없음 밑에는 2개라서 쓴 것.
			   System.out.println(cnt+"회 실패하였습니다. 프로그램을 종료 합니다");
			   break;
		   }
		   
		   System.out.println("아이디와 패스워드를 입력하세요.");
		   System.out.println("아이디>");
		   id=scanner.next();//String타입으로 전달
		   System.out.println("패스워드>");
		   pwd=scanner.next();//String타입으로 전달
		   
		   //(아이디 비번 맞는지 확인하는 로직)둘 다 내용이 맞으면 바로 프린트하고 빠져나온다.
		   if("hong".equals(id) && "1234".equals(pwd))//참조객체의 비교 와 논리곱연산 
	        {System.out.println("login 성공");
	        break;
	        }
		   
		   		 
		   
		   //실패시(둘 의 내용이 맞지 않으면)	
		   cnt++;//증가
		   if(cnt!=5)
		   System.out.println(cnt +"회 실패하였습니다.");
	  }
			System.out.println("프로그램 종료");
	}
}
