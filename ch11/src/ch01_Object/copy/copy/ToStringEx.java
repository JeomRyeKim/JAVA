package ch01_Object.copy.copy;

import java.util.Date;

public class ToStringEx {
	public static void main(String[] args) {
		A a = new A();
		a.f1="field1";
		a.i1=10;
		System.out.println(a.toString());//15db9742�� toString�޼ҵ�(16������ �Ǿ�����)
		
		//DateŬ������ toString()�� ��¥��������ϵ��� ������ ��.
		Date date=new Date();
		System.out.println(date.toString());
		
		//System.out.print()�޼ҵ��� �Ű������� ���������� ���޵Ǹ�
		// toString()�޼ҵ尡 �ڵ� ȣ��
		System.out.println(a);//toString()�ڵ� ȣ��
		System.out.println(date);//toString()�ڵ� ȣ��
	}
}
class A extends Object{
	String f1;
	int i1;
	@Override
	public String toString() {
		return "A[f1=" + f1 + ", i1=" + i1 + "]";
	}
	
	
	
}