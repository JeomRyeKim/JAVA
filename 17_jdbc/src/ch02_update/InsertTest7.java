package ch02_update;

import java.sql.Connection;
import java.sql.Statement;

public class InsertTest7 {
public static void main(String[] args) throws Exception {
	//입력(transaction)처리
	//1.드라이버로딩, 2. 연결 객체 생성하여 연결 맺기
	Connection con = DaoConnector.getInstance().getConnection();
	//3.sql문 전송 객체 생성
	Statement stmt = con.createStatement();
	//4.쿼리 전송 후 결과 처리
	String sql = "insert into customer values((select max(custid)+1 from customer),'홍길이',null,null)";
	int resultCnt = stmt.executeUpdate(sql);
	if(resultCnt>0) {
		System.out.println("저장성공");
	}else {
		System.out.println("저장실패");
	}
	//5.자원해제 - 생성된 객체의 역순으로 해제
	stmt.close(); con.close();
}
}
