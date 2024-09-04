package lesson06_array;

public class Info {
	public static void main(String[] args) {
		//배열 : 하나의 변수로 여러 데이터를 저장
		//타입[] 변수명;
		double[] arr3;
		String[] strings;
		
		// String str= null;
		
		
		int[] arr = new int[5]; //길이를 통한 초기화
		int[] arr2 = null; // null로 초기화
		
		System.out.println(arr2);
		
		int[] arr4;
		arr4 = new int[5]; //이런식으로도 가능
		
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
