package lesson13_collection;

import java.util.Iterator;
import java.util.TreeSet;

public class NewLotto {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		while(set.size() < 6) {
			set.add((int)(Math.random() * 45) +1);
		}
		System.out.println(set);
		
		//set자료구조에 대한 개별탐색(get이 없응께_
		//1. 향상 for
		for(Integer i : set) {
			System.out.println(i - 1);
		}
		//2. iterator로 변경
		Iterator<Integer> iter = set.iterator();
//		iter.next();//커서를옮겨간다?
//		iter.hasNext();//갖고있니?다음게있니?.. boolean
		while(iter.hasNext()) {//다음주소를 갖고있니?
			System.out.println(iter.next() - 1);
		}
		
	}
}
