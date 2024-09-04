package day2;

import java.util.Arrays;
import java.util.Scanner;

public class Exer2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//지폐, 동전 세기
		int money = 123456;
		int[] units = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int[] counts = new int[10];
		//{2,2,0,3,0,4,1,0,1,1}의 결과 값이 나올 수 있도록

		//돈에서 50000원 나눈 몫을 배열0번에 저장
		
		int a = 50000;
		for(int i = 0; i < 10 ; i=i+2) { //인덱스 번호는 0~9 까지. 나누는값은 처음에 50000 나누기 5 나누기 2
		counts[i] = money / a;
		money = money - a * ( money / a);
		
		counts[i+1] = money / (a/5);
		money = money - (a/5) * ( money / (a/5));
		
	    a = a / 10;
		}
		
	
		System.out.println(Arrays.toString(counts));
		
		
			
//사람 이름을 입력받음
//입력 글자 중 q를 입력하면 입력 종료
//사람 이름들을 문자열 배열 만들어서
//프로그램 종료직전 확인
		
		
		
	
		String[] arr = new String[2];
		
		for(int i = 0; ; i++) {
			System.out.print("이름을 입력하세요>");
			arr[i] = scanner.nextLine();
			
			if(arr[i] == "q") {
				System.out.println("종료");
				break;
				
				int[] arr2 = new int[arr.length * 2];	
				int[] result = Arrays.copyOf(arr, arr.length);
			
				
			}
		}
		
		
	}
}
