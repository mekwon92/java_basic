package lesson06_array;

import java.util.Arrays;

public class Info {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int[] arr2 = new int[2];
		int[] arr3;
		arr3 = new int[]{1,2,3,4,5};
		arr3 = new int[10];
		
		int[] arr4 = new int[5]; //길이를 통한 초기화
		int[] arr5 = null; // null로 초기화
		
		int[] arr6 = new int[0];
		
		
		System.out.println(Arrays.toString(arr)); // [1,2,3,4,5]
		System.out.println(Arrays.toString(arr2));// [0,0]
		System.out.println(Arrays.toString(arr3));// [0,0,0,0,0,0,0,0,0,0]
		System.out.println(Arrays.toString(arr4));// [0,0,0,0,0]
		System.out.println(Arrays.toString(arr5));// null
		System.out.println(Arrays.toString(arr6));// []

		
		
		//배열 : 하나의 변수로 여러 데이터를 저장
		//타입[] 변수명;
		double[] arrd;
		double[] arrd2 = null;
		String[] strings;
		
		String str= null;
		System.out.println(str); //null
		
	//	System.out.println(Arrays.toString(arrd)); 실행불가(null)
		System.out.println(Arrays.toString(arrd2)); //null

		
		//순번(index)로 접근	
		// arr[0] arr[1] arr[2] arr[3] arr[4]
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
		arr[0] = 10;
		arr[1] = 20;
		
		for(int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
	

		//배열의 선언 
		//1.길이를 통한 초기화
		//2.값을 통한 초기화
	
		String[] strs = {"홍길동", "이순신", "김유신"};
//		
//		System.out.println(strs[0]);
//		System.out.println(strs[1]);
//		System.out.println(strs[2]);
//		
		for(int i = 0; i < strs.length; i++) { //디폴트형태
			System.out.println(strs[i]);
		}
		
		
		
		
		
	
	
	}
}
