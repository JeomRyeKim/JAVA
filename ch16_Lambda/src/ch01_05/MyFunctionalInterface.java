package ch01_05;

@FunctionalInterface
public interface MyFunctionalInterface {
	public void method();
}
class UsingThis{
	public int outterField=10;
	
	class Inner{
		int innerField=20;
		//�����������̽� : �ƿ� ���ο� ��ü�� ���� �����ϴ� ���̶� Ŭ���� ���� innerField���� �Ұ�
		void method() {//�������̽�Ÿ�� ���� = ��ü(�ڽ�)��ü(instance)�� ���� �� ���θ��
			MyFunctionalInterface fi = new MyFunctionalInterface() {
//				int innerField=20;
				@Override
				public void method() {
				System.out.println("outterField:" + outterField);
				System.out.println("outterField:" + UsingThis.this.outterField);
				
				System.out.println("innerField:" + innerField);
				System.out.println("innerField:" + this.innerField);//���ٺҰ�
				}
			};
			fi.method();
		}
	}//InnerŬ���� ��.
	
	class MyIn implements MyFunctionalInterface{
//		int innerField=10;
		@Override
		public void method() {
			System.out.println("outterField:" + outterField);
			System.out.println("outterField:" + UsingThis.this.outterField);
			
			System.out.println("innerField:" + innerField);
			System.out.println("innerField:" + this.innerField);//���ٺҰ�	
		}
		
	}
}