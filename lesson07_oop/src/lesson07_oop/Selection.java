package lesson07_oop;

import java.util.Arrays;

public class Selection {
	public static void main(String[] args) {
		int[] arr = {5,1,2,0,3,4,6};
		int min = arr[0];
		int idx = 0;
		//회차반복문
		//최소값 에 0번인 
		for(int i = 0; i < arr.length ; i++) {	
		//최소값찾기 반복문 내부
			for(int j = 0; j < arr.length ; j++) {				
				if(min > arr[j]) {
					min = arr[]
				}	
			}
		}
		System.out.println(idx);
		System.out.println(min);
		System.out.println(Arrays.toString(arr));
		// - 최소값이 존재하는 인덱스
		
		// - 0번째 위치의 값이 위 인덱스에 있던 값과 교환
		
		
	}
}
