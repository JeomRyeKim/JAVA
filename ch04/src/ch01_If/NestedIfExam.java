package ch01_If;

import java.util.Scanner;
//4학년인 경우 70점 이상, 그 외 60점 이상이면 합격
public class NestedIfExam {
   public static void main(String[] args) {
	   //scanner객체 생성
      Scanner scanner = new Scanner(System.in);

      System.out.print("점수를 입력하세요(0~100): ");
      int score = scanner.nextInt(); 

      System.out.print("학년을 입력하세요(1~4): ");
      //int타입 값 입력
      int year = scanner.nextInt(); 
      //if문 내의 if~else if~else문
      if(score >= 60) { // 60점 이상
         if(year != 4)//4학년이 아니면 참
            System.out.println("합격!"); // 4학년 아니면 합격
         else if(score >= 70)//70점 이상이면 합격
            System.out.println("합격!"); // 4학년이 70점 이상이면 합격
      else//4학년이고 70점 미만이면 불합격
         System.out.println("불합격!"); // 4학년이 70점 미만이면 불합격
      }else // 60점 미만 불합격
         System.out.println("불합격!");

      scanner.close();
   }
}