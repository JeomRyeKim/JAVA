package ch02_work;


public interface Lendable {
	//상수 -flag:상태표시 
	int BORROWED = 1;//대출
	int NORMAL = 0;//미대출
    //대여메소드
	void checkOut(String name, String date);
    //반납
	void checkIn();

}