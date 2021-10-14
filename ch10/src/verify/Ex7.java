package verify;

public class Ex7 {
public static void main(String[] args) {
	try {
		login("white","12345");
	} catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	try {
		login("blue","54321");
	} catch(Exception e) {
		System.out.println(e.getMessage());
	}
}//main
public static void login(String id, String password)
          throws Exception{
		    //throws NotExistIDException,WronPasswordException{
	//id가 "blue"가 아니라면 NotExistIDException 발생시킴
	 if(!id.equals("blue")) {
		 throw new NotExistIDException("아이디가 존재하지 않습니다.");
	 }
		//password가 "12345"가 아니라면 WrongPasswordExceprion 발생시킴
	 if(!password.equals("12345")) {
		 throw new WronPasswordException("패스워드가 틀립니다.");
	 }
 }

}