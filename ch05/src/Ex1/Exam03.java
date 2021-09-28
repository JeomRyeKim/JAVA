package Ex1;
/*5. 중첩for문을 이용하여 방정식 4x+5y=60의 모든 해를 구해서 (x,y)형태로 출력해보세요.
 * 단, x와y는 10이하의 자연수입니다.
 * 0<x<=10, 0<y<=10
 * x:1->4, y:1,2,3,4,5,6,7,8,9,10 : 5*y=56 -N
 * x:2->8, y:1,2,3,4,5,6,7,8,9,10 : 5*y=52 -N
 * ...
 * x:5->20, y:1,2,3,4,5,6,7,8,9,10 : 5*y=40 -8 : (5,8)
 * ...
 * x:40->40, y:1,2,3,4,5,6,7,8,9,10 : 5*y=20 -4 : (10,4)
 * */
public class Exam03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				if((4*i) + (5*j) == 60) System.out.println("(" + i + "," + j + ")");
			}
		}

	}

}
