package ch03_Map;

import java.util.HashMap;
import java.util.Map;

public class MapEx04 {
public static void main(String[] args) {
	//1."ȫ�浿", 2."������", 3."�Ӳ���", 2."�̼���"
	//���� �����ϴ� Map�� �����, ���� ��
	//����� ��ü�� ���� Ȯ��
	//Map���� 3�� Ű�� �ش��ϴ� ��ü�� ����غ�����
	Map<Integer, String> name = new HashMap<Integer, String>();
	name.put(1, "ȫ�浿");//�⺻Ÿ�� int -> Integer�� AutoBoxing
	name.put(new Integer(2), "������");
	name.put(new Integer("3"), new String("�Ӳ���"));
	name.put(2, "�̼���");//int -> Integer
	
	System.out.println(name.size());
	
	System.out.println(name.get(3));//AutoBoxing
	
	System.out.println(name.get(2));//AutoBoxing - �̼��� ���
	
}
}