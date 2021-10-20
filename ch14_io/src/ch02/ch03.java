package ch02;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.util.Scanner;

public class ch03 {
public static void main(String[] args) {
	FileReader fin = null;
	int c;
	try {
		fin = new FileReader("c:\\temp\\test2.txt");
		BufferedOutputStream out = new BufferedOutputStream(System.out, 5);//버퍼크기 5를 가진 스트림 - 5개 넘으면 엔터쳐야 뒤에 나옴.
		while((c=fin.read()) != -1) {
			out.write(c);
		}
		
		//
		new Scanner(System.in).nextLine();
		out.flush();//버퍼에 남아있는 문자 모두 밀어내기 - 반드시 해줘야 함!
		fin.close();
		out.close();
	} catch (Exception e) {
		
	}
}
}
