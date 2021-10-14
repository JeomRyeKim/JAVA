package verify;

public class Ex5 {
	Vehicle field=new Vehicle() {
		@Override
		public void run() {
			System.out.println("자동차가 달립니다.");
		}};
		
	void method1() {
		//선언
		  Vehicle localVar = new Vehicle() {
				@Override
				public void run() {
					System.out.println("승용차가 달립니다.");
				}};
		  //메소드 호출
		  localVar.run();
	  }
    void method2(Vehicle v) {
    	v.run();
    }
	  
public static void main(String[] args) {
     Ex5 annoy = new Ex5();
     annoy.field.run();
     annoy.method1();
     annoy.method2(new Vehicle() {
			@Override
			public void run() {
				System.out.println("트럭이 달립니다.");
			}});
}
}

interface Vehicle{
	void run();
}