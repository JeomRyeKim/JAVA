package ch01_03;

public class Ex03 {
public static void main(String[] args) {
	//10,20�� �޾Ƽ� ���� ��� 30�� �����ϴ� �޼ҵ�
	//1.����, 2.����
	MyFunctionalIterface fi = new MyFunctionalIterface() {
		@Override
		public int method(int x, int y) {
//			int result = x + y;
//			return result;
			return x+y;
		}
	};
	
	int res = fi.method(10, 20);
	System.out.println(res);
	
	//���ٽ�
	fi = (x, y) -> x + y; //return�� ���� ����
	res = fi.method(10, 20);
	System.out.println(res);
}
}
