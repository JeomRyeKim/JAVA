package ch09_scrollable;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class ScrollableEx {
public static void main(String[] args) throws Exception {
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
	 
	 //createStatement(TYPE_SCROLL_INSENSITIVE,CONCUR_UPDATABLE);
	Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
			                             ResultSet.CONCUR_UPDATABLE);
	//
	String sql ="select * from customer order by custid";
	ResultSet rs = stmt.executeQuery(sql);
	
	while(rs.next()) {
		System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4));
	}
	System.out.println("------------------------------");
    rs.first();	
    System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4));
    rs.last();	
    System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4));
    rs.previous();
    System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4));
    rs.absolute(4);
    System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4));
    
}
}