package lesson09_interface;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface UserAnno {
	String[] value() default "";//변수를 저장할 공간 default를 통해 빈문자 여기서만 적용되는 문법... 배열에 빈공간?!
	int number() default 5;

}
