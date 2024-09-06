package lesson07_oop;
//삽입정렬
import java.util.Arrays;


public class Insertion {
	public static void main(String[] args) {
	//	int[] arr = {4,3,2,1};

		/*
		 * 	  {4,3,2,1}
		 * 1. {3,4,2,1} 1~0
		 * 2. {3,2,4,1} 
		 * 3. {2,3,4,1} 2~0
		 *     1 2 3 4
		 * 				3~0
		 * if(arr[0]>arr[1])*/
		
		/*for(int i = 1; i < arr.length - 1; i++) {
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
		*/
		// -조건 검수 후 해당 위치에 삽입 예정
		// -해당위치에서부터 한칸씩 우측이동
		// -예정 위치에 해당값 대입
		
		int[] arr = {3,5,4,1,2};
		/*3번 인덱스의 값을 맨 앞으로 보내기
		 * {3,5,4,1,2}
		 * {3,5,1,4,2}
		 * {3,1,5,4,2}
		 * {1,3,5,4,2}
		 * 	
			if(arr[3] < arr[2]) { 
				int tmp = arr[3];
				arr[3] = arr[2];
				arr[2] = tmp;
			}
		
			if(arr[2] < arr[1]) { 
				int tmp = arr[2];
				arr[2] = arr[1];
				arr[1] = tmp;
			}
			if(arr[1] < arr[0]) {
				int tmp = arr[1];
				arr[1] = arr[0];
				arr[0] = tmp;
			}
			*/
		for(int j = 1; j < arr.length ; j++) {
				System.out.println(j+"회차");
			for(int i = j ; i > 0 ; i--) {
				if(arr[i]<arr[i-1]){
					int tmp = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = tmp;
				}
				System.out.println(Arrays.toString(arr));
			}
		}
	}
}
	
