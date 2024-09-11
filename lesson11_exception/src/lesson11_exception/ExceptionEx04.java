package lesson11_exception;

public class ExceptionEx04 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			Integer.parseInt("a"); // NumberFormatException
			System.out.println(args[0]); // ArrayIndexOutOfBoundsException args는 길이가 0임
			System.out.println(4/0);
		}
		catch (ArithmeticException e) { //e는 예외의 객체 (ArithmeticException는 클래스)
			System.out.println(5);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(6);
		}
		catch(Exception e) {
			System.out.println("최후의 처리");
			//e.printStackTrace(); //내역을 보여주는 역할 (배열타입)
			System.err.println(e.getClass().getName()); //java.lang.NumberFormatException
			System.err.println(e.getMessage()); //For input string: "a"
			StackTraceElement[] elements = e.getStackTrace(); //배열의 개별적인 값
			for(StackTraceElement ste : elements) {
				System.out.println(ste.getMethodName()); //상세적으로확인가능(forInputString, parseInt, parseInt, main)
			}
		}
		System.out.println(7);
		
	}
}
