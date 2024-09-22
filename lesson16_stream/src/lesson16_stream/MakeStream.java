package lesson16_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class MakeStream {
	public static void main(String[] args) {
		//배열로 스트림 만들기
		String[] strs = {"가","나","A","B"};
		Stream<String> stream = Arrays.stream(strs);
		stream.forEach(System.out::println); // :: 참조
//		stream.forEach(System.out::println); // 오류가 뜬다. 스트림은 1회성 객체 iterate도 같음. 다시 만들어야됨.
		
		stream = Arrays.stream(strs);
		System.out.println("====================");
		stream.forEach(System.out::println);
		
		//자르기
		stream = Arrays.stream(strs , 1, 3);
		System.out.println("====================");
		stream.forEach(System.out::println);
		
		//리스트로 스트림 만들기
		List<String> list = new ArrayList<String>(Arrays.asList(strs));
		stream = list.parallelStream();
		System.out.println("====================");
		stream.forEach(System.out::println);
		
		//셋으로 스트림 만들기
		stream = new HashSet<>(list).stream();
		System.out.println("====================");
		stream.forEach(System.out::println);
		
		//빌더 패턴으로 스트림 만들기
		stream = Stream.builder().add("새똥이").add("길똥이").add("소똥이").build().map(o -> o.toString()); //object로 인식하고있어서...
		System.out.println("====================");
		stream.forEach(System.out::println);
		
		//generate 사용으로 스트림 만들기
		stream = Stream.generate(()->"애국가").limit(10); //무한스트림. limit으로 길이지정필요
		System.out.println("====================");
		stream.forEach(System.out::println);
		
		//iterate 사용으로 스트림 만들기
		stream = Stream.iterate("A", s -> (char)(s.charAt(0)+1)+"").limit(26);
		System.out.println("====================");
		stream.forEach(System.out::println);
		
		//of 사용으로 스트림 만들기(간단쓰)
		stream = Stream.of("가","길동이","새똥이");
		System.out.println("====================");
		stream.forEach(System.out::println);
	}
}
