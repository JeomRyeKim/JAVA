package ch03_Map;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx {
public static void main(String[] args) throws FileNotFoundException, IOException {
	//프로퍼티스 객체 생성
	Properties properties = new Properties();
	//파일 경로 얻기
	String path = PropertiesEx.class.getResource("test.properties").getPath();
	System.out.println(path);
	//문자셋 설정
	path = URLDecoder.decode(path,"utf-8");
	//~.properties파일로부터 Properties객체로 정보 읽어들이기 load(파일입력스트림);
	properties.load(new FileReader(path));
	//properties로부터 값 얻기 Properties(키);
	String db = properties.getProperty("db");
	System.out.println(db);
	String user = properties.getProperty("user");
	System.out.println(user);	
}
}
