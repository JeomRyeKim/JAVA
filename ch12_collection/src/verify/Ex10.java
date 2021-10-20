package verify;

import java.util.TreeSet;

public class Ex10 {
public static void main(String[] args) {
	TreeSet<Student1> treeSet = new TreeSet<>();
    treeSet.add(new Student1("blue", 96));
    treeSet.add(new Student1("hong", 86));
    treeSet.add(new Student1("white", 92));

    Student1 student = treeSet.last();
    System.out.println("최고점수 : " + student.score);
    System.out.println("최고점수를 받은 아이디 : " + student.id);
}
}

class Student1 implements Comparable<Student1>{
	String id;
	int score;
	
	public Student1(String id, int score) {
		this.id = id;
		this.score = score;
	}
	
	public int compareTo(Student1 o) {
		return this.score-o.score;
	}
}