package lesson06_array;
//향상된 for문 

//for(타입변수 : 배열)
//1. 인덱스에 접근 못함.
//2. 읽기전용
//3. 값을 덮어쓸 수 없음 원래 배열값 변화 불가능..지역변수로는 가능..?

import java.util.Arrays;

public class Enhanced {
	public static void main(String[] args) {
		int[] arr = {10, 15, 5, 20, 30};
		
		//기존의 for
		for (int i = 0;  i< arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		// 향상된 for
		for(int num : arr) {
			num = 100; //바꿔도 원래값은 변하지 않음
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		String[] strs = {"더조은", "아카데미", "자바", "데이터베이스"};
		
		for(String s : strs) {
			System.out.println(s);
		}
		
	
	
	
	
	
	
	
	}
}
