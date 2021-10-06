package ch09_annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)//어노테이션 유지 기간
@Target(METHOD)//어노테이션 적용 대상
public @interface PrintAnnotation {
String value() default "-";
int number() default 15;
}


