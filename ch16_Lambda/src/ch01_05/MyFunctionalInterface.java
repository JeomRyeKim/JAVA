package ch01_05;

@FunctionalInterface
public interface MyFunctionalInterface {
	public void method();
}
class UsingThis{
	public int outterField=10;
	
	class Inner{
		int innerField=20;
		//무명인터페이스 : 아예 새로운 객체를 만들어서 대입하는 것이라 클래스 안의 innerField접근 불가
		void method() {//인터페이스타입 변수 = 실체(자식)객체(instance)의 생성 후 프로모션
			MyFunctionalInterface fi = new MyFunctionalInterface() {
//				int innerField=20;
				@Override
				public void method() {
				System.out.println("outterField:" + outterField);
				System.out.println("outterField:" + UsingThis.this.outterField);
				
				System.out.println("innerField:" + innerField);
				System.out.println("innerField:" + this.innerField);//접근불가
				}
			};
			fi.method();
		}
	}//Inner클래스 끝.
	
	class MyIn implements MyFunctionalInterface{
//		int innerField=10;
		@Override
		public void method() {
			System.out.println("outterField:" + outterField);
			System.out.println("outterField:" + UsingThis.this.outterField);
			
			System.out.println("innerField:" + innerField);
			System.out.println("innerField:" + this.innerField);//접근불가	
		}
		
	}
}