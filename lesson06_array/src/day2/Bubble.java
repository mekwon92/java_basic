package day2;
//선택정렬도 해보기~!!
import java.util.Arrays;

public class Bubble {
	public static void main(String[] args) {
		// 오름차순정렬(작은수~큰수)
		// 버블정렬
		int[] arr = {1,2,3,4,5,6,7};
		
		System.out.println("초기 :: " + Arrays.toString(arr));
		//회차반복
		for(int i = 0; i < arr.length - 1 ; i++) {
			//비교반복
			for(int j = 0; j < arr.length - 1 - i ; j++) { // 0,1,2,3
				//값 비교 후 자리 교환
				if(arr[j] < arr[j+1]) {
					int tmp;
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;	
				}	
			}
			System.out.println(i + 1 + "회차:: " +Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	}
}
