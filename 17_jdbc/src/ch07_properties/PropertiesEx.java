package ch07_properties;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class PropertiesEx {
public static void main(String[] args) {
	try {
		//입력(transaction)처리
		//1.드라이버로딩, 2.연결객체 생성하여 연결맺기
		 FileInputStream fis = new FileInputStream("c:\\driver\\jdbc.properties");
		 Properties pro = new Properties();
		 //properties값 읽어 들이기
		 pro.load(fis);
		 //properties로 부터 해당키에 값을 추출 getProperty(키)
		 String driver = pro.getProperty("driver");
		 String url = pro.getProperty("url");
		 String user = pro.getProperty("user");
		 String pwd = pro.getProperty("password");
		 
		 Class.forName(driver);
		 Connection con = DriverManager.getConnection(url, user, pwd);
		 
		//3.sql문 전송객체 생성
			Statement stmt = con.createStatement();
		//4.쿼리 전송 후 결과 처리
			String sql="select * from customer order by custid"; 
			System.out.println("sql:"+sql);
			 ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
			  System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4));
			}	  
	    //5.자원해제-생성된 객체 의 역순으로 해제
				  rs.close(); stmt.close(); con.close();
	}catch(Exception e) {
		
	}
}
}