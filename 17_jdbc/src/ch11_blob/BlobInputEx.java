package ch11_blob;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BlobInputEx {
public static void main(String[] args) {
	try {
		//1.드라이버로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2.연결객체 생성
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String userid="madang";
		String pwd="madang";
		Connection con = DriverManager.getConnection(url,userid,pwd);
		
		//3.File입력 스트림 생성
		File file = new File("c:/temp/MyImage.png");
		int len = (int)file.length();//파일사이즈
		InputStream is = new FileInputStream(file);//InputStream
		
		//4.sql문
		String sql = "insert into photo values (?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, "MyImage1");
		pstmt.setBinaryStream(2, is, len); //setBinaryStream(index,input스트림,파일길이);
		
		//5.입력 실행
		int result = pstmt.executeUpdate();
		if(result>0) System.out.println("입력성공");
		
		//6.자원해제
		pstmt.close(); con.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	 
}
}
