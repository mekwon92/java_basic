package lesson06_array.day2;

import java.util.Arrays;


public class ArrayCopy {
	public static void main(String[] args) {
		
		int[] src = {1, 2, 3, 4};
		int[] dest = new int[src.length * 2];
		
		
/*arraycopy는 길이를 미리 배정해야함		
		System.arraycopy(src, 1, dest, 2, src.length); //(원본배열, 시작위치, 복사대상배열, 시작위치, 몇개)
	//위치에 주의해야함 원본배열이랑 복사배열 시작위치
		System.out.println(Arrays.toString(dest));*/
		
		
//arrays.copyof는 길이를 미리 배정하지 않아도 생성
		int[] result = Arrays.copyOf(src, 10);
		System.out.println(Arrays.toString(result));
	}
}
