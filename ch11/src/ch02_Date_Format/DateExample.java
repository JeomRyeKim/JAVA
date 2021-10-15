package ch02_Date_Format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
public static void main(String[] args) {
	Date now = new Date();
	String strNow1 = now.toString();
	System.out.println(strNow1);
	
	//date객체의 내용을 원하는 포맷으로 출력
	SimpleDateFormat sdf = new SimpleDateFormat("MM월 dd일(E)요일 hh시 mm분 ss초");
	String strNow2 = sdf.format(now);
	System.out.println(strNow2);
}
}
