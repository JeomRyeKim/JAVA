package ch02_update;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

//자바프로그램은 dbms저장 default 옵션이 autocommit <- 따로 commit 명령 실행하지 않아도 db에 자동 반영됨.
public class InsertTest5 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	//1.드라이버 로딩 2.연결객체 생성
	try {
		Connection con = DaoConnector.getInstance().getConnection();		
		//3.쿼리 객체 생성
		Statement stmt = con.createStatement();
		//박지성, "서울시", "010-333-4567"
		System.out.println("등록할 고객명을 입력하세요>");
		String name = scanner.nextLine();
		System.out.println("등록할 주소를 입력하세요>");
		String address = scanner.nextLine();
		System.out.println("등록할 전화번호를 입력하세요>");
		String phone = scanner.nextLine();
		
		//4.쿼리문 생성
		//4-1.해당 이름으로 회원명 있는지 확인
		String sql =  "select count(*) from customer where name = '"+ name +"'";
		System.out.println("sql:" + sql);
		//4-2.쿼리전송 및 결과 받기
		ResultSet rs = stmt.executeQuery(sql);
		if(rs.next()) {//쿼리결과가 넘어왔으면 처리
			if(rs.getInt(1)>0) {//넘어온 결과값 비교
				System.out.println("이미 등록된 회원명입니다.");
			}else {
				//4-3.등록 처리
				sql = "insert into customer values((select max(custid)+1 from customer),'"
						+ name +"','"+ address + "','" + phone + "')";
				//등록 실행
				stmt.executeUpdate(sql);
			}
		}
		
		//5.결과 조회
		sql = "select * from customer order by custid";
		//조회
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt(1) + "|" + rs.getString(2) + "|" + rs.getString(3) + "|" + rs.getString(4));
		}
		//6.자원해제
		stmt.close(); con.close(); scanner.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}
}
