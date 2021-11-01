package ch06;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableEx {
	public static void main(String[] args) throws Exception {
		//1.����̹��ε�
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 
		 //2.���ᰴü ����
		 String url="jdbc:oracle:thin:@localhost:1521:xe";
		 String userid="madang";
		 String pwd="madang";
		 Connection con = DriverManager.getConnection(url,userid,pwd);
		 
		 //3.callable��ü ����
		 String sql="{call AVERAGEPRICEBYID(?)}";
		 CallableStatement cstmt = con.prepareCall(sql);
		 //registerOutputParameter()--���ν����� �Ű������� ��¿�(out ���)�� ��� 
		 cstmt.registerOutParameter(1, java.sql.Types.NUMERIC);
		 cstmt.setInt(1, 1);
		 
		 //4.����
		 cstmt.executeUpdate();
		 System.out.println("���:"+cstmt.getInt(1));
		 
        //5.�ڿ�����
		 cstmt.close(); con.close();
	}
}
/*
CREATE OR REPLACE PROCEDURE AVERAGEPRICEBYID(
 invalue in out number
) AS 
BEGIN
  select avg(saleprice) into invalue from orders where custid=invalue;
END;
 */