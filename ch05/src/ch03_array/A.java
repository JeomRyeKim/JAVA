package ch03_array;

public class A {
	//Ÿ��[] ������;
	//String[] args
	//main()�޼ҵ���
	//�Ű������κ�()�� ���� �迭 String[] args
	//�� ���̰� ���������� ���� �迭
	//�ڹ����α׷� ����� arguments�� �����ؼ� ������. - ������ �������� ���е�.
	//�ƱԸ�Ʈ�� ������ŭ String[] �迭 �����Ǿ ����.
	//java A hello world my name is �浿
	//=> String[] args = {hello,world,my,name,is,�浿};
	public static void main(String[] args) {//arguments, ����, �Ű����� �κ�
		
		System.out.println("�迭�� ����:" + args.length);
		System.out.println("�迭�� ù��° ��:" + args[0]);// Run Configuration����  Program arguments�� �� �Է��ϱ�.
		System.out.println("�迭�� �ι�° ��:" + args[1]);
		
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}

	}

}
