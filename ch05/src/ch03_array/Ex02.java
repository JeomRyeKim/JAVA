package ch03_array;

public class Ex02 extends ArrayEx10 {
public static void main(String[] args) {
	int[] n = new int[5];
	n[0]=12; n[1]=20;
	n[2]=67; n[3]=567;
	n[4]=21; 
	
	System.out.println("배열의 요소의 개수:" + n.length);
	for(int i=0; i<n.length; i++) {
		System.out.println("n[ " + i + "] = " + n[i]);
	}
	
	System.out.println("=================");
	System.out.println("향상된 for문 자바1.5에서 도입.");
	
	//배열객체를 처음부터 끝까지 한번씩 반복하면서
	//읽는 '반복자(iterator)'를 선언하여 사용 - 향상된 for문
	for(int k:n) {
		System.out.println(k + "\t");// k[n]과 똑같음
	}
	
	}

}
