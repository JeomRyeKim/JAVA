package ch03; // -����� Ȯ���ϱ�.

public class student {
//�ʵ�
	private String sno;
	private String name;
	
//������ // Source -> Generate Constructor using Fields..-> �ڽ� üũ�ϰ� Generate Ŭ��.
public student() {}
public student(String sno) {
		this.sno = sno;
}
public student(String sno, String name) {
		this.sno = sno;
		this.name = name;
	}
//�޼ҵ�
}
