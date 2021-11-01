package ch06;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableEx2 {
	public static void main(String[] args) throws Exception {
		//1.드라이버로딩
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 
		 //2.연결객체 생성
		 String url="jdbc:oracle:thin:@localhost:1521:xe";
		 String userid="madang";
		 String pwd="madang";
		 Connection con = DriverManager.getConnection(url,userid,pwd);
		 
		 //3.callable객체 생성
		 String sql="{call bookInsertORUpdate(?,?,?,?)}";//In 모드 매개변수 4개 등록
		 CallableStatement cstmt = con.prepareCall(sql);
		 //입력파라미터 설정
		 cstmt.setInt(1, 31);
		 cstmt.setString(2, "야구가 좋냐?");
		 cstmt.setString(3,"야구좋아출판사");
		 cstmt.setInt(4, 30000);
		 
		 //4.실행
		 cstmt.executeUpdate();
		 
        //5.자원해제
		 cstmt.close(); con.close();
	}
}

/*
create or replace NONEDITIONABLE procedure bookInsertORUpdate(
 mybookId number,
 mybookName varchar2,
 mypublisher varchar2,
 myPrice number
) 
as 
 mycount number;--begin내에서 사용한 변수`
begin 
       --1. 입력받은 bookname으로 조회한 결과 값을 mycount에 저장 
       select count(*)  into mycount -- seelct 칼럼값 into 변수 
         from book 
       where bookname like mybookName;
       -- if 조건 then 실행문; else 실행문 end if;
       if  mycount!=0 then -- mybookName을 조회한 결과값이 있으면 
            update book
                  set price = myPrice   -- 가격을 입력받은 값으로 수정
            where  bookname like mybookName;
       else -- mycount==0  -- 입력
            insert into book(bookid, bookname, publisher, price)
              values(mybookId,mybookName,mypublisher,myPrice);
       end if;
end;
*/