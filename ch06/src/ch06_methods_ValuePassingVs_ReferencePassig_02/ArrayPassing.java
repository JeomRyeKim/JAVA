package ch06_methods_ValuePassingVs_ReferencePassig_02;

public class ArrayPassing {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};//[1][2][3][4][5]
		
		//배열도 객체 - 참조주소값이 매개변수 값으로 전달 됨.
		increase(a);
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i] + " ");
		}

	}//main 끝.

	//배열이 매개값으로 전달된다는 것은 참조하는 주소값이 전달된다는 것.
	static void increase(int[] array) {
		for(int i=0; i<array.length; i++) {//[2]3][4][5][6]
			array[i]++;//int x=array[i]; x++; array[i]=x; //각 요소의 저장된 값을 1씩 증가
		}
	}
}
