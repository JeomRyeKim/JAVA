package ch08_batch;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class BatchEx {
public static void main(String[] args) {
	Connection con=null;
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
				 con = DriverManager.getConnection(url, user, pwd);
				 con.setAutoCommit(false);
				 
				//3.sql문 전송객체 생성
				 String sql ="insert into table_test values (?,?,?) ";
				 
				 PreparedStatement pstmt = con.prepareStatement(sql);
				 
				 for(int i=1;i<1000;i++) {
					 int bookid = 134+i;//
					 String bookName = "book"+i;
					 int price =5000+(((int)Math.random()*1000)+1);
					 
					 pstmt.setInt(1, bookid);
					 pstmt.setString(2, bookName);
					 pstmt.setInt(3, price);
					 
					 //batch job
					 pstmt.addBatch();
					 
					 //
					 pstmt.clearParameters();
					 
					if(i%100==0) {
						//100개 업무마다 batch잡 실행
						pstmt.executeBatch();
						//batch잡 초기화
						pstmt.clearBatch();
						//db반영처리
						con.commit();
					}
					
					//잔여 처리
					pstmt.executeBatch();
					con.commit();
				 }
	}catch(Exception e) {
		try {
		con.rollback();
		}catch(Exception e1) {}
		e.printStackTrace();
	}
}
}
/**
 * 
-- 테이블 삭제
drop table table_test;
-- 테이블 생성
create table table_test(
bookid number primary key,
bookname varchar2(50),
price number
);
--입력 쿼리문
insert into table_test values ((select nvl(max(bookid), 0)+1 from table_test),'book'||(select 'book'||(nvl(max(bookid), 0)+1) from table_test), 5000); 
--입력 데이타 조회
select * from table_test; 
    
 * */