package ch05_preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementEx4_Delete {
 public static void main(String[] args) {
  try {
	//1.����̹��ε�
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 
		 //2.���ᰴü ����
		 String url="jdbc:oracle:thin:@localhost:1521:xe";
		 String userid="madang";
		 String pwd="madang";
		 Connection con = DriverManager.getConnection(url,userid,pwd);
		 
		 //3.sql�� ���۰�ü ���� - template���İ�ü 
		 String sql ="delete from customer where custid=?";
		 PreparedStatement pstmt = con.prepareStatement(sql);//������ sql���� �Ű������� �޾Ƽ� ����
		 //sql�� ���޽� 10�� ���ε��Ǿ ������ ���������� ���޵�
		 pstmt.setInt(1, 8);
		 
		 //4.����
		 int resulteCount = pstmt.executeUpdate();
		 if(resulteCount>0) System.out.println("��������");
		 else System.out.println("��������");
  }catch(Exception e) {
	  
  }
}
}
/**
 * Ʈ���� ��� ����/�⵿ó��
  alter trigger AfterUpdateBook disable;
  alter trigger AfterUpdateBook enable; 
 * */