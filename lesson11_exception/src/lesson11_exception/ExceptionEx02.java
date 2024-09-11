package lesson11_exception;

public class ExceptionEx02 {
	public static void main(String[] args) {
		System.out.println(1);
		try {//문제발생시 catch로 워프. 예외발생가능성있는 코드를 묶는역할
			System.out.println(2);
			System.out.println(3/0); //여기서 예외발생해서 5번으로 워프
			System.out.println(4);
		}
		catch (ArithmeticException e) { //Exception도 가능
			System.out.println(5);
		}
		System.out.println(6);
	}
}
