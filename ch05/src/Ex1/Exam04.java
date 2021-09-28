package Ex1;
/* 6.for문을 이용해서 실행 결과와 같은 삼각형을 출력하는 코드를 작성해보세요.
 *  *
 *  **
 *  ***
 *  ****
 *  *****
 * */
public class Exam04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {    //i : 1,2,3,4,5 //세로로 *가 생기는 형태
			for(int j=1; j<=i; j++) {//j : 1,2,3,4,5 //가로로 *가 생기는 형태
			System.out.print("*");//가로
			}
			System.out.println();//세로

		}

	}

}
