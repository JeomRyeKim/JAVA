package verify;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex13 {
	public static void main(String[] args) {
	System.out.println("13.SimpleDateFormat클래스를 이용해서 오늘의 날짜를 출력");
	 Date now = new Date();
	 
	 SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
	 System.out.println(sdf.format(now));

	}
}