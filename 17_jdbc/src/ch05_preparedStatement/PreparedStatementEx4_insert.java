package ch05_preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementEx4_insert {
 public static void main(String[] args) {
  try {
	//1.드라이버로딩
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 
		 //2.연결객체 생성
		 String url="jdbc:oracle:thin:@localhost:1521:xe";
		 String userid="madang";
		 String pwd="madang";
		 Connection con = DriverManager.getConnection(url,userid,pwd);
		 
		 //3.sql문 전송객체 생성 - template형식객체 
		 String sql ="insert into book values(?,?,?,?)";
		 PreparedStatement pstmt = con.prepareStatement(sql);//생성시 sql문을 매개변수로 받아서 생성
		 //sql문 전달시 10이 바인딩되어서 완전한 쿼리문으로 전달됨
		 pstmt.setInt(1, 30);
		 pstmt.setString(2, "축구가 좋냐?");
		 pstmt.setString(3, "한국출판사");
		 pstmt.setInt(4, 25000);
		 
		 //4.실행
		 int resulteCount = pstmt.executeUpdate();
		 if(resulteCount>0) System.out.println("입력성공");
		 else System.out.println("입력실패");
  }catch(Exception e) {
	  
  }
}
}