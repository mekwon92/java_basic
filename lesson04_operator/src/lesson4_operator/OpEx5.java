package lesson4_operator;
//논리연산
public class OpEx5 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		
		//AND
		System.out.println(a > b && a == 10 );
		System.out.println(a > b && a == b );
		System.out.println(a == 10 && a == b );
		System.out.println();
		
		//OR
		System.out.println(a > b || a == 10 );
		System.out.println(a > b || a == 10 );
		System.out.println(a > b || a < b );
		System.out.println();
		
		//XOR 값이 다를때만 참
		System.out.println(a == b ^ a == 10 );
		System.out.println(a > b ^ a == b );
		System.out.println();
		
		//NOT
		System.out.println(a > b );
		System.out.println(a < b );
		
	}

}
