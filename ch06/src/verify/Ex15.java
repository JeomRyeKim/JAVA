package verify;
public class Ex15 {
public static void main(String[] args) {
 MemberService m = new MemberService();	
 boolean result = m.login("hong", "12345");
 if(result) {//if(result == true)
	System.out.println("로그인 되었습니다.");
	m.logout("hong");
 }else {System.out.println("id,pwd확인요!");}
}
}

class MemberService{
	boolean login(String id, String password) {
		boolean result = false;
		if(id.equals("hong") && password.equals("12345"))
			result = true;
		else result = false;
		return result;
	}
	void logout(String id) {
		if("hong".equals(id))
			System.out.println(id + "님 로그아웃 되었습니다.");
	}
}