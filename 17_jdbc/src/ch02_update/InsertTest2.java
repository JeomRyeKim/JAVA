package ch02_update;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTest2 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	//1.드라이버 로딩 2.연결객체 생성
	try {
		Connection con = DaoConnector.getInstance().getConnection();		
		//3.쿼리 객체 생성
		Statement stmt = con.createStatement();
		//
		System.out.println("등록할 도서명을 입력하세요>");
		String title = scanner.nextLine();
		System.out.println("등록할 출판사명을 입력하세요>");
		String publisher = scanner.nextLine();
		System.out.println("등록할 가격을 입력하세요>");
		int price = scanner.nextInt();
		
		//4.쿼리문 생성
		String sql = "insert into book(bookid, bookname, publisher, price)"
					+" values((select max(bookid)+1 from book),'"+title+"','"+publisher+"',"+price+")";
		System.out.println("sql:" + sql);
		//5.쿼리전송 및 결과 받기
		//executeUpdate(쿼리문) 리턴타입은 int 삽입된 행의 수 리턴, 0이면 입력 안 된 결과
		int result = stmt.executeUpdate(sql);
		if(result>0) {
			System.out.println("입력성공");
		}else {
			System.out.println("입력실패");
		}
		//6.자원해제
		stmt.close(); con.close(); scanner.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}
}
