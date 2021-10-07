package verify;

public class Ex18 {
public static void main(String[] args) {
	ShopService obj1 = ShopService.getInstance();
	ShopService obj2 = ShopService.getInstance();
	System.out.println(obj1==obj2 ? "같은 객체" : "다른 객체");
}
}

/* 싱글톤
 * 1.자신타입의 private static필드 생성
 * 2.default생성자를 private로 선언
 * 3.public getInstance() 메소드 선언
 *  */
class ShopService{
	//private static ShopService instance  = new ShopService();
	private static ShopService instance;
	
	private ShopService() {}

	public static ShopService getInstance() {
		if(instance==null) instance = new ShopService();
		return instance;
	}
	
	
}
	
