package ch04;

import java.util.HashSet;
import java.util.Set;

public class CustomerMain {
public static void main(String[] args) {
	Set<Customer> set = new HashSet<>();
	set.add(new Customer(1, "홍길동", "서울시", "010-111-1234"));
	set.add(new Customer(2, "홍길동", "수원시", "010-111-4567"));
	set.add(new Customer(3, "임꺽정", "서울시", "010-111-1234"));
	set.add(new Customer(1, "일지매", "인천시", "010-111-1234"));
	set.add(new Customer(4, "홍길동", "수원시", "010-111-4567"));
	set.add(new Customer(1, "홍자매", "인천시", "010-111-1234"));
	
	System.out.println(set);
}
}
