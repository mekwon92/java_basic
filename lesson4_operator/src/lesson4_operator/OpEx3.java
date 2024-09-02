package lesson4_operator;

public class OpEx3 {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		System.out.println(++a); //11
		System.out.println(a++); //11
		System.out.println(a); //12
		
		
		int c = ++a;
		int d = b++;

		
		System.out.println(a); //13
		System.out.println(b); //11
		System.out.println(c); //13
		System.out.println(d); //10
	
		int i = 0, sum = 0;
		while(i<=10) {
			sum += i++;
		}
		System.out.println(sum);
	}
}
