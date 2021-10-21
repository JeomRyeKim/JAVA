package ch02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample {
	private static List<Student> list = Arrays.asList(new Student("홍길동",90,96),new Student("일지매",95,93));
	
	public static void printString(Function<Student,String> function) {
		for(Student student:list) {
			System.out.println(function.apply(student) + " ");
		}
		System.out.println();
	}
	
	public static void printInt(ToIntFunction<Student> function) {
		for(Student student:list) {
			System.out.println(function.applyAsInt(student) + " ");
		}
		System.out.println();
	}
public static void main(String[] args) {
	System.out.println("[학생 이름]");
	printString(new Function<Student, String>() {
		@Override
		public String apply(Student student) {
			return student.getName();
		}
	});
	//람다식
	printString(Student -> Student.getName()); 
	
	System.out.println("[영어점수]");
	printInt(new ToIntFunction<Student>() {
		@Override
		public int applyAsInt(Student value) {
			return value.getEnglishScore();
		}
	});
	//람다식
	printInt(value -> value.getEnglishScore());
	
	System.out.println("[수학점수]");
	printInt(new ToIntFunction<Student>() {
		@Override
		public int applyAsInt(Student student) {
			return student.getMathScore();
		}
	});
	//람다식
	printInt(student -> student.getMathScore());
}
}
