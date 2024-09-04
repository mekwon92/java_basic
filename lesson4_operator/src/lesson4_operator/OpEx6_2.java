package lesson4_operator;
//Integer.parseInt(String) : int
//Integer.parseInt(String, n) : int (n :진법)

public class OpEx6_2 {
	public static void main(String[] args) {
		
		int num = 10;
		String s = num +""; //전체를 문자열로 만들어줌
		System.out.println(s);

		int num2 = Integer.parseInt("1234"); //문자열을 숫자로 만들어줌! (tab키 사용하기)
		System.out.println(num2 % 10);
		
		int num3 = Integer.parseInt("1010", 2);
		System.out.println(num3);
		
		String bin2 = "FA";
		int num4 = Integer.parseInt(bin2, 16);
		System.out.println(num4);
		
	}
}
