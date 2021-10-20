package ch04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//이진데이터로 구성된 파일들(이미지,영상,사운드)
public class BinaryCopyEx {
public static void main(String[] args) {
	//원본 파일 정보
	File src = new File("c:\\temp\\src.png");
	//복사 파일 정보
	File dest = new File("c:\\temp\\javasample\\dest.png");
	int c;//임시저장 변수
	try {
		//바이너리 스트림 생성
		FileInputStream fi = new FileInputStream(src);//입력조
		FileOutputStream fo = new FileOutputStream(dest);//출력조
		//복사
		while((c=fi.read()) != -1) {
			fo.write((byte)c);
		}
		//파일 닫기
		fi.close(); fo.close();
		System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사 완료");
	} catch (Exception e) {
		System.out.println("오류 발생");
	}	
}
}
