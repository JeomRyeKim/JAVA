package ch03;
//��� - �ʵ�,�޼ҵ�,������
public class SomeClass2 {
	//�ʵ�
	int f1;//����Ÿ�� ���� �����ϴ� ���� - Ŭ������������ ����� ����:field-�ʱ�ȭ�� �ؾ� ���� �� ����.
			//Ŭ���� �������� ����� �ʵ�� �ش� Ÿ���� �⺻������ (�ڵ�)�ʱ�ȭ��.
	//������ - �ʵ��ʱ�ȭ
	SomeClass2(){f1=10;}//{this.f1=10;}���ε� ��
	
	//�޼ҵ�
	void method() {
		int f1=0; //����Ÿ�� ���� �����ϴ� ���� - �޼ҵ� ���� �������� ����� ����:local����
		System.out.print(this.f1);//this.������ => this.�ʵ�� : ���⼭ this�� Ŭ������ ����Ŵ
		//�ʵ����ٹ�� .ǥ���
		//Ŭ������.�ʵ� -> Ŭ������������ .ǥ��� ���� -> this.f1;
		//�ʵ���� �޼ҵ峻���� ����� ���ú������� ���� �� �����ϴ� ������� ����.
		//this.������(�ʵ�)�� ������(���ú���)���� ���е�.
	}
	
	void method2() {//Ŭ������������ ����� ����
		this.f1=10;
		System.out.println(f1);//������ �� ���� ����? �⺻���� ������ �־ ������ �ȳ�.
		
	}
	
}