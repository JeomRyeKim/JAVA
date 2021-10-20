package verify;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex8 {
	public static void main(String[] args) {
        Set<Student> set = new HashSet<Student>();
 
        set.add(new Student(1, "홍길동"));
        set.add(new Student(2, "신용권"));
        set.add(new Student(1, "조민우")); //학번이 같으므로 저장되지 않음
 
        Iterator<Student> iterator = set.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.studentNum + " : " + student.name);
        }
    }
}

class Student {
    public int studentNum;
    public String name;
    
    public Student (int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }
    
	@Override
	public int hashCode() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		return this.studentNum == ((Student)obj).studentNum;
	}


}

