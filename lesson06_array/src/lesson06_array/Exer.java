package lesson06_array;

//import java.util.Scanner;

public class Exer {
	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		
//		
		
		
//		
//		
//		
			
		// 3. 자연수 2개의 최대공약수 구하기(이중for문)
		// 12 18 -> 6
		// 12 : 1, 2, 3, 4, 6, 12
		// 18 : 1, 2, 3, 6, 9, 18 자기보다 작은 수를 대상으로 나머지연산의 목록에서 일치여부 확인
//			System.out.println("첫번째 수를 입력하세요>");
//			int in1 = Integer.parseInt(scanner.nextLine());
//			System.out.println("두번째 수를 입력하세요>");
//			int in2 = Integer.parseInt(scanner.nextLine());
//			System.out.printf("%d와 %d를 입력하셨습니다", in1, in2);
			

		
		int in1 = 12;
		for(int j = 2; j <= in1; j++) {
			if(in1 % j == 0) {
				System.out.print(j+" ");
			}
		}
		System.out.println();
		
		int in2 = 18;
		for(int j = 2; j <= in2; j++) {
			if(in2 % j == 0) {
				System.out.print(j+" ");
			}
		}
		System.out.println();
		// 4. 소수여부확인
		// 이 수가 소수인가 아닌가의 여부를.... 약수가 1과 자신만있는 수
		// 10 : 소수가 아니다.
		
		int num = 17;
		for(int j = 2; j <= (num-1); j++) {
			if(num % j == 0) {
				System.out.println("소수가 아닙니다");
				break;
			}
			else
				System.out.println("소수입니다");
				break;
		}
		// 5. 회문수 역순으로 뒤집어도 원래숫자와 같은 수. 여부를 묻는
		// 123321 : 회문수입니다.
		
		int a = 12345;
		
		for( ; a != 0; a/=10) {
			System.out.print(a%10);
		}
		
		
	}
}
