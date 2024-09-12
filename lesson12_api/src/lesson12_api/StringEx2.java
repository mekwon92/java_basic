package lesson12_api;

public class StringEx2 {
	public static void main(String[] args) {
		String str = "a";
		str += "b";
		String str2 = "1" + "2" + "3";
		
		// "a", "b", "ab", "1", "2", "12" ,"3" ,"123" 생성된 포인터

	
//		str = "";//문자열마다 배열처럼 처리되어서 느림
		StringBuffer sb = new StringBuffer("abcd"); //cache , hash , buffer -> 성능향상
		sb.append("e");

		long start = System.currentTimeMillis();
		for (int i = 0 ; i < 1_000_000 ; i++) {
		//	str += "0";
			sb.append("0");
		}

		long end = System.currentTimeMillis();
		str = sb.toString();
		sb = new StringBuffer(str);
//		System.out.println(str.length() + ":::" + (end - start) + "ms");
		System.out.println(sb.length() + ":::" + (end - start) + "ms");
		
		String s = "abcde"; // "abc123de"
//		s = s.substring(0, 3) + "123" + s.substring(3);
//		System.out.println(s.replace("c",""));
//		System.out.println(s);
		
		sb = new StringBuffer(s);
		sb.insert(3, "123");
		sb.deleteCharAt(sb.indexOf("c"));
		System.out.println(sb.toString());//더 편함
		
		// StringBuffer : Thread Safe ( 예 : ArrayList )
		// StringBuilder : Thread Unsafe. 자원 쉐어의 부담이 적어 더 빠르다 ( 예 : Vector )
		
	
	
	}
}
