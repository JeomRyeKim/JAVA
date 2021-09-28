package Ex1;

public class Exam01 {
//3. for문을 이용해서 1부터 100까지 정수 중에서 3의 배수의 총합을 구하는 코드를 작성해보세요.
	public static void main(String[] args) {
		//누적합을 위한 정수 타입 변수 선언하고 0으로 초기화
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%3==0) {// 배수공식(해당수로 나눈 나머지가 0) : i%2==0, i%5==0
			sum+=i;
			}
		}
		System.out.println("3의 배수의 총합: " + sum);

	}

}
