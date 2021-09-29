package ch04_array2;

import java.util.Scanner;

public class ArrayExam2 {
 public static void main(String[] args) {
  //성적표 프로그램
  //스캐너로 값을 입력받기 int[] score = {76,45,34,89,100,50,90,92};
  //int[] scores=new int[8];
  //입력이 끝나면 합계, 평균 출력하기
  // for문과 향상된 for문으로 출력하기
  // 1.성적입력 | 2.통계(합/평균)출력 | 3. 성적순 출력하기 | 4.종료
  // ch04 - 7번 참조.
	 //키보드로부터 정수를 입력받기 위한 scanner객체 생성
	 Scanner scanner = new Scanner(System.in);
	 //배열선언
	 int [] scores = new int[8];
	 //반복문을 빠져나가기 위한 조건문
	 boolean run = true;
	 int sum = 0;
	 while(run) {
		 System.out.println("----------------------------------------------------");
		 System.out.println("1.성적입력 | 2.통계(합/평균)출력 | 3. 성적순 출력하기 | 4.종료");
		 System.out.println("----------------------------------------------------");
		 int menu = scanner.nextInt();
		 
		 switch(menu) {
		 case 1 : System.out.println("성적입력>");
		 	for(int i=0; i<scores.length; i++) {
		 		scores[i] = scanner.nextInt();
		 	} break;
		 case 2 : System.out.println("통계출력>");
		 	for(int i:scores) {
		 		sum +=i;
		 	} 
		 	System.out.println("성적합계>" + sum);
		 	System.out.println("성적평균>" + (sum/(double)scores.length));
		 	break;
		 case 3 : System.out.println("성적순 출력>");
		 	int temp=0;//변수 바꾸기용 임시저장 변수.
		 	for(int i=0; i<scores.length; i++) {//이런경우 향상된 for문 사용하기 어려움.
		 		for(int j=i+1; j<scores.length; j++) {
		 			if(scores[i] < scores[j]) {//오름차순은 큰 값이 뒤로 가야하는데 큰 값이 앞에 있으면 뒤로 이동시킴.
		 				temp = scores[i];//임시저장
		 				scores[i] = scores[j];//뒤의 값을 앞으로 이동
		 				scores[j] = temp;//앞의 값을 뒤로 이동.
		 			}
		 		}//안쪽 for문
		 	}//바깥쪽 for문
		 		
		 	for(int i:scores) 
		 		System.out.print(i + ", ");	 	 
		 	System.out.println();
		 	break;
		 case 4 : run = !run;
		 	
		 }
	 }//반복문
	 System.out.println("종료");
	 	 

	}

}
