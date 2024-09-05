package lesson07_oop;

import java.util.Arrays;

//삽입정렬
public class Insertion {
	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		//작은 인덱스에서부터 시작(회차)
		//내가 더 작으면.... arraycopy...
		//현재 위치의 인덱스 미만의 값들과 대소비교 (반복문필요 내가 들어갈 곳의 위치..)
		/*
		 * 	  {4,3,2,1}
		 * 1. {3,4,2,1} 1~0
		 * 2. {3,2,4,1} 
		 * 3. {2,3,4,1} 2~0
		 *     1 2 3 4
		 * 				3~0
		 * if(arr[0]>arr[1])*/
		
		for(int i = 1; i < arr.length - 1; i++) {
			for(int j = i; j >= 0 ; j--) {
				if(arr[i-1]>arr[i]) {
					int tmp;
					tmp = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = tmp;	
				}
			}
			System.out.println(Arrays.toString(arr));

		}
		// -조건 검수 후 해당 위치에 삽입 예정
		// -해당위치에서부터 한칸씩 우측이동
		// -예정 위치에 해당값 대
		
		
	}
}
