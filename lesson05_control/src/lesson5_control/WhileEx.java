package lesson5_control;
//while문을 이용해서 합계 구하기
public class WhileEx {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while(i <= 100) {
			sum += i;
			System.out.printf("i : %d, sum : %d\n", i, sum);
			i++;
		}
		System.out.println("합계 : "+sum);
	
//정수를 입력받아 각 자릿수의 합계를 구하여라
		int num = 123123;
		sum = 0;
		
//		while(num != 0) {
//			sum += num % 10 ;
//			num /= 10;
//		}
		
		System.out.println(sum);
		sum = 0;
		for( ; num != 0 ; num /= 10){
			sum += num % 10 ;
		}
	}
}
			

