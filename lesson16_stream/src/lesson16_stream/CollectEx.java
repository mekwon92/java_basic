package lesson16_stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectEx {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1,2,3,4,2,3,4,2,3,4,2,3,5);
		//타입바꾸려면 map이 필요..
		List<String> list =
		stream
		.distinct()
		.sorted((a,b) -> b - a)//인티저는 직접만드는거도 편함
		.map(i -> i.toString() + i) // 타입변경(i+"") + i
		.collect(Collectors.toList());// 리스트로변환
//		.forEach(System.out::println);
		
		System.out.println(list);
		
		Stream
		.concat(list.stream(), list.stream()) //스트림 다시못쓰니까 list로 뽑
		.forEach(System.out::println);
		
		
	}
}
