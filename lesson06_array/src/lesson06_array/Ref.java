package lesson06_array;

public class Ref {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] arr2 = arr; // arr의 배열값을 가져옴
		
		arr[0] = 10;
		System.out.println(arr2[0]);
		arr = null; //주소를 끊어버리는 역할
		arr2 = null;//주소(0x100)에 들어있는건 garbage. 더이상 복구 불가능함(JVM이 특정 주기마다 반납함)
		
		
		
		//
		int a = 10;
		int b = a;
		
		a = 20;
		System.out.println(b);
		
		//8진수 - 0을 붙임
		System.out.println(022);
		//16진수 - 0x를 붙임
		System.out.println(0x22);
	}

}
