package lesson16_stream;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamOrder {
	public static void main(String[] args) {
		//스트림 생성.람다식활용을 해야함.
		
		//연산
		//1.중간연산
		//필터, 맵, 정렬, peek
		boolean result = Stream
		.of("홍길동", "김유신", "이순신", "유관순")
		.sorted(Comparator.reverseOrder())
		.filter(s->!s.startsWith("김"))
		.peek(System.out::println)
		.allMatch(s->s.startsWith("홍"));//boolean으로 받아야함. 하나라도 거짓을 발견하면 끝
		
//		.count();//long으로 받아야함
//		.forEach(System.out::println);
		System.out.println(result);
		//2.최종연산
		//forEach, count, allMatch, anyMatch
		
		String str = null;
		Optional<String> optional = Optional.of("가"); //null체크를 함..
		Optional<String> optional2 = Optional.ofNullable(str); //객체생성에는 문제없지만... 가져오는데에 문제가 생김
		System.out.println(optional);
		System.out.println(optional.get());
//		System.out.println(optional2.get()); 가져오는데에 문제가 생김
		System.out.println(optional2.isPresent()); // 값 존재 여부
		System.out.println(optional2.orElse("대체문자"));//null일때 기본값 설정
		optional2.ifPresent(System.out::println); //만약 표현되어있다면? 조건식같은.. consumer
		optional.ifPresent(System.out::println); //만약 표현되어있다면? 조건식같은.. consumer
		
	}
}
