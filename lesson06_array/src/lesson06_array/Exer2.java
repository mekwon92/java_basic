package lesson06_array;
import java.util.Scanner;
//	 2. 두 수를 입력받아(정수) 두 수의 사이의 정수의 합 3, 7 -> 3+4+5+6+7 ! 7,3일 경우도 어떻게 처리할지~?
public class Exer2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
					
//			System.out.print("첫번째 수를 입력하세요>");
//			int input1 = scanner.nextInt();
//			System.out.print("두번째 수를 입력하세요>");
//			int input2 = scanner.nextInt();
//			System.out.printf("%d와 %d를 입력하셨습니다", input1, input2);
//			
//			int sum = 0;
//			int tmp = 0;
//			
//			if(input1 > input2) {
//				tmp = input1;
//				input1 = input2;
//				input2 = tmp;	
//			}
//			sum = input1;
//			int i = input1;
//			for( ; i <= input2 ; i++) {
//				sum += input1;
//			}
//			
//	
//			System.out.printf("두 수 사이의 합은 %d 입니다.",sum);

		int num1 = 19;
		int num2 = 10;
		int sum = 0;
		
		if(num1 > num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
			
		}
		for(int i = num1 ; i <= num2 ; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	//조건식 내 반복문 지양
	}
}
