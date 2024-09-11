package lesson11_exception;

public class ExceptionEx03 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3); //예외 미발생시 모두 출력됨
			System.out.println(4);
		}
		catch (ArithmeticException e) {
			System.out.println(5);
		}
		System.out.println(6);
	}
}
