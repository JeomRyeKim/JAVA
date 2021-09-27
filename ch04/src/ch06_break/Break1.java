package ch06_break;

public class Break1 {
	public static void main(String[] args) {
		int num = 0, sum = 0;
		while(true) {
			num++;//1씩 증가
			sum += num;//누적해서 더하기//while블럭을 빠져나가는 조건 break;
			if(num==50) break;
		}
		System.out.println("합계 :" + sum);
	}

}
