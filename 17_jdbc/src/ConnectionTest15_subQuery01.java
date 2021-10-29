import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionTest15_subQuery01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
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
		 // group by having 조건
		 //(1) 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름?
//		 select name
//		 from customer, orders, book
//		 where customer.custid = orders.custid
//		 and orders.bookid = book.bookid
//		 and publisher in(
//		                  select publisher 
//		                  from customer, orders, book
//		                  where customer.custid = orders.custid
//		                  and orders.bookid = book.bookid
//		                  and name like '박지성'
//		                  )
//		 and name not like '박지성';
		 
		 System.out.println("구매한 고객명을 입력하세요>");
		 String custName = scanner.next();
		  
		String sql ="select name "
				+ "from customer, orders, book "
				+ "where customer.custid = orders.custid "
				+ "and orders.bookid = book.bookid "
				+ "and publisher in(select publisher "
				+ "		            from customer, orders, book "
				+ "		            where customer.custid = orders.custid "
				+ "		            and orders.bookid = book.bookid "
				+ "		            and name like '"+ custName +"' "
				+ "		                  )"
				+ "and name not like '" + custName +"'" ; //정렬
		
		 System.out.println("쿼리문:"+sql);

		 //5.쿼리문 전송 및 결과 받기
		 ResultSet rs = stmt.executeQuery(sql);
		 //6.출력작업
		//한건 인 경우 한번만 rs.next() 호출
		 while(rs.next()) {
			 System.out.println("고객명:"+rs.getString(1));
		 }
		 //7.자원해제
		 rs.close();    stmt.close();   con.close();
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
	}
}