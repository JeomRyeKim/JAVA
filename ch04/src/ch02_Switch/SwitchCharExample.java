package ch02_Switch;

/* �ڹ� 6���� switch()�� �ȿ� - byte,char,short,int,long������ �������� �����ϴ� ����ĸ� �� �� ����.*/
public class SwitchCharExample {
public static void main(String[] args) {
		char grade = 'A';
		
		switch(grade) {
		case 'A':
		case 'a': // 'A' �� 'a'�� ���� ���� ���ڴ�
			System.out.println("��� ȸ���Դϴ�.");
			break;
		case 'B':
		case 'b':// 'B' �� 'b'�� ���� ���� ���ڴ�
			System.out.println("�Ϲ� ȸ���Դϴ�.");
			break;
		default:
			System.out.println("�մ��Դϴ�.");
		}

	}

}
