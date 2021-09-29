package ch03_array;

public class Ex09 {
	public static void main(String[] args) {
		// 2,3번이 제일 많이 쓰이고 그 다음이 1번, 4번은 잘 안 쓰임.
		//1. 배열 변수 선언 후 나중에 객체 생성하여 대입
		int[] intArr1;
		System.out.println("이제부터 배열객체 생성하여 참조변수에 대입");
		intArr1 = new int[5];
		//2. 배열 변수 선언과 저장공간길이를 가지고 객체를 생성하여 대입 
		int[] intArr2 = new int[5];
		//3. 배열 변수 선언과 동시에 초기값으로 배열객체 생성하여 대입
		int[] intArr3 = {1,2,3,4,5};
		System.out.println(intArr3.length);//참조변수.length는 저장되는 요소의 개수,생성시확정,수정불가.
		//4. 배열 변수 선언 후 나중에 초기값으로 배열객체 생성하여 대입
		int[] intArr4;
		System.out.println("이제부터 배열객체 생성하여 참조변수에 대입");
		intArr4 = new int[] {1,2,3,4,5};
	}

}
