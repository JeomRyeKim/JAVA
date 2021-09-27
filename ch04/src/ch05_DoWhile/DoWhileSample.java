package ch05_DoWhile;

public class DoWhileSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'a';
		
		do {
			System.out.print(c);
			System.out.print(c+1);
			c = (char)(c+1);
			//System.out.println(c);
		}while(c<='z');

	}

}
