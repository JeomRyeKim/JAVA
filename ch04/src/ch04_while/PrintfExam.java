package ch04_while;

/* printf("포멧기호1 포멧기호2 포멧기호3...", 값1,값2,값3,...) */
//포멧기호의 개수와 값의 개수가 같아야함.
//포멧기호의 데이터 타입과 매칭되는 값의 테이터 타입이 같아야함.
/* %d int타입의 정수,
 * %f double타입의 실수,
 * %e 부동소수점 형태,
 * %c 문자,
 * %s String타입의 문자열
 * */
public class PrintfExam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%x \n",15);//%x는 16진수 포멧 - 10진수 -> 16진수로 표현
		System.out.printf("%d \n",15);//%d는 10진수 포멧 - 10진수
		System.out.printf("%f \n",15.0);//%f는 실수포멧
		System.out.printf("%e \n",15.0);//%e는 부동소수점 포맷
		System.out.printf("%s \n",15.0);//%s는 문자열 "15.0"
		//5나누기 2는 몫이 2이고, 나머지는 1입니다.
		//%로 시작하는 포맷문에 %타입 개수만큼 변수(값)을 ,로 나열함.
		//%타입과 변수(값) 타입은 같아야함.
		System.out.printf("%d 나누기 %d는 몫이 %d이고, 나머지는 %d입니다.\n",5,2,(5/2),(5%2));
	}

}
