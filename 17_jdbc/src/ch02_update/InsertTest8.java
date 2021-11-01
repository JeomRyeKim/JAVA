package ch02_update;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertTest8 {
public static void main(String[] args) throws Exception {
	//입력(transaction)처리
	//1.드라이버로딩, 2. 연결 객체 생성하여 연결 맺기
	Connection con = DaoConnector.getInstance().getConnection();
	//3.sql문 전송 객체 생성
	Statement stmt = con.createStatement();
	//4.쿼리 전송 후 결과 처리
	String sql = "select * from customer where custid=(select max(custid) from customer)";
	System.out.println("sql:"+sql);
	ResultSet rs = stmt.executeQuery(sql);
	while(rs.next()) {
		System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4));
	}
	//5.자원해제 - 생성된 객체의 역순으로 해제
	rs.close(); stmt.close(); con.close();
}
}
