package lesson06_array;
//5. 회문수 역순으로 뒤집어도 원래숫자와 같은 수. 여부를 묻는
		// 123321 : 회문수입니다.
public class Exer4 {
	public static void main(String[] args) {
		int a = 12345;
		int rev = 0;
		
		while( a != 0) {
			rev = (a % 10); //5
			a /= 10;		//1234
			System.out.println(a);			
			System.out.println(rev);
		}
				

			
	}
}
