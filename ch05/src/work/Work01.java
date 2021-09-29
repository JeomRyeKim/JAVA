package work;

import java.util.Scanner;

/*과제 제출기한 10/4일(월) 23:59분 까지
 * 스캐너로 입력값 입력받기 성별, 나이, 키, 몸무게
 * 반복처리 가능하게 만들고 
 * 계속 여부 출력후 yes/no값을 받아서 종료하도록 수정하기.
 * https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=kmovie97&logNo=150186681215
 * */
public class Work01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 제지방량 구하기
		final double ST1 = 1.10;
		final double ST2 = 128;

		int weight = 75;
		int height = 175;

		//제지방량
		double result = ST1 * weight - ST2 * 
				        ((weight * weight) /(double)(height * height)); 

		System.out.println(result);

		// 체지방량 구하기
		double result2 = weight - result;

		System.out.println(result2);

		// 체지방률 구하기 = 체지방량*100/체중
		final double ST3 = 100;

		double result3 = result2 * ST3 / weight;

		System.out.println(result3);
	}
}