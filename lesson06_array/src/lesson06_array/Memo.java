package lesson06_array;

import java.util.Arrays;

public class Memo {
	public static void main(String[] args) {
		
	
	int[] arr = {10, 5, 3, 8, 4};

	System.out.println(Arrays.toString(arr));
	
	arr = new int[10];

	System.out.println(Arrays.toString(arr));
	
	
  //arr	= {1, 2, 3}; //error
	arr = new int[] {1, 2, 3};
	
	
	System.out.println(Arrays.toString(arr));
	
	}
}
