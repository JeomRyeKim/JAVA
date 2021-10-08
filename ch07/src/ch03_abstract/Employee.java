package ch03_abstract;

//*월급사원,알바사원 급여 계산*/
public abstract class Employee{//추상클래스 - 급여계산 규격 정의
 private String name;
    int sal;//급여
 private final float INCENTIVE_RATE = 0.1f;//
 
 public Employee(String name) {this.name = name;} 
 //메소드
 abstract int computePay();
 
 //final 메소드 -재정의 불가
final int computeIncentive() {
	 int pay=computePay();
	 int bonus=0;
	 if(pay>10000) {
		 bonus =(int)(pay*INCENTIVE_RATE);//급여계산
	 }
	 return bonus;
 }
 void print() {
	 System.out.println("======================");
	 System.out.println("이름: "+name);
	 System.out.println("급여: "+sal);
	 System.out.println("보너스: "+computeIncentive());
 }
}