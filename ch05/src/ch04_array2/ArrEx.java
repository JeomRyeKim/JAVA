package ch04_array2;

public class ArrEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1,2,3,4,5 1차원배열 - 초기값을 알고 있을 때
		int[] arr1 = {1,2,3,4,5};
		//1차원 3개로 2차원 배열 만들기 {1,2,3}, {4,5,6}, {7,8,9}
		int[][] arr2 = {{1,2,3}, {4,5,6}, {7,8,9}};//3행 3열의 이차원 배열
		//2차원 2개로 3차원 배열 만들기
		//{{1,2,3}, {4,5,6}, {7,8,9}},{{10,12,13}, {14,15,16}, {17,18,19}}
		int[][][] arr3 = {{{1,2,3},
						   {4,5,6},
						   {7,8,9}},
						  {{10,12,13},
						   {14,15,16},
						   {17,18,19}}};
		
		//String.toStritg();
		//Object.toString();//Ctrl키 + 마우스커서
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				for(int k=0; k<arr3[i][j].length; k++) {
					System.out.print(arr3[i][j][k] + " ");
				}
				System.out.println();
			}
		}
	}
}


	
