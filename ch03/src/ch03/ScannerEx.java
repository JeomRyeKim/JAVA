package ch03;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//println() => print and new Linf
		//print() => ���� �ٿ��� ��� �̾ ���
		System.out.print("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();//String next()
		System.out.print("�̸��� " + name + ", ");
		
		String city = scanner.next();//String next()
		System.out.print("���ô� " + city + ", ");
		
		int age = scanner.nextInt();//int nextInt()
		System.out.print("���̴� " + age + "��, ");
		
		double weight = scanner.nextDouble();//double nextDouble()
		System.out.print("�����Դ� " + weight + "kg, ");
		
		boolean single = scanner.nextBoolean();//boolean nextBoolean()
		System.out.print("���� ���δ� " + (single?"�̱�":"����") + "�Դϴ�.");
		
		//�ڿ�����
		scanner.close();

	}

}
