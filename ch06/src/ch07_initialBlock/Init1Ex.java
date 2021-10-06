package ch07_initialBlock;

public class Init1Ex {
	public static void main(String[] args) {
	//로컬변수 i1 선언
	Init1 i1 = new Init1();
		int[] b = i1.a; //i1객체의 배열 정보를 b가 받음(얕은 복사)
		for(int i : b ) { //for(int i : i1.a ) { -> 7열 없애고 이렇게 작성해도 됨.
		System.out.println(i);
		}
	}
}

class Init1{
	//필드
	int[] a = new int [5];
	//초기화 블럭 - 인스턴스 초기화 블럭 {초기화 내용}
	{
		for(int i=0; i<a.length; i++) {
			int k=(int)(Math.random()*10);
			a[i]=k;
		}
	}
}