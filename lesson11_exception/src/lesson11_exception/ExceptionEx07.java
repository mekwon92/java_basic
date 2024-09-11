package lesson11_exception;
import java.io.IOException;

public class ExceptionEx07 {
	public static void main(String[] args) {
		Exception exception = new Exception();
		//checked(compile) exception : 일반 예외. 문법적으로 선언이 되어야함.
		//unchecked(runtime) exception : 런타임 예외. 이걸 주로 사용함.
		
		try {
			m1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("가능"); //throws 하면못봄...
	}
	
	static void m1() throws Exception {
		Exception ex = new Exception();
		throw ex;  //보통 예외 던지는건 호출한곳..마지막은 jvm..
	}
}



class A {
	void m() throws IOException{
		
	}
}

class B extends A{

	@Override
	public void m() throws IOException { // 더넓은범위 가능..
	}
	
}
