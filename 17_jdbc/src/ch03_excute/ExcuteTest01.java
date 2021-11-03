package ch03_excute;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExcuteTest01 {
public static void main(String[] args) {
	Connection con = null;
	try {
		//1.����̹� �ε�
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//2.���ᰴü  ����
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String userid = "madang";
				String pwd = "madang";
				con = DriverManager.getConnection(url,userid,pwd);
				
				//3-1.sql�� ���� ��ü ����
				Statement stmt = con.createStatement();
				
				//4.sql�� ����
				String sql = "select * from customer";
				
				//5.��� ó��
				boolean isResult = stmt.execute(sql);
				System.out.println("isResult:"+isResult);
				if(isResult) {
					ResultSet rs = stmt.getResultSet();
					while(rs.next()) {
						System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3));
					}
				}else {
					int resultCount = stmt.getUpdateCount();
					System.out.println("ó������ ��:"+resultCount);
				}		
				//6.�ڿ�����
				stmt.close(); con.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}