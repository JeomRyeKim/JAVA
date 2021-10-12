package ch11;

public interface Lendable {
 int BORROWED = 1; int NORMAL=0;
 void checkOut(String name, String date);
 void checkIn();
}