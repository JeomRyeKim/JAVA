package ch04_MetaData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class InsertTest8 {
public static void main(String[] args) throws Exception {
	Connection con = null;
	//1.����̹� �ε�
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	//2.���ᰴü  ����
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "madang";
	String pwd = "madang";
	con = DriverManager.getConnection(url,userid,pwd);
	
	//3.sql�� ���� ��ü ����
	Statement stmt = con.createStatement();
	//4.���� ���� �� ��� ó��
	String sql = "select * from customer order by custid";
	System.out.println("sql:"+sql);
	ResultSet rs = stmt.executeQuery(sql);
	//��� set�� ��Ÿ ���� ���(��Ÿ:���̺��(id,age����), �� �� ���� ������)
	ResultSetMetaData rsmd = rs.getMetaData();
	System.out.println("������� Į����:"+rsmd.getColumnCount());//
	System.out.println("������� ù��° �ε����� �ش��ϴ� Į����:"+rsmd.getColumnClassName(1));//
	System.out.println("������� ù��° �ε����� �ش��ϴ� Į���� ������ Ÿ��:"+rsmd.getColumnTypeName(1));//
	
	while(rs.next()) {
		System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4));
	}
	//5.�ڿ����� - ������ ��ü�� �������� ����
	rs.close(); stmt.close(); con.close();
}
}
