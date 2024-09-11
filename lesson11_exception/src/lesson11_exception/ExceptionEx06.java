package lesson11_exception;

public class ExceptionEx06 {
	public static void main(String[] args) {
		System.out.println("main 전");
		m1();
		System.out.println("main 후");
	}
	static void m1() {
		System.out.println("m1() 전");
		try {
			m2();			
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException 예외 처리");
			e.printStackTrace();
		}
		finally {
			System.out.println("m1() 후(finally)");
		}
		System.out.println("m1() 후");
	}
	static void m2() {
		System.out.println("m2() 전");
		try {
			m3();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("index 예외 처리");
		}
		finally { // 예외가 뜨던 안뜨던 반드시 실행할 것 catch 없어도 사용가능 try 는 있어야함
			System.out.println("m2() 후(finally)");
		}
		System.out.println("m2() 후");
	}
	static void m3() {
		//로직수행
//		System.out.println(3/0);
		ArithmeticException e = new ArithmeticException("0으로 정수를 나눔");
		try { //throw e;
			throw e; //이 아래부분은 출력불가능
			//밑은 도달불가한 곳
		}
		catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
	}
}
