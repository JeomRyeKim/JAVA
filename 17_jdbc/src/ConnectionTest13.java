import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionTest13 {
	public static void main(String[] args) {
		final String driver ="oracle.jdbc.driver.OracleDriver";
		final String url ="jdbc:oracle:thin:@localhost:1521:xe";
		final String userid="madang";
		final String pwd ="madang";
	 try {
		 //1.����̹� �ε�
		 Class.forName(driver);
		 //2.���ᰴü ����
		 Connection con = DriverManager.getConnection(url,userid,pwd);
		 //3.������ü ����
		 Statement stmt = con.createStatement();
		 //4.������ �ۼ�
		 //��ȸ ������ ���ڿ��� ���� ���ڿ� ǥ�� ''�� ��� where ���� ������ ��� 
		 //��ĳ�ʷ� ���� �Է¹޾Ƽ� ��ȸ
		 Scanner scanner = new Scanner(System.in);
		 System.err.println("��ȸ�� ����ȣ�� �Է��ϼ���>");
		 int custid = scanner.nextInt();
		 //title�� sql�� �����ؼ� �Ʒ��� ���� ����� ���
		 //[����3-17] �ֹ����̺��� Ư�� ���� �ֹ��� ������ �� �Ǹž�, ��հ�, ������, �ְ��� ���Ͻÿ�.
//		 select sum(saleprice) as total,
//	        	avg(saleprice) as average,
//	        	min(saleprice) as minimum,
//	        	max(saleprice) as maximum
//		 from orders
//		 where custid=2;
		 String sql = "select sum(saleprice) as total, " 
				 			+" avg(saleprice) as average, "
				 			+" min(saleprice) as minimum, "
				 			+" max(saleprice) as maximum "
				 	  +" from orders "
				 	  +" where custid= " + custid;
		 System.out.println("������:"+sql);

		 //5.������ ���� �� ��� �ޱ�
		 ResultSet rs = stmt.executeQuery(sql);
		 //6.����۾�
		 System.out.println("total | average| minimum | maximum");
		 System.out.println("----------------------------------");
		 while(rs.next()) { 
			 int total = rs.getInt(1);
			 int average = rs.getInt(2);
			 int minimum = rs.getInt(3);
			 int maximum = rs.getInt(4);
			 System.out.println(total + "\t|" + average + "\t|" + minimum + "\t|" + maximum);
		 }
		 //7.�ڿ�����
		 rs.close();    stmt.close();   con.close();
	 }catch(Exception e) {
		 e.printStackTrace();
	 }

	}
}