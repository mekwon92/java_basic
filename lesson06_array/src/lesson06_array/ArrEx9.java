package lesson06_array;
//배열복사하기 (배열의 길이 늘리기)
import java.util.Arrays;

public class ArrEx9 {
	public static void main(String[] args) { //진입. 외부의 매개변수 값을 문자열의 형태로 가져오겠다.
											//String[] args = new String[0]; 과 같음. 공간 자체가 없음
		System.out.println("첫번째 값 : " + args[0]);
		System.out.println("첫번째 값 : " + args[1]);

		//객체 : object 변수. (단, 기본타입이 아님) 참조형 타입의 변수 
		//객체는 멤버(.)가 있다
		String str = "abcd";
		
//배열복사방법1		
		int[] arr = {1, 2, 3, 4};
		int[] arr2 = new int[arr.length * 2];
		System.out.println(arr);
		System.out.println(arr2);

		for (int i = 0 ; i<arr.length ; i++) {
			arr2[i] = arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	
		arr = arr2;
		
		System.out.println(Arrays.toString(arr));
	
	
	
		System.out.println(arr);
		System.out.println(arr2);
	
	
	
	
	}
}
