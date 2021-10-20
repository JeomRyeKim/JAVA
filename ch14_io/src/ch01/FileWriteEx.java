package ch01;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx {
public static void main(String[] args) throws IOException {
	//2byte단위의 값을 파일에 저장하는 통로
	FileWriter fout = new FileWriter("c:\\temp\\test.txt");
	//문자를 파일에 저장
	fout.write('A');//문자 하나 출력 메소드
	//자원해제
	fout.close();
}
}
