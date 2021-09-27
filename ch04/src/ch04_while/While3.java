package ch04_while;

public class While3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int sum=0,i=1;
	while(i<=10) {
		sum += i;
		System.out.println(sum + "," + i);
		i++;//증가 로직으로 무한반복 해제 조건처리
	}
	System.out.println("합계: " + sum + ", i=" + i);

	}

}
