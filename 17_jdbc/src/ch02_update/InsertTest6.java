package ch02_update;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

//자바프로그램은 dbms저장 default 옵션이 autocommit<- commit 명령 실행하지 않아도 db에 자동 반영 
public class InsertTest6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run =true;
		//1.드라이버로딩,2.연결객체 생성
		try {
			Connection con = DaoConnector.getInstance().getConnection();
			//3.쿼리객체 생성
            Statement stmt = con.createStatement();
            //
           String sql="";
           while(run) {  
             System.out.println("등록할 고객명을 입력하세요>");
             String name = scanner.next();
             System.out.println("최초 입금액을 입력하세요>");
             int  balance = scanner.nextInt();
             
            //4.쿼리문 생성 
            //4-3.등록 처리
            sql="insert into account "
  +" values((select '111'||'-'||lpad(to_number(nvl(substr(nvl(max(accountno),0),5,3),0))+1,3,'0') from account),'"
  + name+"','"+balance+"')";//작성
            		//등록 실행
            		stmt.executeUpdate(sql);
           //
            System.out.println("계속할까요?(y/n)>");
            String isRun = scanner.next();
            try {
            if(isRun.equalsIgnoreCase("n")) run=false;
            if(!(isRun.equalsIgnoreCase("n") | isRun.equalsIgnoreCase("y")) ) {
            	throw new Exception("y나 n을 입력하세요");
            }
            }catch(Exception e) {
            	System.out.println(e.getMessage());
            }
           }		
            
            //5.결과 조회 
            sql ="select * from account order by accountNo";
            //조회 
           ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
            System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));//작성
            }
            //결과
            //-- 이름, 잔고 10000 입력
            //--등록결과 조회
            //-- 111-001, '홍길동', 10000
            //-- 111-002, '일지매', 10000
            //-- 111-003, '임꺽정', 10000
     			//6.자원해제
			stmt.close();  con.close(); scanner.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}//main메소드 끝.
}//클래스 끝.

/************************************* 
--account테이블 생성
create table account(
accountNo varchar2(50)  primary key,
owner  varchar2(100),
balance number
);
insert into account values('111-001', '홍길동',10000);
select * from account;
delete from account;
commit;
select '111'||'-'||lpad(nvl(max(accountno),0)+1,3,'0') 
  from account;
--lpad함수
select lpad(to_number(substr(nvl(max(accountno),0),5,3))+1,3,'0') from account;
  
select lpad(to_number(nvl(substr(nvl(max(accountno),0),5,3),0))+1,3,'0') from account;
select '111'||'-'||lpad(to_number(nvl(substr(nvl(max(accountno),0),5,3),0))+1,3,'0') from account;
--- 입력
-- 이름, 잔고 10000 입력
--등록결과 조회
-- 111-001, '홍길동', 10000
-- 111-002, '일지매', 10000
-- 111-003, '임꺽정', 10000
********************/