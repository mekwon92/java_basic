package lesson4_operator;

//Integer.toBinaryString(int) : String (숫자 -> 이진법)

public class OpEx6_1 {
	public static void main(String[] args) {
	//이진법(문자열로 반환)
		
		String s1 =Integer.toBinaryString(6);
		String s2 =Integer.toBinaryString(10);
		String s3 =Integer.toBinaryString(16);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1+s2);
		System.out.println(s3);
		System.out.printf("%032d\n", Integer.parseInt(s2)); // 32칸 오른쪽정렬 & 0으로 채우기
	
	//최대 최소값
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		System.out.println(max + "," + min);
		
	//최대 최소값을 이진수로 변환
		System.out.println("0" + Integer.toBinaryString(max));
		System.out.println(Integer.toBinaryString(min));
		
	//오버플로우
		System.out.println(max+1);
	}
	//
			
}


