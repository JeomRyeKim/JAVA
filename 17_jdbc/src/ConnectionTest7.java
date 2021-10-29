import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionTest7 {
public static void main(String[] args) {
	try {
		//1.드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2.연결 객체 생성
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "madang", "madang");
		//3.쿼리 객체 생성
		Statement stmt = con.createStatement();
		//4.쿼리문 작성
		//조회 조건이 문자인 경우는 문자열 표시 ''로 묶어서 where 조건 값으로 사용
		int bookid =1;
		String bookname = "축구의 역사";
		String sql = "select bookid, bookname, publisher, price from book where bookid = "
					+ bookid +" and bookname like '" + bookname + "'";
		System.out.println("쿼리문: " + sql);
		//5.쿼리문 전송 및 결과 받기
		ResultSet rs = stmt.executeQuery(sql);
		//6.출력 작업
		System.out.println("bookid | bookname | publisher | price");
		System.out.println("-------------------------------------");
		//1건인 경우 한번만 rs.next() 호출 - while문 굳이 필요 없음
		if(rs.next()) {
//			int bookid = rs.getInt(1);
//			String bookname = rs.getString(2);
			String publisher = rs.getString(3);
			int price = rs.getInt(4);
			System.out.println(bookid + "\t|" + bookname + "\t|" + publisher + "\t|" + price);
		}
		//7.자원 해제 - 생성된 역순으로 close()
		rs.close();	stmt.close();	con.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
