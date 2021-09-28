package Ex1;
/*4. while문과 Math.random()메소드를 이용해서 두 개의 주사위를 던졌을 때
 * 나오는 눈을 (눈1,눈) 형태로 출력하고, 눈의 합이 5가아니면 계속 주사위를 던지고,
 * 눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요. 눈의 합이 5가 되는 조합은
 * (1,4),(4,1),(2,3),(3,2)입니다.
 * x+y=5(1<=x<=6, 1<=y<=6);
 * x가 1일때 y:1,2,3,4,5,6 - 4
 * x가 2일때 y:1,2,3,4,5,6 - 3
 * x가 3일때 y:1,2,3,4,5,6 - 2
 * x가 4일때 y:1,2,3,4,5,6 - 1
 * x가 5일때 y:1,2,3,4,5,6 - X
 * x가 6일때 y:1,2,3,4,5,6 - X
 */

public class Exam02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		int cnt=0;
		
		while(true) {//무한반복
			i=(int)(Math.random()*6)+1;//첫번째 주사위 1<=i<=6
			j=(int)(Math.random()*6)+1;//두번째 주사위 1<=j<=6
			if(i+j==5) break;//무한반복을 빠져나가는 조건
			cnt++;
		}
		System.out.println("(" + i + "," + j + ")");
		System.out.println("총반복횟수:" + cnt);
	}

}
