package ch02_update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateTest01 {
public static void main(String[] args) throws Exception {
	//1.드라이버 로딩
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//2.연결객체  생성
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "madang";
	String pwd = "madang";
	Connection con = DriverManager.getConnection(url,userid,pwd);
	//3.sql문 전송 객체 생성
	Statement stmt = con.createStatement();
	//4.sql문 작성 및 전송 후 결과 받기
	//4-1.쿼리문 생성
	String address = "서울시";
	String phone = "010-111-1234";
	int custid = 10;
	String sql = "update customer set address = '"+address+"' , phone = '"+phone+"' where custid = "+custid;
	System.out.println("sql:"+sql);
	//4-2.쿼리문 전송 후 결과 받기
	int resultCount = stmt.executeUpdate(sql);
	//5.결과 처리
	if(resultCount>0) {
		System.out.println("수정완료");
	}else {
		System.out.println("수정실패");
	}
	//6.자원해제
	stmt.close(); con.close();
}
}