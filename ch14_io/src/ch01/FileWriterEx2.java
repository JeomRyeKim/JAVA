package ch01;

import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterEx2 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	//문자단위(2byte)로 파일 저장하는 스트림객체 선언
	FileWriter fout = null;
	int c;
	try {
		fout = new FileWriter("c:\\temp\\test2.txt");
		System.out.println("메시지를 입력하세요>");
		while(true) {
			String line = scanner.nextLine();//한 줄 단위로 입력받기
			if(line.length()==0) break;//문장입력없이 Enter키 치면 빠져나가기
			fout.write(line,0,line.length());//write(문자열,시작index,문자열길이);
			fout.write("\r\n",0,2);//문장뒤에 캐리지 리턴추가(엔터) - 없으면 한 줄로 출력됨.
			//캐리지 리턴 - \r\n, \r, \n 으로 다 사용 가능.
		}
		//자원해제
		fout.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	//자원해제
	scanner.close();
}
}
