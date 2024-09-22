package lesson12_api;

import java.util.Arrays;

public class StringEx {
	public static void main(String[] args) {
		String str = "abcdeabcde";
		System.out.println(str.charAt(3)); //d
	//	System.out.println(str.charAt(-1));
	//	System.out.println(str.charAt(100));
		
		System.out.println(str.equals(new String("abcdeabcde"))); //true
		System.out.println("   ".isEmpty()); //false 비어있는지
		System.out.println("   ".isBlank()); //true 비어있거나 공백만 있을 때
		
		System.out.println(str.contains("cde"));//true
		System.out.println(str.indexOf("b")); //1
		System.out.println(str.indexOf("b",3)); //6  3번인덱스부터 -> 방향으로
		System.out.println(str.lastIndexOf("b"));// 6
		System.out.println(str.lastIndexOf("b",3)); // 1 3번인덱스부터 <- 방향으로
		System.out.println(str.indexOf("cdea")); //c를 기준으로. 없으면 -1출력함

		//substring
		System.out.println(str.substring(3)); // deabcde
		System.out.println(str.substring(3,7)); // deab
		
		//첫번째 만나는 c 문자열에서 마지막 만나는 d 문자열까지 문자열 자르기
		System.out.println(str.substring(str.indexOf("c"), str.lastIndexOf("d")));
		
		//대소문자 변경
		System.out.println(str.toUpperCase().toLowerCase());
		
		//공백처리
		String s = "         [  안녕하세요       ]     ";
		System.out.println(s.trim()); //중간공백은 안없어짐
		System.out.println(s.trim().replaceAll(" ", "")); // 첫,끝공백도 없어짐
		System.out.println(s.strip());//유니코드 공백도 제거
		System.out.println(s.stripLeading());//앞공백만 제거
		System.out.println(s.stripTrailing());//뒷공백만 제거
		
		//해당문자열로 시작하거나 끝나는가
		System.out.println(str.startsWith("ab")); //true
		System.out.println(str.endsWith("cd")); //false
		
		//변경
		System.out.println(str.replace("a", "f")); // fbcdefbcde 다 바꿔줌
		System.out.println(str.replaceFirst("a", "f")); // fbcdeabcde 처음 만나는거만 바꿔줌
		
		//분할
		System.out.println(Arrays.toString(str.split(""))); // a,b,c,d,e,a,b,c,d,e
		System.out.println(Arrays.toString(str.split("b"))); // a,cdea,cde
		String[] strArr = str.split("");
		
		//조합
		System.out.println(String.join("-","A","B","C")); //A-B-C
		System.out.println(String.join("-",strArr)); //a-b-c-d-e-a-b-c-d-e
		
		
		//compareTo 정렬할때쓰임(앞의 수가 앞이면 음수 반환 사전순
		System.out.println("abc".compareTo("abc")); // 0
		System.out.println("abc".compareTo("abb")); // 1
		System.out.println("abc".compareTo("abd")); // -1
	
		//toCharArray
		char[] charArr = str.toCharArray();
		for(char c : charArr) {
			System.out.println(c);
			
		//format는 형식과 인자를 통해 새로운 문자열 생성
		//matches 정규표현식과 일치하는지 확인
		}
	}
}
