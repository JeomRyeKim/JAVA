package ch02_Switch;

import java.util.Scanner;

public class SwitchExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//������, ȭ����, ������, �����, �ݿ���, �����, �Ͽ���
	//��~����� : ������ �����մϴ�.
	//�ݿ��� : ������ �մϴ�.
	//�����,�Ͽ��� : ������ ���ϴ�.
	Scanner scanner = new Scanner(System.in);
	System.out.println("������ �Է��� �ּ���(ex:������):");
	String weekDay = scanner.next();
	

	switch(weekDay) {
	case "������": 
	case "ȭ����": 
	case "������": 
	case "�����": System.out.println("������ �����մϴ�"); break;
	case "�ݿ���": System.out.println("�������մϴ�"); break;
	case "�����": 
	case "�Ͽ���": System.out.println("������ ���ϴ�"); break;
	
	}
	//�ڿ� ����
	scanner.close();
	}

}
