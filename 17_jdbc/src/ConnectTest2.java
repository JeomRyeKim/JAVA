import java.sql.Connection; //인터페이스
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * 오라클 접속 테스트
 * */
public class ConnectTest2 {
public static void main(String[] args) {
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "madang";
	String pwd = "madang";
	
	//드라이버 로딩
	try {
		//oracle DB연결  드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");//
		System.out.println("드라이버 로딩 성공");
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	//DBMS와 연결
	try {
		System.out.println("데이터베이스 연결 준비......");
		Connection con = DriverManager.getConnection(url, userid, pwd);
		if(con != null) {
			System.out.println("데이터베이스 연결 성공...");
		}
		//쿼리객체 생성
		Statement stmt = null;
		ResultSet rs = null;
		//db연결정보로 쿼리 객체 생성
		stmt = con.createStatement();
		//실행할 쿼리문
		String sql = "select bookid, bookname, publisher, price from book order by bookid";
		//DBMS로 쿼리문 전송 후 결과 받기
		rs = stmt.executeQuery(sql);
		//결과로 넘어온 ResultSet을 한 행씩 추출하여 처리하기
		while(rs.next()) {
			int bookid = rs.getInt("bookid"); //getIng(칼럼명)
			String bookname = rs.getString("bookname");//getString(칼럼명)
			String publisher = rs.getString("publisher");
			int price = rs.getInt("price");
			System.out.println(bookid + "|" + bookname + "|" + publisher + "|" + price);
		}
		//자원해제
		con.close();
	} catch (Exception e) {
		e.printStackTrace();
	}	
}
}
