package lesson13_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapEx {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 1);
		map.put("C", 1);
		map.put("C", 2);
		System.out.println(map);
		System.out.println(map.get("A"));
		System.out.println(map.get("A")+ 3);
		System.out.println(map.get("D"));//null
		System.out.println(map.size());
		
		//포함여부
		System.out.println(map.containsKey("D"));
		System.out.println(map.containsValue(1));
		
		//탐색 .. 인덱스가없어서 iterable이있으면 향상for문 가능..한... set으로 변경해서.....^^?
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for(Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + "::" + entry.getValue());
		}
		//key를 이용 key는 중복이 불가능 하니까~
		Set<String> keys = map.keySet();
		System.out.println(keys);
		for(String key : keys) {
			System.out.println(key + " :: " + map.get(key));
		}
		
		
		Collection<Integer> collection = map.values();
		System.out.println(collection);
		
		//list로
		List<Integer> list = new ArrayList<Integer>(collection);
		
		//set으로
		Set<Integer> set = new HashSet<Integer>(collection);
		
		System.out.println(list); //인덱스로 접근 - 중복 허용
		System.out.println(set);
		
	}
}
