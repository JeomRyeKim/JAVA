package ch02_Calendar;

import java.util.TimeZone;

public class PrinTimeZoneID {
public static void main(String[] args) {
	String[] availableIDs = TimeZone.getAvailableIDs();//전세계 timezone id얻기
	for(String id:availableIDs)
		System.out.println(id);
}
}
