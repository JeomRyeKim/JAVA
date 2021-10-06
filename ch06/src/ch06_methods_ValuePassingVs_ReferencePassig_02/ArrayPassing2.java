package ch06_methods_ValuePassingVs_ReferencePassig_02;

public class ArrayPassing2 {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};//[1][2][3][4][5]
		
		//배열도 객체 - 참조주소값이 매개변수 값으로 전달 됨.
		increase(a);
		
		System.out.println("a배열 의 요소값");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}//main 끝.

	//배열이 매개값으로 전달된다는 것은 참조하는 주소값이 전달된다는 것.
	static void increase(int[] array) {
		//새로운 배열 생성
		int[] newArr = new int[array.length];
		for(int i=0; i<array.length; i++) {
			newArr[i] = array[i];
		}
		
		for(int i=0; i<newArr.length; i++) {//[2][3][4][5][6]
			array[i]++;
		}		
		System.out.println("메소드에서 새로 생성한 배열의 요소값");
		for(int i=0; i<newArr.length; i++) {
			System.out.print(newArr[i] + " ");
			}
			System.out.println();
		}
	}

