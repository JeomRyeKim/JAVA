package verify;

public class Ex6 {
	public static void main(String[] args) {
		System.out.println("6.다음에 주어진 바이트 배열을 문자열로 변환시켜보라.");
		//{ 73, 32, 108, 111, 118, 101, 32, 121, 111, 117 };
		//네트워크를 통한 채팅시 
		byte[] bytes={ 73, 32, 108, 111, 118, 101, 32, 121, 111, 117 };
		String str=new String(bytes);
		System.out.println(str);
	}
}