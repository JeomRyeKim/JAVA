package ch03;

import ch01.Engine;
import ch01.Handle;
import ch01.Tire;

//Ŭ������ ���� ���-�ʵ�, ������, �޼ҵ�
public class Car {
	//�ʵ� ����
	//Ÿ�� �ʵ��[=�ʱⰪ];
	//�ʵ� ����� �ʱⰪ�� ���� ������
	//�ش� Ÿ���� �⺻������ �ʱ�ȭ��.
	
	//�����Ӽ�
	String company = "�����ڵ���";//����Ÿ�� �ʵ�
	String model = "�׷���";//����Ÿ�� �ʵ�
	int maxSpeed = 300;//�⺻Ÿ�� �ʵ�
	
	int productionYear;//�⺻Ÿ�� �ʵ� - ��:0
	
	//���� ����
	int currentSpeed;//�⺻Ÿ�� �ʵ� - ��:0
	boolean engineStart;//�⺻Ÿ�� �ʵ� - ��:false
	
	//��ǰ
	Engine engine;//����Ÿ�� �ʵ� - ��:null
	Handle handle;//����Ÿ�� �ʵ� - ��:null
	Tire tire;//����Ÿ�� �ʵ� - ��:null
}