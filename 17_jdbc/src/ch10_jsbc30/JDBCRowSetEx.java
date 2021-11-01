package ch10_jsbc30;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

//jdbc 3.0의 resulutSet기능 - 잘 안 씀.
public class JDBCRowSetEx {
public static void main(String[] args) {
	try {
		RowSetFactory rowSetFactory = RowSetProvider.newFactory();
		CachedRowSet jdbcRs = rowSetFactory.createCachedRowSet();
		jdbcRs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		jdbcRs.setUsername("madang");
		jdbcRs.setPassword("madang");
		jdbcRs.setCommand("select * from customer order by custid");
		jdbcRs.execute();
				
		while(jdbcRs.next()) {
		System.err.println(jdbcRs.getInt(1)+","+jdbcRs.getString(2)+","+jdbcRs.getString(3)+","+jdbcRs.getString(4));
		}		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
