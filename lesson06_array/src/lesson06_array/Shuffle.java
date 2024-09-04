package lesson06_array;

import java.util.Arrays;

/* 변수의 값 교환
int a = 10;
int b = 20;

int tmp = a; 
a = b; 
b = tmp;
*/

public class Shuffle {
	public static void main(String[] args) {
		
		int[] arr = new int[45];
		
		//내부값 초기화
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = i+1;
		}
		System.out.println(Arrays.toString(arr));
		
		//교환작업	
		for(int i = 0; i<arr.length ; i++) {
			int rand = (int)(Math.random() * arr.length);
			int tmp = arr[i];
			arr[i] = arr[rand];
			arr[rand] = tmp;
		}
		
		//6개만 가져오기
		int[] lotto = new int[6];
		for(int i = 0; i < lotto.length ; i++) {
			lotto[i] = arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(lotto));
		
		
		
		
		
	}
}
