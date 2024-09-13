package lesson12_api;

import java.util.Arrays;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class ArraysEx {
	public static void main(String[] args) {
		String[] arr = {"홍길동", "이순신", "강감찬", "김유신"};
		Arrays.sort(arr); //오름차순
		Arrays.sort(arr, (o1, o2) -> -o1.compareTo(o2)); //람다식을 활용해 내림차순
	//	BiFunction<String, String, Integer> bi = (o1, o2) -> -o1.compareTo(o2);
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = new int[10];
		Arrays.fill(arr2, 5);
		System.out.println(Arrays.toString(arr2)); // "s"가 붙으면 전역변수를 도와준다? objects, collections
		int[] arr3 = IntStream.rangeClosed(1, 100).limit(5).toArray(); //몰?루
		System.out.println(Arrays.toString(arr3));
		
	}
}
