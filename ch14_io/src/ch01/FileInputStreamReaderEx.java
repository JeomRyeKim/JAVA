package ch01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamReaderEx {
public static void main(String[] args) throws IOException {
	//파일로부터 1byte단위의 값을 읽어들이는 통로(스트림)
//	FileInputStream fin = new FileInputStream("c:\\temp\\hangul.txt"); - 왜 오류나는지 알 수 없다
	FileInputStream fin = new FileInputStream("c:\\\\windows\\\\system.ini");
	
	//1byte 스트림을 2byte 문자스트림으로 변환객체
	InputStreamReader in = new InputStreamReader(fin,"MS949");
	int c;
	//2byte 문자스트림으로부터 값을 읽어서 출력
	while((c=in.read()) != -1) {
		System.out.print((char)c);
	}	
}
}
