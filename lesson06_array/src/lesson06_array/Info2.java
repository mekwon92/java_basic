package lesson06_array;
import java.util.Arrays;

	//배열은 길이를 못바꿈. 바꾸고 싶으면 덮어써야함~ 기존내용은 삭제됨!
	public class Info2 {
		public static void main(String[] args) {
					 //∇ 이 사이에 new int[]가 생략된것임!
			int[] arr = {10, 5, 3, 8, 4};
			arr = new int[10];
			
		  //arr	= {1, 2, 3}; //error
			arr = new int[]{1, 2, 3};
			
			
			System.out.println(arr.length); //int형으로 결과가 나옴
			
			
			char[] cArr = {'A', 'B', '가', '나'};
			String[] strArr = {"가나", "다라"}; 
			System.out.println(arr);
			System.out.println(cArr); // 문자는 그대로 나오는데 arr, strArr은 뭔가??!!!! 주소값임~! 문자배열의 특수성~
			System.out.println(strArr);
			
			
			//배열 내부의 값을 간편하게 확인하는 함수 : Arrays.toString(배열)
			System.out.println(Arrays.toString(arr));
			System.out.println(Arrays.toString(cArr));
			System.out.println(Arrays.toString(strArr));
			
	
		}
	}


