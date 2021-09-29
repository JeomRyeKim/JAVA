package ch04_array2;

public class Array2Exam5 {
public static void main(String[] args) {
	//2차원배열 - 성적표 작성
	String title = "성적표";
	String[] head = {"이름","국어","영어","수학","총점","평균"};
	System.out.println("\t\t" + title);
	for(String h:head)System.out.print(h + "\t");
	System.out.println("\n============================================");
	String[] name = {"홍길동","일지매","임꺽정","이순신"};
	int sum=0;
	int[][] score= {{90,80,70},
					{76,86,90},
					{90,78,90},
					{80,65,87}};
	//
	for(int i=0; i<score.length; i++) {//score.length-배열의 행의 개수
		System.out.print(name[i] + "\t");
		for(int j=0; j<score[i].length; j++) {//score[i].length = 배열의 각 행의 열의 개수
			System.out.print(score[i][j] + "\t");
			sum+=score[i][j];//각 행별 누적값 계산
		}//안쪽 for문
		System.out.println(sum + "\t" + sum/score[i].length);	
		sum=0;//초기화
	}//바깥쪽 for문
	System.out.println("============================================");
	}

}
