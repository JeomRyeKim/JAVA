import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionTest11 {
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
		 //스캐너로 값을 입력받아서 조회
		 Scanner scanner = new Scanner(System.in);
		 System.err.println("조회할 책 제목을 입력하세요>");
		 String title = scanner.next();
		 System.err.println("기준 가격을 입력하세요>");
		 int price = scanner.nextInt();
		 //title과 sql을 조합해서 아래와 같이 만들고 출력
		 //[질의3-10] 축구에 관한 도서 중 가격이 20,000원 이상인 도서를 검색하시오.
		 //select * from book where bookname like'%축구%' and price >=20000;
		 String sql = "select * from book where bookname like'%" + title + "%' and price >=" + price;
		 //'||' '||' 는 넣으나 빼나 차이 없음
		 System.out.println("쿼리문:"+sql);

		 //5.쿼리문 전송 및 결과 받기
		 ResultSet rs = stmt.executeQuery(sql);
		 //6.출력작업
		 System.out.println("bookid| bookname| publisher|price");
		 System.out.println("---------------------------------");
		 while(rs.next()) { 
			 int bookid = rs.getInt(1);
			 String bookname = rs.getString(2);
			 String publisher = rs.getString(3);
			 price =rs.getInt(4);
			 System.out.println(bookid + "\t|" + bookname+"\t|"+publisher + "\t|" + price);
		 }
		 //7.자원해제
		 rs.close();    stmt.close();   con.close();
	 }catch(Exception e) {
		 e.printStackTrace();
	 }

	}
}