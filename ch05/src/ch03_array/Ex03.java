package ch03_array;

public class Ex03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = {12,20,67,567,21};
		System.out.println("배열의 개수:" + n.length);
		
		for(int i=0; i<n.length; i++) 
			System.out.println("[" + i + "]=" + n[i]);
	
	System.out.println("향상된 for문");
	//향상된 for문
	for(int k:n) {
		System.out.println(k);
	}
	}

}
