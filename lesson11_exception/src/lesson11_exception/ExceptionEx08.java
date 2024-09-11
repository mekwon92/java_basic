package lesson11_exception;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ExceptionEx08 {
	public static void main(String[] args){
		System.out.println(Arrays.toString("가".getBytes()));
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("1. txt");
			byte[] bs = {'A', 'B', 'C', 'D', 'E', 234-256, 176-256, 128-256};
			fos.write(bs);			
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fos.close(); // 부하가 큰 객체는 close를 선언해줘야함		
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	//복사와 복제
		int[] arr = {1,2,3,4,5};
		int[] arr2 = arr;
		int[] arr3 = arr.clone(); //또다른 객체를 생성하여 값 전달
		
		arr[0] = 10; //arr2만 바뀜
	}
}
