import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionTest14 {
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
		 //--[질의 3-20] 가격이 8,000원 이상인 도서를 구매한 고객에 대하여 고객별 주문 
		 //--도서의 총 수량을 구하시오. (단, 두 권 이상 구매한 고객만 구하시오.)
		 // select custid, count(*) as 도서수량
		 //from orders
		 //where saleprice >=8000 -- 개별 추출 조건
		 //group by custid -- group대상
		 //having count(*)>=2 -- 집계결과를 필터링 조건
		 //order by custid  -- 정렬 
		 //;
		 
		 System.out.println("구매 조건 가격>");
		 int minPrice = scanner.nextInt();
		 System.out.println("조회할 구매기준 건수 >");
		 int count = scanner.nextInt();
		  
		String sql ="select custid, count(*)"
				+ " from orders "
				+ " where saleprice >= "+minPrice // -- 개별 추출 조건
				+ " group by custid " //group대상
				+ " having count(*)>= "+count //집계결과를 필터링 조건 
				+ " order by custid " ; //정렬
		
		 System.out.println("쿼리문:"+sql);

		 //5.쿼리문 전송 및 결과 받기
		 ResultSet rs = stmt.executeQuery(sql);
		 //6.출력작업
		 //한건 인 경우 한번만 rs.next() 호출
		 while(rs.next()) {
			 int custid = rs.getInt(1);
			 int total= rs.getInt(2);
			 System.out.println(custid+"\t|"+total);
		 }
		 //7.자원해제
		 rs.close();    stmt.close();   con.close();
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
	}
}