package lesson12_api;

public class StringEx2 {
	public static void main(String[] args) {
		String str = "a";
		str += "b";
		String str2 = "1" + "2" + "3";
		
		//String은 불변객체라서 수정할때마다 새로운 객체가 생성됨
		// "a", "b" ,"ab" 3번 생성됨
		// "1", "2", "12" ,"3" ,"123" 

	
		// 가변객체라서 내부의 값을 바로 변경. 효율적이지만 사이드이펙트에 주의해서 사용
		// cache , hash , buffer -> 성능향상
		// StringBuffer : Thread Safe. 내부동기화 -> 멀티스레드에서 안전 but 동기화 오버헤드로 인해 성능이 느림( 예 : ArrayList )
		// StringBuilder : Thread Unsafe. 자원 쉐어의 부담이 적어 더 빠르다 ( 예 : Vector )
		//일반적으로 +연산을 사용하지만 반목문,조건문,복잡한 문자의 특정부분변경,대용량문자열 등에서 가변객체 사용
		
		// 문자열을 변경할 땐 가변객체를 사용하고 변경을 끝내고 String으로 변환하는 것이 좋다.
		StringBuffer sb = new StringBuffer("abcd"); 
		System.out.println(sb.append("e"));//abcde
		System.out.println(sb.insert(2, "k")); //abkcde
		System.out.println(sb.delete(2, 4)); //abde 이상&미만
		System.out.println(sb.reverse());//edba

		long startSTR = System.currentTimeMillis();
		for (int i = 0 ; i < 100_000 ; i++) {
			str += "0";
		}
		long endSTR = System.currentTimeMillis();
		
		long startSB = System.currentTimeMillis();
		for (int i = 0 ; i < 100_000 ; i++) {
			sb.append("0");
		}

		long endSB = System.currentTimeMillis();
		str = sb.toString();
		sb = new StringBuffer(str);
		System.out.println(str.length() + ":" + (endSTR - startSTR) + "ms String");
		System.out.println(sb.length() + ":" + (endSB - startSB) + "ms StringBuffer");

		
		//abcde 사이에 123 넣고 c를 빼자.
		String s = "abcde";
		s = s.substring(0, 3) + "123" + s.substring(3);//abc+123+de
		System.out.println(s.replace("c","")); // ab123de
		
		System.out.println(s); //abc123de 불변객체라 s 그대로 출력
		
		s = "abcde";
		sb = new StringBuffer(s); //abcde
		sb.insert(3, "123"); //abc123de
		sb.deleteCharAt(sb.indexOf("c"));//ab123de
		System.out.println(sb.toString()); //String으로 변환필요함
		
		//컴파일 시점에 리터럴은 바로 합치는데 문자열은 불가능함. 알수없으니까
		
		//StringBuilder는 메서드체이닝 제공
		String str3 = "abcde";
		String str4 = "가나다라";
		
		sb
		.append(str3)
		.append(str4)
		.insert(1, "k")
		.delete(3, 5)
		.reverse()
		.toString();
		
		System.out.println(sb);
		
	
	}
}
