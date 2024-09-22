package lesson16_stream;

import java.util.stream.Stream;

public class FilterStream {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("홍길동","김유신","홍길동","이순신","홍길동","유관순");
	
		stream
		.distinct() //중복제거(중간연산)
		.filter(s -> s.startsWith("홍")) //필터(중간연산)
		.forEach(System.out::println); //최종연산
	}
}
