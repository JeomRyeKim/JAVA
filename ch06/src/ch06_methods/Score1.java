package ch06_methods;

public class Score1 {
	//�ʵ�
	int kor;
	int eng;
	int math;
	
	//�޼ҵ� - 4����(�Ű�����X, ����Ÿ��X)
	void display() {
		int sum = kor + eng + math;
		System.out.println("�հ�:" + sum);
		System.out.println("���:" + sum/3);
	}
	//�޼ҵ� - 4����(�Ű�����X, ����Ÿ��X)
	void print() {
		System.out.println(kor + "\t" + eng + "\t" + math);
	}
	//�޼ҵ� - 3����(�Ű�����O, ����Ÿ��X)
	void print(int kor, int eng, int meth) {
		System.out.println(kor + "\t" + eng + "\t" + math);
	}
	//�޼ҵ� - 1����(�Ű�����O, ����Ÿ��O)
	int res(int kor, int eng, int math) {
		return kor + eng + math;
	}
	//�޼ҵ� - 2����(�Ű�����X, ����Ÿ��O)
	int res() {
		return kor + eng + math;
	}
	
}
