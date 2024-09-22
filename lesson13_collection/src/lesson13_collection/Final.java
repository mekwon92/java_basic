package lesson13_collection;
//배열과 리스트 간의 변환, collections
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Final {
	public static void main(String[] args) {
		//Arrays, Collections, Objects
		List<Integer> list = Arrays.asList(1,2,3,4); //길이늘리는거안됨
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4)); 
		System.out.println(list.get(2));
		list2.add(10);
		System.out.println(list);
		System.out.println(list2);
		
		Integer[] arr = {1,2,3,4,5,6,7};
		list = Arrays.asList(arr);
		System.out.println(list);
		
		list.toArray(arr);
		System.out.println(Arrays.toString(arr));
		
		Collections.shuffle(list);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
	}
}
