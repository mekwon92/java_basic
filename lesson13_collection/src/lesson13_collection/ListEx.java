package lesson13_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx {
	public static void main(String[] args) {
		List<Integer> list =  new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(0,4);
		list.add(5);
		list.add(6);
		
		System.out.println(list);
		int sum = 0;
		for(int i = 0; i < list.size() ; i++) {
			System.out.println(i + "::" + list.get(i));
//			sum += (Integer)(list.get(i));
			sum += list.get(i);
		}
		System.out.println(sum);
	}
}
