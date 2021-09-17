package ch04;

public class LiteralCharExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	char c1 = 'w';
	char c2 = 'A';
	char c3 = '가';
	char c4 = '*';
	char c5 = '3';
	char c6 = '글';
	//유니코드는 127번까지는 ASCII코드값과 같다
	char c7 = '\u0041';//유니코드 문자 4*16 + 1 =
	char c8 = '\uae00';
	
	//D64D		AE38	 B3D9
	char h = '\uD64D';
	char g = '\uAE38';
	char d = '\uB3D9';
	System.out.println(h);
	System.out.println(g);
	System.out.println(d);
	
	//각자이름을 유니코드로 출력해보세요.
	char ll = '\uC774';
	char hh = '\uD61C';
	char jj = '\uC815';
	System.out.println(ll);
	System.out.println(hh);
	System.out.println(jj);
	
	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);
	System.out.println(c4);
	System.out.println(c5);
	System.out.println(c6);
	System.out.println(c7);
	System.out.println(c8);
	
	
	}

}
