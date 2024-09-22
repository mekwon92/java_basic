package lesson16_stream;
//랜덤의 진화?!
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStream {
	public static void main(String[] args) {
		IntStream is = IntStream.rangeClosed(1, 5);
		is.forEach(System.out::println);

//		List<Integer> list = IntStream.rangeClosed(1, 45).mapToObj(s -> s).collect(Collectors.toList());//int를 integer로?
		List<Integer> list = IntStream.rangeClosed(1, 45).boxed().collect(Collectors.toList());//래퍼클래스로 변환
		Collections.shuffle(list);
		System.out.println(list.subList(0, 6));
		
		LongStream ls = new Random().longs(6, 1, 46).sorted();
		ls.forEach(System.out::println);
//		ls.forEach(l -> System.out.println(l));이 생략된 것.		

		is = "가나다라ABCD".chars();
		is.forEach(s->System.out.println((char)s)); //형
	
		
//정적메서드참조, 인스턴스메서드참조, 매개변수 메서드 참조, 생성자 참조
		
//		
//		IntBinaryOperator ibo = (x,y)->Math.max(x, y);
		IntBinaryOperator ibo = Math::max; //파라미터가 중복되면 메서드 참조(::)를 할 수 있다.

//		
//		Function<String, Integer> f = s -> Integer.parseInt(s);
		Function<String, Integer> f = Integer::parseInt;
		
//		매개변수 메서드 참조
//		BinaryOperator<String> bo = (x, y) -> x.concat(y);
		BinaryOperator<String> bo = String::concat;
		
//		생성자 참조
//		Function<String, Exception> f2 = s -> new Exception(s);
		Function<String, Exception> f2 = Exception::new;
		
//		Comparator<String> com = (x,y) -> x.compareTo(y); //x,y의 순서도 같아야함
		Comparator<String> com = String::compareTo;
		
	}
}
