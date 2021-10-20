package ch04;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

//문자파일 복사 Reader/Writer
public class TextCopyEx {
public static void main(String[] args) {
	//파일정보
	File src = new File("c:\\windows\\system.ini");//원본 파일
	File dest = new File("c:\\temp\\system.txt");//복사파일 경로명
	
	int c;//read()메소드의 리턴 타입 int
	try {
		//스트림 생성 - 문자단위
		FileReader fr = new FileReader(src);
		FileWriter fw = new FileWriter(dest);
		while((c=fr.read()) != -1) {//문자 하나 읽고,
			fw.write((char)c);      //문자 하나 쓰고
		}
		fr.close(); fw.close();
		System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사 완료");
	} catch (Exception e) {
		System.out.println("복사 오류 발생");
		e.printStackTrace();
	}
}
}
