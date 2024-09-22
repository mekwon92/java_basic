package lesson15_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.ObjLongConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaEx2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(30, 10, 20, 30, 40));
		list.forEach(i->System.out.println(i)); //list순회
		list.removeIf(i->i <= 20);
		System.out.println(list);
		list.replaceAll(s -> s+10);//unaryoperator 단일계산
		System.out.println(list);
		
		DoubleConsumer dc = d -> System.out.println(d * d); //제네릭없고 double로 고정
		dc.accept(10);
		
		ObjLongConsumer<String> olc = (s, l) -> System.out.println("문자열 : " + s + ", long :" + l);
		olc.accept("새똥이", 12L);
		
		List<String> list2 = Stream.of(5,4,3,5,4,1).map(s->s+"").distinct().collect(Collectors.toList()); //중복을 없앤 string list
		System.out.println(list2);
	}
}
