package lesson11_exception;
//install 설치 사용자가 취소시 .. 잘안되면 잔여물이..
public class ExceptionEx05 {
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
		System.out.println(3/0);
	}
}
