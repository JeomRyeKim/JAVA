import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionTest3 {
public static void main(String[] args) {
	try {
		//1.연결드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2.로딩된 드라이버로부터 연결객체 생성
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "madang", "madang");
		//jdbc : 주 프로토콜 , oracle : 서브 프로토콜, thin : 프로토콜
		//localhost(도메인 주소) : 127.0.0.1(IP주소) -> 서버주소
		//1521 : 포트번호
		// Expression Edition 서비스명(SID):XE
		// 서버용 : 서비스명(SID) : ORCL
		if(con != null) {
			System.out.println("연결성공");
		}else {
			System.out.println("연결실패");
		}
		//3. 쿼리문 전달 객체 생성
		Statement stmt = con. createStatement();
		//4. 쿼리문 작성
		StringBuffer sb = new StringBuffer();
		sb.append("select bookid, bookname, publisher, price from book order by bookid");
		
		//5.조회 객체 전달 및 결과 받기
		ResultSet rs = stmt.executeQuery(sb+" ");
//		while(rs.next()) {
//			int bookid = rs.getInt(1);//getInt(칼럼순서)
//			String bookname = rs.getString(2);//getString(칼럼순서)
//			String publisher = rs.getString(3);
//			int price = rs.getInt(4);
//			System.out.println(bookid + "\t|" + bookname + "\t|" + publisher + "\t|" + price);
//		}
		//6.자원 해제
		rs.close();
		stmt.close();
		con.close();	
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
