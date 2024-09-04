package lesson06_array;
//new에는 주소값을 새로 할당...... new string엔 참조자료의 주소값이 복사됨......
public class Ref2 {
	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = "ABCD";
		String str3 = new String("ABCD");
		
		System.out.println(str1); //0x300
		System.out.println(str2); //0x300
		System.out.println(str3); //0x400
		
		System.out.println(str1.charAt(2));
		System.out.println(str2.charAt(2));
		System.out.println(str3.charAt(2));
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
System.out.println();
		
		
		System.out.println(str1.equals(str2)); //문자열비교는 이걸로 하자!
		System.out.println(str1.equals(str3));
		

System.out.println();
				
	
		System.out.println(str1 == str3.intern()); //본질값
		
System.out.println();
				


	
	
	
	
	
	}
}
