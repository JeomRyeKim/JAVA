package NaNAndInfinity;

public class InputDataCheckNaNExaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				///숫자가 아닌 NaN을 입력받아서 연산 처리
				String userInput = "NaN";
				
				//Double은 double타입의 데이타를 만들고 수정처리해주는 클래스
				//wrapper클래스라고 함.
				//Double타입의 변수 선언 하고 값 저장
				Double a = Double.valueOf(5.0);// double값으로 생성
				Double b = Double.valueOf("5.0");// double값을 가진 문자열로 생성
				
				System.out.println(a.doubleValue());
				System.out.println(b.doubleValue());
				
				// Double타입의 값이 double타입으로 auto unboxing처리되기 때문
				System.out.println(a);// Double 5.0 -> double 5.0 으로 자동 형변환 
				System.out.println(b);
				double val = Double.valueOf(userInput);
				
				double currentBalance = 10000.0;
				
				if(Double.isNaN(Double.valueOf(userInput))) {
					System.out.println("NaN이 입력되어 처리할 수 없음");
				}else {
					currentBalance += val;
					System.out.println(currentBalance);
				}

			}
		}
