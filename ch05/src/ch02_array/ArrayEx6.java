package ch02_array;

public class ArrayEx6 {
	public static void main(String[] args) {
		//정수타입 10개의 변수에 저장된 값의 평균 구하기		
		//배열선언
		//타입 변수명[];
		//변수명 = new 타입[] {초기값1,초기값2,초기값3...);
		int scores[] = null;
		//배열 참조 변수 선언 후 나중에 초기값으로 배열생성시는 new타입[]을 {}앞에 붙여줘야함.
		scores = new int[] {10,15,5,7,8,3,9,10,5,4};
		
		System.out.println(scores.length);
		
		int sum=0;
		
		for(int i=0; i<scores.length; i++) {
			sum = sum + scores[i];//배열에 저장된 요소 접근 - 배열변수명[index번호]
		}
		double avg = sum/(double)scores.length;
		System.out.println("avg:" + avg);
		
		

	}

}
