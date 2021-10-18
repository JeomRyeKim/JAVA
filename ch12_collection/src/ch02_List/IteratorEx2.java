package ch02_List;

import java.util.Vector;

public class IteratorEx2 {
public static void main(String[] args) {
	Vector<Integer> v = new Vector<Integer>();
	v.add(5);
	v.add(4);
	v.add(-1);
	v.add(2, 100);
	
	for(int i=0; i<v.size(); i++)
		System.out.println(v.get(i));
	
	int sum=0;
	for(int i=0; i<v.size(); i++)
		sum+=v.get(i);
	
	System.out.println("벡터에 있는 정수 합:"+sum);
}
}
