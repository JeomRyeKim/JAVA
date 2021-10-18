package ch03_Map;

import java.util.HashMap;
import java.util.Map;

public class MapEx03 {
public static void main(String[] args) {
	Map<String, Double> cities = new HashMap<String, Double>();
	cities.put("����", 32.5);
	cities.put("����¡", 35.8);
	cities.put("ȫ��", 39.5);
	cities.put("����", 38.7);
	
	//Ű ���� ���� Ȯ��
	System.out.println(cities.containsKey("����¡"));
	//�� ���� ���� Ȯ�� - "����" 32.5 -> 38.7 �ٲ� 32.5�� ���� ���̶�� false�� ��.
	System.out.println(cities.containsValue(32.5));//38.7 -> Integer(38.7) AutoBoxing
	
	//����� ���� size();
	System.out.println(cities.size());// 3��(�ٲﰪ�� ����)
	
	//Ư�� Ű�� �ش��ϴ� ��ü ���� - ���� �� ���� �� ����remove(Ű);
	System.out.println(cities.remove("ȫ��"));
	
	//��ü ����
	cities.clear();
	
	//����ִ��� Ȯ��
	System.out.println(cities.isEmpty());	
}
}
