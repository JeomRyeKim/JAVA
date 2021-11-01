package ch11_blob;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BlobOutEx {
public static void main(String[] args) {
	try {
		//1.드라이버로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2.연결객체 생성
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String userid="madang";
		String pwd="madang";
		Connection con = DriverManager.getConnection(url,userid,pwd);
		
		
		File file = new File("c:/temp/OutPutImage.png");
		FileOutputStream fos = null;
		
		//
		String sql = "select image from photo where id=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, "MyImage1");
		
		//입력 실행
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			Blob blob = rs.getBlob(1);
			InputStream is = blob.getBinaryStream();//바이너리데이터 입력 스트림 생성 -> 복사같은 개념
			byte[] bt = new byte[8*1024];//buffer
			int len=0;
			fos = new FileOutputStream(file);//저장할 경로 파일명으로 아웃 스트림 생성
			
			while((len=is.read(bt)) != -1) {
				fos.write(bt,0,len);
			}
			is.close(); fos.close();
			System.out.println("조회 성공");
		}else {
			System.out.println("데이터 없음");
		}
		
		//6.자원해제
		rs.close(); pstmt.close(); con.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
