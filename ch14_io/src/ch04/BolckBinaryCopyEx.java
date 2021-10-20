package ch04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BolckBinaryCopyEx {
public static void main(String[] args) {
	File src = new File("c:\\temp\\src.png");
	File dest = new File("c:\\temp\\javasample\\newDest.png");
	try {
		//스트림
		FileInputStream fi = new FileInputStream(src);
		FileOutputStream fo = new FileOutputStream(dest);
		//byte배열
		byte[] buf = new byte[1024*10];//10kb 버퍼
		while(true) {
			int n = fi.read(buf);//read(버퍼)의 리턴값은 버퍼에 입력된 byte개수를 리턴
			fo.write(buf,0,n);//writer(배열,시작index,길이)
			if(n<buf.length) break;//최종석으로 버퍼에 들어간 값이 버퍼길이보다 작으면 종료
		}
		//파일 닫기
		fi.close(); fo.close();
		System.out.println(src.getPath()+"를 "+dest.getPath()+"로 복사 완료");
		
	} catch (Exception e) {
		System.out.println("파일 복사 오류");
	}
}
}
