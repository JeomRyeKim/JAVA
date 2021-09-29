package ch03_array;

public class EX11 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1차원 배열의 복사
		int[] intArr1 = {1,2,3,4,5};
		//새로운 참조변수 선언 intArr1의 배열의 내용을 복사
		//방법: intArr1이 참조하는 주소값을 전달하여 복사
		int[] intArr2 = intArr1;//intArr2에는 intArr1의 주소값이 전달됨.
		
		for(int a:intArr1)
			System.out.print(a+ " ");
		System.out.println();
		for(int b:intArr2)
			System.out.print(b+ " ");
		
		System.out.println();
		System.out.println("--------------");
		//intArr2의 index번호 3에 해당하는 위치의 값 변경
		intArr2[3] = 10;	
		for(int a:intArr1)
			System.out.print(a+ " ");
		System.out.println();
		for(int b:intArr2)
			System.out.print(b+ " ");
		
	}

}
