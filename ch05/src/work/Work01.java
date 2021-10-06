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
		boolean run = true;
		double maleSTD = 1.10, femaleSTD = 1.07;
		int COMSTD = 128, COMSTD2 = 100;
		
		while(run) {
		System.out.println("여자면 W, 남자면 M을 입력하세요: ");
		String gender = scanner.next();
		System.out.println("10세~39세 사이 나이를 입력하세요: ");
		int age = scanner.nextInt();
		System.out.println("키를 입력하세요(단위:cm): ");
		double height = scanner.nextDouble();
		System.out.println("몸무게를 입력하세요(단위:kg): ");
		double weight = scanner.nextDouble();
		
		//체지방량 구하기
		//남성 = (1.10 * 체중) - (128 * (체중*체중)/(키*키))
		//여성 = (1.07 * 체중) - (128 * (체중*체중)/(키*키))
		double leanBodyMass = 0.0;
		switch (gender) {
		case "M":
			leanBodyMass = (maleSTD * weight) - (COMSTD * ((weight * weight) / (double) (height * height)));
			break;
		case "F":
			leanBodyMass = (femaleSTD * weight) - (COMSTD * ((weight * weight) / (double) (height * height)));
			break;
		}
		System.out.println("결과: ");
		System.out.println("체지방량:%.2f\n" + leanBodyMass);
		
		System.out.println("계속할까요?(yes or no): ");
		String yon = scanner.next();
		if(yon.equals("no")) run = !run;
		}

		//체지방량(=체중-제지방량) 구하기
		double bodyFatMass = 0.0;
		bodyFatMass = weight - leanBodyMass;

		//체지방률(=제지방량*100)/체중
		double leanBodyRatio = (leanBodyMass * 100) / (double) weight;

		//체지방률(=체지방량*100/체중)
		double bodyFatRatio = (bodyFatMass * 100) / (double) weight;


		System.out.println("결과:>");
		System.out.printf("제지방률:%.2f\n", leanBodyRatio);
		System.out.printf("체지방량:%.2f\n", bodyFatMass);
		System.out.printf("체지방률:%.2f\n", bodyFatRatio);


		String result = "";
		//남/여 별 비만도 구분
		switch (gender) {
		case "M":
			if (bodyFatRatio < 12)
				result = "야윈 몸";
			else if (bodyFatRatio <= 17)
				result = "표준";
			else if (bodyFatRatio <= 22)
				result = "과체중";
			else if (bodyFatRatio <= 27)
				result = "비만";
			else
				result = "고도비만";

			break;
		case "F":
			if (bodyFatRatio < 22)
				result = "야윈 몸";
			else if (bodyFatRatio <= 27)
				result = "표준";
			else if (bodyFatRatio <= 35)
				result = "과체중";
			else if (bodyFatRatio <= 40)
				result = "비만";
			else
				result = "고도비만";
			break;
		}// switch문 끝.
		
		System.out.println("결과:>");
		System.out.println(result);
	}
}