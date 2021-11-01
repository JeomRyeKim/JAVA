package ch06;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableEx3 {
public static void main(String[] args) throws Exception {
	//1.드라이버로딩
	 Class.forName("oracle.jdbc.driver.OracleDriver");
	 
	 //2.연결객체 생성
	 String url="jdbc:oracle:thin:@localhost:1521:xe";
	 String userid="madang";
	 String pwd="madang";
	 Connection con = DriverManager.getConnection(url,userid,pwd);
	 
	 //3.callable객체 생성
	 //함수 호출 {?=call 함수명(?)}
	 String sql = "{?=call fnc_interest(?)}";//in모드 매개변수 4개 등록
	 CallableStatement cstmt = con.prepareCall(sql);
	 //입력파라미트 설정
	 cstmt.registerOutParameter(1, java.sql.Types.NUMERIC);
	 cstmt.setInt(2, 35000);
	 
	 //4.실행
	 cstmt.executeUpdate();
	 System.out.println("평균:"+cstmt.getInt(1));
	 
	 //5.자원해제
	 cstmt.close(); con.close();
}
}
//create or replace NONEDITIONABLE function fnc_interest(
//price number
//) 
//return number
//is
//  myInterest number;
//begin 
//    /* 가격이 30,000원 이상이면 10%  30,000원 미만이며 5% */
//    if price >=30000 then
//       myInterest :=price * 0.1;
//    else
//      myInterest :=price * 0.05;
//    end if;
//
//    /*결과 리턴*/
//   return myInterest;
//end;
