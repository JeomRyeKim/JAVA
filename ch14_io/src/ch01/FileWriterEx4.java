package ch01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx4 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		//문자단위(2byte)로 파일 저장하는 스트림객체 선언
		final String fileName = "c:\\temp\\ex1.txt";
		FileWriter fout = new FileWriter(fileName);
		FileReader fin = new FileReader(fileName);//디렉토리\파일명
		int c;//
		try {
			System.out.println("메세지를 입력하세요>");
			while(true) {
				String line = scanner.nextLine();//한 줄 단위로 입력받기
				if(line.length()==0) break;//문장입력없이 Enter키 치면 빠져나가기
				fout.write(line,0,line.length());//write(문자열,시작index,문자열길이);
				fout.write("\r\n",0,2);//문장뒤에 캐리지 리턴추가,write(문자열,시작index,문자열길이);
			}
			//자원해제
			fout.close();//파일닫아줘야 파일에 내용이 저장.
		    while((c=fin.read()) !=-1) {//read()함수 한자씩 읽어서 int타입으로 리턴메소드, 데이타가 없으면 -1을 리턴
		    	System.out.print((char)c);//문자로 형변환 후 출력
		    }
		    //자원해제
		    fin.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//자원해제
		scanner.close();
	}
}