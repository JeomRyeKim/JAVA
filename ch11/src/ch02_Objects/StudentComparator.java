package ch02_Objects;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
//		if(o1.sno < o2.sno) return -1; //음수
//		else if(o1.sno==o2.sno)return 0;
//		else return 1; //양수
		return o1.sno==o2.sno ? 0 : o1.sno-o2.sno;
	}
}

class Student{
	int sno;

	public Student(int sno) {
		this.sno = sno;
	}

}