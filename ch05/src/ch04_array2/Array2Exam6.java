package ch04_array2;

public class Array2Exam6 {
public static void main(String[] args) {
	//2차원배열 - 성적표 작성
	String title = "성적표";
	String[] head = {"이름","국어","영어","수학","총점","평균"};
	System.out.println("\t\t" + title);
	for(String h:head)System.out.print(h + "\t");
	System.out.println("\n============================================");
	String[] name = {"홍길동","일지매","임꺽정","이순신"};
	int sum=0;
	int[] tot = new int [4];//각 행의 각 열의 값 누적해서 저장하기 위한 변수
	
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
			tot[j] += score[i][j];//각 과목별 누적값 계산[국+국+국+국][영+영+영+영][수+수+수+수][]
		}//안쪽 for문
		System.out.println(sum + "\t" + sum/score[i].length);	
		tot[tot.length-1]+=sum;//tot마지막에 sum값 저장
		sum=0;//초기화
	}//바깥쪽 for문
	System.out.println("============================================");
	//각 과목별 합계 구하기
	System.out.print("합 계\t");
	for(int i=0; i<tot.length; i++) {
		System.out.print(tot[i] + "\t");
		//sum += tot[i];
	}
	System.out.println("\n============================================");
	}

}

