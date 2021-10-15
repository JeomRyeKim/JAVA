package ch03_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/* java 1.8�� �߰��� time��Ű�� */
public class DateTimeCreateExample {
public static void main(String[] args) {
	//��¥ ���
	LocalDate currDate = LocalDate.now();
	System.out.println("���� ��¥:"+currDate);
	
	LocalDate targetDate = LocalDate.of(2024, 5, 10);
	System.out.println("��ǥ ��¥:"+targetDate);
	
	//�ð�
	LocalTime currTime = LocalTime.now();
	System.out.println("���� �ð�:"+currTime);
	
	LocalTime targeTime = LocalTime.of(6,30,0,0);
	System.out.println("��ǥ �ð�:"+targeTime);
	
	//��¥ �ð�
	LocalDateTime currDateTime = LocalDateTime.now();
	System.out.println("���� ��¥�� �ð�:"+currDateTime);
	
	LocalDateTime targeDateTime = LocalDateTime.of(2024,5,10,6,30,0,0);
	System.out.println("��ǥ ��¥�� �ð�:"+targeDateTime);	
}
}
