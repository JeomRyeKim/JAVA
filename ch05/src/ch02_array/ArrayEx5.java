package ch02_array;

public class ArrayEx5 {
	public static void main(String[] args) {
		//정수타입 10개의 변수에 저장된 값의 평균 구하기		
		//배열선언
		//타입 변수명[] = {초기값1,초기값2,초기값3...};
		//배열에 저장할 개수와 초기값을 알고 있을 때는 초기값으로 배열을 바로 초기화하면서 생성가능.
		//생성시 scores.length는 {}에 저장된 개수로 초기화됨.
		int scores[] = {10,15,5,7,8,3,9,10,5,4};
		System.out.println(scores.length);
		
		int sum=0;
		
		for(int i=0; i<scores.length; i++) {
			sum = sum + scores[i];//배열에 저장된 요소 접근 - 배열변수명[index번호]
		}
		double avg = sum/(double)scores.length;;//scores.length;로 쓰면 개수가 바뀌어도 자동으로 바뀌니 편함.
		System.out.println("avg:" + avg);
		
		

	}

}
