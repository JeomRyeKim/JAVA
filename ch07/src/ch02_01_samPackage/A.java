package ch02_01_samPackage;

public class A {
 private   int pri;
 		   int def;
 protected int pro;
 public    int pub;
}
class B extends A{
	void m() {
		pub=1;
		pro=2;
		def=3;
		//pri=4; - private 접근불가
	}
}