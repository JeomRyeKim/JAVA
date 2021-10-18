package ch02_List;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx01 {
public static void main(String[] args) {
	Set<Integer> set = new HashSet<>();
	System.out.println(set.add(1));
	System.out.println(set.add(2));
	System.out.println(set.add(1));//�ߺ���ü ���� �ȵ�.
	
	//�ݺ���
	Iterator<Integer>itor = set.iterator();
	while(itor.hasNext()) {
		System.out.println(itor.next());//2��(1,2)�� ����ִ°ɷ� ����.
	}
	
	//��ü ���� ���� Ȯ��
	System.out.println(set.contains(1));
	
	//���尳�� size() - 2
	System.out.println(set.size());
	
	//1�� ��ü ����
	System.out.println(set.remove(1));
	
	//���� ���� - 1
	System.out.println(set.size());
	
	//����ִ��� Ȯ�� - 1�� �����־ false
	System.out.println(set.isEmpty());
	
	//����� ��� ��ü ���� clear();
	set.clear();
	
	//����ִ��� Ȯ�� - true
	System.out.println(set.isEmpty());

}
}
