package ch01;

import java.io.FileReader;

//파일로부터 문자단위(2byte)씩 전달하는 통로(FileReader)
public class FilereaderEx {
public static void main(String[] args) {
	//문자단위 입력 스트림 Reader
	FileReader fin = null;
	try {
		fin = new FileReader("c:\\windows\\system.ini");//디렉토리\파일명
		int c;//문자 한자씩 읽어서 저장하는 변수
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
