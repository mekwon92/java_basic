package lesson5_control;

public class Exer {
	public static void main(String[] args) {
//1번
//		int sum = 0;
//		for(int i = 1; i <= 20; i++) {
//			sum += i * 5;
//		}
//		
//		System.out.println("5의 배수의 합계는 "+sum);
//	
		int sum = 0;
		for (int i = 1; i<= 100; i++) {
			if(i % 5 == 0)
			sum += i;
		}
		System.out.println("5의 배수의 합계는 "+sum);
//2번
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i =1; i <=100; i++) {
			if(i % 2==0) {
				evenSum += i;
			}
			else {
				oddSum += i;
			}
		}
		System.out.println("짝수의 합계는 " + evenSum);
		System.out.println("홀수의 합계는 " + oddSum);
//3번

//		for (int x = 1 ; x<= 6 ; x++) {
//			for (int y = 1 ; y <= 6 ; y++) {
//				if(x+y == 6){
//				System.out.printf("(%d, %d)\n", x, y);
//				}
//			}
//		}
		
		for (int x = 1 ; x<= 6 ; x++) {
			for (int y = 1 ; y <= 6 ; y++) {
				if(x+y == 6){
					System.out.printf("(%d, %d)\n", x, y);
				}
			}
		}
System.out.println();
//4번 
//		for (int i = 1 ; i<= 5; i++) {
//			for (int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println();
		for (int i = 0 ; i< 5; i++) {
			for (int j=0 ; j < 5 ;j++) {
				if(i >= j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		
System.out.println();
//5번
//		for (int i = 0 ; i<= 5; i++) {
//			for (int j=5; i<j; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for (int i = 0 ; i< 5; i++) {
			for (int j=0 ; j < 5 ;j++) {
				if(i + j <= 4) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		
System.out.println();
//6번(마름모만들기 풀이)
		for (int i = -2 ; i< 3; i++) {
			for (int j=-2 ; j < 3 ;j++) {
				if(i * j >= -1 && i * j <= 1) {
					//System.out.printf("(%2d,%2d)", i, j);
					System.out.print("*");
				}
				else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
		
		
System.out.println();
		
//7번
		boolean exit = false;
		int cnt = 0;
		
		while(!exit) {
			int val = (int)(Math.random() * 6 + 1);
			System.out.println("("+val+")");
			cnt++;
			if (val == 6) {
				exit = true;
			}	
		}
		System.out.println(cnt+"회");
	
	}
}
