package work;

import java.util.Scanner;

/* 체지방 구하기 */
public class Work02 {
	public static void main(String[] args) {
	/* 
	 * 1. 제지방 구하기 : 남성 1.10 * 체중 - (129*(체중^2)/(키^2))
	 * 				   여성 1.07 * 체중 - (129*(체중^2)/(키^2))
	 * 2. 제지방량 = 체중 - 제지방량
	 * 2-1. 제지방율 = 제지방량 * 100 / 체중
	 * 3. 체지방율 = 체지방량 * 100 / 체중 
	 * */
		
	Scanner scanner = new Scanner(System.in);
	final double maleSTD = 1.10, FemaleSTD = 1.07;
	final int COMSTD = 128, COMSTD2=100;
	boolean run = true;
	
	while(run) {
	System.out.println("\n====================================");
	System.out.println("정확한 계산을 위하여 아래 정보를 입력 바랍니다.");
	System.out.println("====================================");
	System.out.println("성별(남자(M)/여자(F))입력> ");
	String gender = scanner.next();
	System.out.println("나이(정수:10~39)입력> ");
	int age = scanner.nextInt();
	System.out.println("키 입력(단위:cm)> ");
	double height = scanner.nextDouble();
	System.out.println("몸무게 입력(단위:kg)> ");
	double weight = scanner.nextDouble();
	
	//1. 제지방량 구하기
	double leanBodyMass=0.0;
	switch(gender) {
	case "M":leanBodyMass = (maleSTD*weight) - (COMSTD*((weight*weight)/(double)(height*height)));
	case "F":leanBodyMass = (FemaleSTD*weight) - (COMSTD*((weight*weight)/(double)(height*height)));		
	}
	//2.체지방량 구하기(=체중 - 체지방량)
	double bodyFatMass=0.0;
	bodyFatMass = weight - leanBodyMass;
	
	//2-1.제지방률
	double leanBodyRatio = (leanBodyMass*COMSTD2)/(double)weight;
	
	//3.체지방률 구하기
	double bodyFatRatio = (bodyFatMass*COMSTD2)/(double)weight;
	
	//4.비만도 계산
	//남/녀
	String result = "";
	switch(gender) {
	case"M":if(bodyFatRatio < 12 ) result = "야윈 몸";//0~12미만
			else if (bodyFatRatio <= 17) result = "표준";//12~17
			else if (bodyFatRatio <= 22) result = "과체중";//18~22
			else if (bodyFatRatio <= 27) result = "비만";//22~27
			else result = "고도비만";//>=28
			break;		
	case"F":if(bodyFatRatio < 22 ) result = "야윈 몸";//0~22미만
			else if (bodyFatRatio <= 27) result = "표준";//22~27
			else if (bodyFatRatio <= 35) result = "과체중";//28~35
			else if (bodyFatRatio <= 40) result = "비만";//36~40
			else result = "고도비만";//>=41
			break;
	}
	
	System.out.println("결과:> ");
	System.out.printf("체지방량:%.2f\n", leanBodyMass);
	System.out.printf("제지방율:%.2f\n", leanBodyRatio);
	System.out.printf("체지방량:%.2f\n", bodyFatMass);
	System.out.printf("체지방율:%.2f\n", bodyFatRatio);
	System.out.println("결과:" + result);
	
	
	//계속 여부 확인
	System.out.println("계속할까요?(yes/no)");
	String yesno = scanner.next();
	if(yesno.equals("no")) run = !run;
	
	}while(run);//while 끝
	System.out.println("프로그램 종료");
}
}
