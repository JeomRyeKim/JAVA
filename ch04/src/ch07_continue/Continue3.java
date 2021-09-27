package ch07_continue;

public class Continue3 {
	public static void main(String[] args) {
		//이증 for문 내의 continue;
		for(int i=0; i<=9; i++) {
			System.out.print("i=" + i + "\t");
			for(int j=0; j<=9; j++) {
				System.out.print("j=" + j);
				if(j>2) continue;//continue를 감싸는 가장 가까운 블럭의 for 시작으로 이동.
				System.out.print("나두 출력되나\t");
			}
			System.out.println();//한 줄 아래로 내리기
		}

	}

}
