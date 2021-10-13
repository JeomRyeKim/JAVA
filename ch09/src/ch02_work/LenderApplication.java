package ch02_work;

import java.util.Calendar;
import java.util.Scanner;

public class LenderApplication {
	//타입[] 변수
	//클래스[] 변수
	private static SeperateVolume[] svArr = new SeperateVolume[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int idx;//idx=0;
	
	public static void main(String[] args){
	 boolean run=true;
	 while(run) {
		 System.out.println("--------------------------------------");
		 System.out.println("1.도서등록 |2.도서목록 |3.대여 |4.반납|5.종료");
		 System.out.println("--------------------------------------");
		 System.out.println("선택>");
		 
		 int selectNo = scanner.nextInt();
		 switch(selectNo) {
		 case 1: registerBook(); break;
		 case 2: bookList();break;
		 case 3: checkOut();  break;
		 case 4: checkIn(); break;
		 case 5: run=false;  break;
		 }
	 }
	 System.out.println("프로그램 종료");
		
	}
	
	//도서등록 - Ctrl + F
	private static void registerBook() {
		System.out.println("------");
		System.out.println("도서등록");
		System.out.println("------");
		
		System.out.print("제목:");
		String name = scanner.next();
		System.out.print("저자:");
		String writer = scanner.next();
		
		SeperateVolume sv = new SeperateVolume(name, writer);
		
		svArr[idx++] = sv;
		
		System.out.println("결과:등록 되었습니다.");
	}
	//도서리스트
	private static void bookList() {
		System.out.println("------");
		System.out.println("도서 목록");
		System.out.println("------");
		
		//객체 참조타입 배열을 순차적으로 읽으면서 참조변수가 null이 아닐때만 출력.
		 for(int i=0;i<svArr.length;i++) { //오류발생
			 SeperateVolume sv =svArr[i];
			 if(sv!=null) {
				 System.out.println(sv.toString()); //null로 되어있는 참조변수의 값을 toString()으로 읽으면 nullPointer오류발생
			 }
		  }
	}
	
	//대여
	private static void checkOut() {
		System.out.println("------");
		System.out.println("대여");
		System.out.println("------");
		System.out.print("도서번호>");//대여할 도서번호
		String requestNo = scanner.next();
		System.out.print("회원명");//대출자
		String name=scanner.next();
		//대여일자 자동생성 "2021/10/13"
		Calendar cal = Calendar.getInstance();
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH)+1;
		int date=cal.get(Calendar.DATE);
		//도서번호로 대여 도서 찾기
		SeperateVolume sv = findVolume(requestNo);
		if (sv != null) {
			//대출처리 메소드 실행
			sv.checkOut(name, year+"/"+month+"/"+date);
		}else {
			System.out.println("결과:도서번호를 확인해주세요.");
		}
	}
	
     //반납	
	private static void checkIn() {
		System.out.println("------");
		System.out.println("반납");
		System.out.println("------");
		System.out.print("도서번호");
		String requestNo = scanner.next();
		
		SeperateVolume sv = findVolume(requestNo);
		if (sv != null) {
			sv.checkIn();
		} else {
			System.out.println("결과:도서 번호를 확인해주세요.");
		}
	}
     
	//도서번호로 도서 찾기
	//참조타입 배열의 값 비교
	private static SeperateVolume findVolume(String requestNo) {
		SeperateVolume sv=null;//로컬변수
		for(int i=0;i<svArr.length;i++) {
			  sv =svArr[i];
			if(sv!=null) {  
			  if(sv.getRequestNo().equals(requestNo))
				break;//ano에 해당하는 객체 리턴
			}
		}
		return sv;	//배열 전체를 찾아도 없으면 null리턴
	}
}