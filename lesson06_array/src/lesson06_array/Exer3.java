package lesson06_array;

import java.util.Scanner;

public class Exer3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
//3. 자연수 2개의 최대공약수 구하기(이중for문) great common dividor
	// 12 18 -> 6
	// 12 : 1, 2, 3, 4, 6, 12
	// 18 : 1, 2, 3, 6, 9, 18 자기보다 작은 수를 대상으로 나머지연산의 목록에서 일치여부 확인
//		System.out.print("첫번째 수를 입력하세요>");
//		int in1 = scanner.nextInt();
//		System.out.print("두번째 수를 입력하세요>");
//		int in2 = scanner.nextInt();
//		System.out.printf("%d와 %d를 입력하셨습니다\n", in1, in2);
//	
//		for(int j = 2; j <= in1; j++) {
//			if(in1 % j == 0) {
//				System.out.print(j+" ");
//			}
//		}
//		System.out.println();
//		
//		for(int j = 2; j <= in2; j++) {
//			if(in2 % j == 0) {
//				System.out.print(j+" ");
//			}
//		}
//		System.out.println();
		
		/*유클리드 호제법 앞수를 뒷수로 나눈 나머지. 0이될 때까지
		 * 12 18 12
		 * 	  18 12 6
		 *       12 6 0*/
		
		int num1 = 12;
		int num2 = 18;
		int result = 0;
		
		boolean flag = true;
		while(flag) {
			int tmp = num1 % num2;
			System.out.printf("%d %d %d\n", num1, num2, tmp);
			num1 = num2;
			num2 = tmp;
			if(tmp == 0) {
				flag = false; //break;도 가능
				System.out.println(num1);
			}
		}
				
		//약수 구하기
//		num1 = 12;
//		num2 = 18;
//		result = 0;
//		for(int i = 1; i <= num1; i++) {
//			for(int j = 1; j <= num2; j++) {
//				if(num1 % i == 0 && num2 % i == 0 && i==j) {
//					//System.out.println(i);
//					result = i;
//				}
//			}
//		}
//		System.out.println(result);
		
		//최소공배수 구하기 :  a * b / gcd
		// 12 24 36 48 60 72
		// 18 36 72 90
		// 36 72 108
		
		// 12 * 18 / 6
		
		num1 = 12;
		num2 = 18;
		System.out.println("==============");
		
		outer:
		for(int i = num1 ; i <= num1 * num2 ; i += num1) {
			for(int j = num2 ; j <= num1 * num2 ; j += num2) {
				if (i == j) {
					System.out.println(j);
					break outer;
				}
			}
		}
		System.out.println("==============");
		
		//4. 소수여부확인
		// 이 수가 소수인가 아닌가의 여부를.... 약수가 1과 자신만있는 수
		// 10 : 소수가 아니다.	
	
//		int num = 17;
//		for(int j = 2; j < num; j++) {
//			if(num % j == 0) {
//				System.out.println("소수가 아닙니다");
//				break;
//			}
//			else
//				System.out.println("소수입니다");
//				break;
//		}
		
		int num = 11;
		flag = true;
		for(int i = 2; i < num ; i++) {
			if(num % i == 0) {
				flag = false;
				break;
			}			
		}
		System.out.println(num + "은 " + (flag ? "소수" : "소수 아님"));
	
	
	
	}
}
