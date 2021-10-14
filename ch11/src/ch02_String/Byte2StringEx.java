package ch02_String;

import java.io.UnsupportedEncodingException;

public class Byte2StringEx {
	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] bytes = {72,101,108,111,32,74,97,118,97};
		
		//byte배열로 String객체 생성
		String str1 = new String(bytes);
		
		System.out.println(str1);
		
		//byte배열,시작index,개수
		String str2 = new String(bytes,6,3);
		System.out.println(str2);
		
		//String으로부터 byte배열 생성
		byte[] bytes2 = "홍길동".getBytes();//[][] [][] [][] - EUC-KR
		
		System.out.println(bytes2.length);//홍:2,길:2,동:2 -> 6개 byte
		
//		for(int i=0; i<bytes2.length; i++) {
//			System.out.println((int)bytes2[i]);
//		}
//		String str3 = new String(bytes2,"UTF-8");//[][][] [][][] - 3byte씩 -> 오류
		String str3 = new String(bytes2,"EUC-KR");//[][] [][] [][] - 2byte씩
		System.out.println(str3);
	}
}
