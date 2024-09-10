package sort;
//선택정렬
import java.util.Arrays;

public class Selection {
	public static void main(String[] args) {
		
		// 4321
		
		//1. 0번인덱스부터 끝까지 한번 훑어서 최소값을 찾아낸다.(1 찾음)
		//2. 최소값을 0번 인덱스와 바꾼다.
		//3. 1번인덱스부터 끝까지 훑어서 최소값을 찾아낸다. (2 찾음)
		//4. 그 최소값을 1번 인덱스와 바꾼다.
		
		
	/*	int[] arr = {4,3,2,1};
		
		//회차반복문
		for(int i = 0; i < arr.length ; i++) {//
			int min = arr[i];
			int idx = i;
			//최소값찾기 반복문 내부	
			for(int j = i; j < arr.length ; j++) {//
				
				if(min  > arr[j]) {
					min = arr[j];
					idx = j;
				}				
			}
				System.out.println("최소값 :" + min);	
				System.out.println("최소값index :" + idx);
				int tmp = arr[idx];
				arr[idx] = arr[i];
				arr[i] = tmp;
				System.out.println(i+"회차 : " + Arrays.toString(arr));	
			}
	*/		

		//int min = arr[idx]; //min의 값자체는 필요없음~ 안쓰임..
		
		int[] arr = {5,4,2,20,1,7};
		for(int i = 0 ; i < arr.length ; i++) {
			int idx = i;
			// - 최소값이 존재하는 인덱스
			for(int j = i ; j < arr.length ; j++) {
				if(arr[idx] > arr[j]) {
					//arr[idx] = arr[j];
					idx = j;
				}
			}
			// - 0번째 위치의 값이 위 인덱스에 있던 값과 교환
			//System.out.println(idx);
			int tmp = arr[idx];
			arr[idx] = arr[i]; // {5,4,2,5,7}
			arr[i] = tmp; // {1,4,2,5,7}
			System.out.println(Arrays.toString(arr));
		}
		

		/* 문자열에서 특정 값 찾기
		String str = "12345";
		System.out.println(str.indexOf("3"));
		System.out.println(str.indexOf('3'));
		
		char[] cs = str.toCharArray();
		
		int idx = -1; //탐색시 못찾으면 -1이 기본값이라서~ 배열은 인덱스에 -1 안됨
		for (int i = 0 ; i < cs.length; i++) {
			if(cs[i] == '3') {
				idx = i; 
				break;
				}		
			}
			System.out.println(idx); */

	
	}
}
