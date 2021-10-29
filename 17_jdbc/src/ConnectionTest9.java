import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionTest9 {
	public static void main(String[] args) {
		final String driver ="oracle.jdbc.driver.OracleDriver";
		final String url ="jdbc:oracle:thin:@localhost:1521:xe";
		final String userid="madang";
		final String pwd ="madang";
	 try {
		 //1.드라이버 로딩
		 Class.forName(driver);
		 //2.연결객체 생성
		 Connection con = DriverManager.getConnection(url,userid,pwd);
		 //3.쿼리객체 생성
		 Statement stmt = con.createStatement();
		 //4.쿼리문 작성
		 //조회 조건이 문자열인 경우는 문자열 표시 ''로 묶어서 where 조건 값으로 사용
		 String publisher1="굿스포츠";
		 String publisher2="대한출판사";
		 //select * from book where publisher = '굿스포츠' or publisher = '대한출판사';
//		 String sql ="select * from book where publisher = '"+ publisher1 + "' or publisher = '" + publisher2+"'";
		 //select * from book where publisher in ('굿스포츠','대한미디어');
//		 String sql ="select * from book where publisher in ('" + publisher1 + "','" + publisher2+"')";
		 
		 //스캐너로 값을 입력받아서 조회
		 Scanner scanner = new Scanner(System.in);
		 System.err.println("조회할 책 제목을 입력하세요>");
		 String title = scanner.next();
		 //title과 sql을 조합해서 아래와 같이 만들고 출력
		 //select bookname, publisher from book where bookname like '%축구%'; or '%'||'축구'||'%';
		 String sql = "select bookname, publisher from book where bookname like '%'||'" + title + "'||'%'";
		 //'||' '||' 는 넣으나 빼나 차이 없음
		 System.out.println("쿼리문:"+sql);

		 //5.쿼리문 전송 및 결과 받기
		 ResultSet rs = stmt.executeQuery(sql);
		 //6.출력작업
		 System.out.println("bookid| bookname| publisher|price");
		 System.out.println("---------------------------------");
		 while(rs.next()) { 
//			 int bookid = rs.getInt(1);
			 String bookname = rs.getString(1);
			 String publisher = rs.getString(2);
//			 int price =rs.getInt(4);
			 System.out.println(bookname+"\t|"+publisher);
		 }
		 //7.자원해제
		 rs.close();    stmt.close();   con.close();
	 }catch(Exception e) {
		 e.printStackTrace();
	 }

	}
}