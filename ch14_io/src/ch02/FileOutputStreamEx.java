package ch02;

import java.io.FileOutputStream;

public class FileOutputStreamEx {
public static void main(String[] args) {
	byte b[] = {7,51,3,4,-1,24};
	//1byte씩 이동하는 스트림 생성
	try {
		//1byte 스트림
		FileOutputStream fout = new FileOutputStream("c:\\temp\\test.out");
		for(int i=0; i<b.length; i++)
			fout.write(b[i]);
		fout.close();
	} catch (Exception e) {
		System.out.println("경로 및 파일 확인!!!");
	}
	System.out.println("c:\\temp\\test.out을 저장하였습니다.");
}
}