package ch01;

//인터페이스 선언
public interface G1 {
	int a=10; //static final
	void a(); //public abstract
	
}
//구현
class G2 implements G1{
	@Override
	public void a() {
		System.out.println("aa");
	}
}
class G3 implements G1{
	@Override
	public void a() {
		System.out.println("bb");	
	}
}