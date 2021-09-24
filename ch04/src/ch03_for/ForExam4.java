package ch03_for;

public class ForExam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	for(int i=0; i<10; i++) {
		System.out.print(i + "\t");//print() 한줄로 이어서 출력
	}
	System.out.println();//한 줄 아래로 띄우기, 출력 후 다음줄로 이동->다음줄로 이동역할
	
	for(int i=0; i<10; i+=2) {// i = i+2;
		System.out.print(i + "\t");//println이면 \t이 안 먹힘!
	}
	
	System.out.println();//한 줄 아래로 띄우기
	for(int i=0; i<10; i+=3) {//i = i+3;
		System.out.print(i + "\t");
	}
	
	System.out.println();//한 줄 아래로 띄우기
	for(int i=1; i<100; i*=2) {// i = i*2;
		System.out.print(i + "\t");
	}
	
	System.out.println();//한 줄 아래로 띄우기
	for(int i=10; i>0; i--) {// i = i-1;, --i
		System.out.print(i + "\t");
	}
	
	System.out.println();//한 줄 아래로 띄우기
	for(int i=10; i>0; i--) {//초기화 후 i>10 비교연산결과 false이므로 블럭{}실행 안함.
		System.out.print(i + "\t");
	}
	
	System.out.println();
	System.out.println("종료");
	
	
	}

}
