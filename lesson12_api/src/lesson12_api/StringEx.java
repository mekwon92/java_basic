package lesson12_api;

import java.util.Arrays;

public class StringEx {
	public static void main(String[] args) {
		String str = "abcdeabcde";
		System.out.println(str.charAt(3)); //d
	//	System.out.println(str.charAt(-1));
	//	System.out.println(str.charAt(100));
		
		System.out.println(str.equals(new String("abcdeabcde"))); //true
		
		System.out.println(str.indexOf("b")); //1
		System.out.println(str.indexOf("b",3)); //6  3번인덱스부터 -> 방향으로
		System.out.println(str.lastIndexOf("b"));// 6
		System.out.println(str.lastIndexOf("b",3)); // 1 3번인덱스부터 <- 방향으로
		
		System.out.println(str.indexOf("cdea")); //c를 기준으로. 없으면 -1출력함

		//substring
		System.out.println(str.substring(3));
		System.out.println(str.substring(3,7));
		
	//첫번째 만나는 c 문자열에서 마지막 만나는 d 문자열까지 문자열 자르기
		System.out.println(str.substring(str.indexOf("c"), str.lastIndexOf("d")));
		
		System.out.println(str.toUpperCase().toLowerCase());
		
		String s = "         [  안녕하세요       ]     ";
		System.out.println(s.trim()); //중간공백은 안없어짐
		System.out.println(s.trim().replaceAll(" ", "")); // 첫,끝공백도 없어짐
		
		System.out.println(str.endsWith("de")); //true
		System.out.println(str.endsWith("cd")); //false
	
		System.out.println(str.replace("a", "f")); // fbcdefbcde 다 바꿔줌
		System.out.println(str.replaceFirst("a", "f")); // fbcdeabcde 처음 만나는거만 바꿔줌
		
		System.out.println(Arrays.toString(str.split(""))); // a,b,c,d,e,a,b,c,d,e
		System.out.println(Arrays.toString(str.split("b"))); // a,cdea,cde
		
	
	//compareTo 정렬할때쓰임(앞의 수가 오름차수의 위이면 음수 반환
		System.out.println("abc".compareTo("abc")); // 0
		System.out.println("abc".compareTo("abb")); // 1
		System.out.println("abc".compareTo("abd")); // -1
		System.out.println("abc".compareTo("abe")); // -2
		System.out.println("abc".compareTo("acc")); // -1
		System.out.println("abc".compareTo("acd")); // -1
		System.out.println("abc".compareTo("a가e")); // -43934
	}
}
