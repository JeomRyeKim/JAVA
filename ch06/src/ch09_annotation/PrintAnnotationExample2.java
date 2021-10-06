package ch09_annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PrintAnnotationExample2 {
	public static void main(String[] args) {
		//메소드정보 얻기 - reflection
		Method[] declareMathods 
		= Service.class.getDeclaredMethods();
		Constructor[] cons
		= Service.class.getConstructors();
		Field[] fields = Service.class.getFields();
		
		//reflection
		for(Method method : declareMathods) {
			PrintAnnotation printAnnotation
			= method.getAnnotation(PrintAnnotation.class);
			
			for(int i=0; i<printAnnotation.number(); i++)
				System.out.print(printAnnotation.value());
			System.out.println();
		}
	}

}
