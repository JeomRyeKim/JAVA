package ch01;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterEx3 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	//문자단위(2byte)로 파일 저장하는 스트림객체 선언
	FileWriter fout = null;
	int c;
	try {
		fout = new FileWriter("c:\\temp\\ex1.txt");
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
	FileReader fin = null;
	try {
		fin = new FileReader("c:\\\\temp\\\\ex1.txt");//디렉토리\파일명
//		int c;//문자 한자씩 읽어서 저장하는 변수
		while((c=fin.read()) != -1) {//read()함수 한자씩 읽어서 int타입으로 리턴메소드,데이터가 없으면 -1을 리턴
			System.out.print((char)c);//문자로 형변환 후 출력
		}
		//자원 해제
		fin.close();
	} catch (Exception e) {
		System.out.println("입출력 오류");
	}
}
}
