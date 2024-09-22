package lesson14_generic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//Class 사용법? 설계도를 위한 메서드를 제공
public class GenericEx6 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<GenericEx6> cls = GenericEx6.class;
		Method[] methods = cls.getDeclaredMethods();
		for(Method m : methods) {
			System.out.println(m.getName());
			if(m.getName().equals("test")) {
				m.invoke(new GenericEx6());
			}
		}
		
		GenericEx6 ex6 = cls.newInstance();
		ex6.test();
		GenericEx6.getT(10L); //깔끔..?!
		GenericEx6.getT(10);
		
		//간접호출?
		
	}
	
	void test() {
		System.out.println("test!!!");
	}
	
	
	static <T> T getT(T t) { //<T>를 통해서 사용.......?!!!!!!!
		return t;
	}
}
