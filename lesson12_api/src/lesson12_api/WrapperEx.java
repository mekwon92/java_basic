package lesson12_api;

public class WrapperEx {
	public static void main(String[] args) {
		Integer i1 = 10; //boxing
		Integer i2 = new Integer(20); //boxing
		Integer i3 = new Integer("30"); //boxing
		
		System.out.println(i1 + i2 + i3); //unboxing 연산자타입을 가림
		
		Integer i4 = 20;
		System.out.println(i2 == i4); //참조형 간의 주소비교
		System.out.println(i2.equals(i4)); // 값 비교
		
		System.out.println(i2.intValue() == i4.intValue());
		
		Long l1 = 10L; //autoboxing 이 되기 위해 정확한 리터럴을 맞춰야함
		Long l2 = i1.longValue();
		
		
		Character c1 = 65;
		
	// 	문자열 > wrapper
		l2 = Long.valueOf("10"); //권유
		l2 = new Long("10"); //권유안됨
		
	//	wrapper > 문자열
		String str = l2.toString(); //l2가 null일 경우 빼고 동작
		str = l2 + "";
		
		//autoboxing 안될경우~~
	// 기본형 > wrapper
		l2 = Long.valueOf(10L);
		
	// wrapper > 기본형
		long l3 = l2.longValue();
		//~~
		
	// 기본형 > 문자열
		str = String.valueOf(l3);
	// 문자열 > 기본열
		l3 = Long.parseLong(str);
	
		double d = Double.parseDouble(str);
	
		System.out.println(Integer.parseInt("FF",16)); // FF를 16진수로 해석해서 10진수로 변환
		System.out.println(Integer.toBinaryString(255)); // 2진수로 변환
		System.out.println(Integer.toOctalString(255)); // 8진수로 변환
		System.out.println(Integer.toHexString(255)); // 16진수로 변환
		
		int i = 0xFF;
		
		char ch = 0xAC00;
		char ch2 = '\uAC00';
		
		System.out.println(ch);
		System.out.println(ch2);
		
	}

}
