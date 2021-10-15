package ch02_Arrays;

import java.util.Arrays;

public class SearchExample {
	public static void main(String[] args) {
		//기본 타입 검색
		int[] scores = {99,97,98};
		//binary는 sort후에 사용
		Arrays.sort(scores);//97,98,99
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("찾은 인덱스:"+index);

		//객체 검색
		Member m1 = new Member("홍길동");
		Member m2 = new Member("박동수");
		Member m3 = new Member("김민수");
		Member[] members = {m1,m2,m3};
		//sort후 binarySearch()메소드 사용.
		Arrays.sort(members);//김민수,박동수,홍길동
		index = Arrays.binarySearch(members, m1);
		System.out.println("찾은 인덱스:"+index);
		System.out.println(members[index].name);
	}

}
