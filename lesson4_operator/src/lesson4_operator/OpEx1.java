package lesson4_operator;
//복합산술연산
public class OpEx1 {
	public static void main(String[] args) {
		int number1 = 10;
		System.out.println("number1 = 10 -> " + number1);
		number1 += 10;
		System.out.println("number1 += 10 -> " + number1);
		number1 -= 10;
		System.out.println("number1 -= 10 -> " + number1);
		number1 *= 2;
		System.out.println("number1 *= 2 -> " + number1);
		number1 /= 2;
		System.out.println("number1 /= 2 -> " + number1);
		number1 %= 3;
		System.out.println("number1 %= 3 -> " + number1);
		
		System.out.println('a'+10);
		System.out.println('1'+10);
		System.out.println('1'+'a');
		}
}
