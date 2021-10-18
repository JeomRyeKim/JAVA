package verify;

import java.util.StringTokenizer;

public class Ex8 {
public static void main(String[] args) {
	System.out.println("8.다음 문자열에서 쉼표(,)로 구분되어 있는 문자열을 "
			 + "String의 split() 메소드 또는 StringTokenizer를 이용해서 분리해보세요.");
	String str = "아이디,이름,패스워드";
	//방법1 split()이용
	 String[] tokens = str.split(",");
	 for(String s:tokens)
		 System.out.print(s+" ");
	 
	 System.out.println();
	
	//방법2 StringTokenizer 이용
	 StringTokenizer stk = new StringTokenizer(str,",");
	 while(stk.hasMoreElements()) {
		 System.out.print(stk.nextElement()+" ");
	 }
	 
}
}