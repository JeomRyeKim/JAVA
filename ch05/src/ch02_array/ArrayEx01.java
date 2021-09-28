package ch02_array;

public class ArrayEx01 {

	public static void main(String[] args) {
		//정수타입 10개의 변수에 저장된 값의 평균 구하기
		int s1=10;
		int s2=15;
		int s3=5;
		int s4=7;
		int s5=8;
		int s6=3;
		int s7=9;
		int s8=10;
		int s9=5;
		int s10=4;
		int sum=0;
		int cnt=0;
		sum += s1;
		cnt++;
		sum += s2;
		cnt++;
		sum += s3;
		cnt++;
		sum += s4;
		cnt++;
		sum += s5;
		cnt++;
		sum += s6;
		cnt++;
		sum += s7;
		cnt++;
		sum += s8;
		cnt++;
		sum += s9;
		cnt++;
		sum += s10;
		cnt++;
		double avg = sum/(double)cnt;
		System.out.println("avg:" + avg);
		
		

	}

}
