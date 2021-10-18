package verify;

import java.util.HashMap;

public class Ex3 {
public static void main(String[] args) {
	System.out.println("Student 클래스를 작성하되, Object의 equals()와 hashCode()를 오버라이딩해서\r\n"
			+ "Student의 학번(studentNum)이 같으면 동등 객체가 될 수 있도록 해보세요. Student 클래\r\n"
			+ "스의 필드는 다음과 같습니다. hashCode()의 리턴값은 studentNum 필드값의 해시코드를 리\r\n"
			+ "턴하도록 하세요.");
	
	//Student 키로 총점을 저장하는 HashMap객체 생성
	HashMap<Student,String> hashMap = new HashMap<>();
	
	//new Student("1")의 점수 95를 저장
	hashMap.put(new Student("1"), "95");
	
	//
	String score = hashMap.get(new Student("1"));
	System.out.println("1번 학생의 총점:"+score);
	
	
}
}
class Student{
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}
	//1.hashCode()

	@Override
	public int hashCode() {
		return studentNum.hashCode();//String은 내용이 같으면 hashCode값이 같다. "1", "1"
	}

	//2.equals()
	@Override
	public boolean equals(Object obj) {//객체의 promotion
		if(obj instanceof Student) {//다형성
		 return this.studentNum.equals(((Student)obj).getStudentNum());//casting
		}
		return false;
	}
}