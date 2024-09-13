package lesson12_api;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("b[a-z]*");
		Matcher m;
		
		m = pattern.matcher("bat");
		System.out.println("bat = " + m.matches());

		m = pattern.matcher("cat");
		System.out.println("bat = " + m.matches());
		
		m = pattern.matcher("bed");
		System.out.println("bed = " + m.matches());
		
		
	
		//더 짧게. 문자열클래스에서 정규형을 쓰는방법
		System.out.println("bat".matches("b[a-z]*"));
		
		
		
		//컬렉션 맛보기
		int[] arr = new int[5];
		arr[0] = 1;
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		System.out.println(list.get(1));
		System.out.println(list.size());
	}

}
