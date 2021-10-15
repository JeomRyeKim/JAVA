package ch03_time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/* java 1.8에 추가된 time패키지 */
public class DateTimeCreateExample2 {
public static void main(String[] args) {
	//날짜 얻기
	LocalDate currDate = LocalDate.now();
	System.out.println("현재 날짜:"+currDate);
	
	LocalDate targetDate = LocalDate.of(2024, 5, 10);
	System.out.println("목표 날짜:"+targetDate);
	
	//시간
	LocalTime currTime = LocalTime.now();
	System.out.println("현재 시간:"+currTime);
	
	LocalTime targeTime = LocalTime.of(6,30,0,0);
	System.out.println("목표 시간:"+targeTime);
	
	//날짜 시간
	LocalDateTime currDateTime = LocalDateTime.now();
	System.out.println("현재 날짜와 시간:"+currDateTime);
	
	LocalDateTime targeDateTime = LocalDateTime.of(2024,5,10,6,30,0,0);
	System.out.println("목표 날짜와 시간:"+targeDateTime);	
	
	//협정 시와 타임존
	ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
	System.out.println("협정 세계시:"+utcDateTime);	
	
	//특정 시점의 타임스템프 얻기
	Instant instant1 = Instant.now();
	System.out.println(instant1);
	
	
}
}
