package lesson07_oop;

import java.util.Arrays;

public class Selection {
	public static void main(String[] args) {
		int[] arr = {6,5,4,3,2,1};
		
		//654321
		
		//1. 0번인덱스부터 끝까지 한번 훑어서 최소값을 찾아낸다.(1 찾음)
		//2. 최소값을 0번 인덱스와 바꾼다.
		//3. 1번인덱스부터 끝까지 훑어서 최소값을 찾아낸다. (2 찾음)
		//4. 그 최소값을 1번 인덱스와 바꾼다.
		
		
		//회차반복문
		int min = arr[0];
		int idx = 0;
		//최소값찾기 반복문 내부
		for(int i = 0; i <arr.length-1 ; i++) {

			for(int j = 1; j < arr.length ; j++) {				
				if(min > arr[j]) {
					min = arr[j];
					idx = j;
					}
			}
			int tmp = arr[idx];
			arr[idx] = arr[i];
			arr[i] = tmp;
				System.out.println(Arrays.toString(arr));

			
	}
			
			
			

				
			
				
		// - 최소값이 존재하는 인덱스
		
		// - 0번째 위치의 값이 위 인덱스에 있던 값과 교환
		
		
	}
}
