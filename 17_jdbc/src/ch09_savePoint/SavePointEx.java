package ch09_savePoint;

import java.sql.Connection;
import java.sql.Savepoint;
import java.sql.Statement;

import ch02_update.DaoConnector;


public class SavePointEx {
	public static void main(String[] args) {
		try {
			//입력(transaction)처리
			//1.드라이버로딩, 2.연결객체 생성하여 연결맺기
			  Connection con = DaoConnector.getInstance().getConnection();
			//3.sql문 전송객체 생성
			  Statement stmt = con.createStatement();
			  con.setAutoCommit(false);//수동처리
			  con.commit();
			//4.쿼리 전송 후 결과 처리
			  String sql="insert into customer values((select max(custid)+1 from customer),'홍길이',null,null)"; 
			  stmt.executeUpdate(sql);
			 
			  Savepoint s1=con.setSavepoint();
			  
			  sql="insert into customer values((select max(custid)+1 from customer),'또길동',null,null)"; 
			  stmt.executeUpdate(sql);
			
			  Savepoint s2=con.setSavepoint();
			  
			   
			  con.rollback(s1);
			  
			  
			 con.commit();
			  
			//5.자원해제-생성된 객체 의 역순으로 해제
			  stmt.close(); con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
/**
 select * from customer;
insert into customer values(10,'김길동','서울시','010-111-111');
savepoint s1;-----
select * from customer;
insert into customer values(11,'장길동','서울시','010-111-999');
savepoint s2;
select * from customer;
rollback to s2;
rollback to s1;
delete from customer where custid in (10,11);
commit; 
 * */
