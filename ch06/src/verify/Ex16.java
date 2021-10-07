package verify;

/* 메소드 오버로딩 문제 */
public class Ex16 {
public static void main(String[] args) {
	Printer printer = new Printer();
	printer.println(10);
	printer.println(true);
	printer.println(5.7);
	printer.println("홍길동");
	
	//static메소드 호출
	printer.print(10);
	printer.print(true);
	printer.print(5.7);
	printer.print("홍길동");
}
}

class Printer{
	//메소드 오버로딩 -> 16번문제
	void println(int i) {System.out.println(i);}
	void println(boolean b) {System.out.println(b);}
	void println(double d) {System.out.println(d);}
	void println(String str) {System.out.println(str);}
	
	//static멤버 - non static멤버 구분 -> 17번문제
	static void print(int i) {System.out.println(i);}
	static void print(boolean b) {System.out.println(b);}
	static void print(double d) {System.out.println(d);}
	static void print(String str) {System.out.println(str);}
}
