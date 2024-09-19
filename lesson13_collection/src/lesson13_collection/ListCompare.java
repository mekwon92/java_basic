package lesson13_collection;
//순차는 arraylist 비순차는 linkedlist를 사용
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCompare {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		List<Integer> link = new LinkedList<Integer>();
		
		System.out.println("incre");
		incre(arr);
		incre(link);
		
//		System.out.println("access");
//		access(arr);
//		access(link);
//		
//		System.out.println("incre2");
//		incre2(arr);
//		incre2(link);
//		
//		//비순차삭제
//		System.out.println("remove");
//		remove(arr);
//		remove(link);
//		
		//순차삭제
		System.out.println("remove2");
		remove2(arr);
		remove2(link);
		
		
	}
	static void incre(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 1_000_000; i++) {
			list.add(i);
		}
		System.out.println(list.getClass().getSimpleName() + " :: " + (System.currentTimeMillis() - start + "ms"));
	}
	
	static void incre2(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10_000; i++) {
			list.add(0,i);
		}
		System.out.println(list.getClass().getSimpleName() + " :: " + (System.currentTimeMillis() - start + "ms"));
	}

	static void access(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10_000; i++) {
			list.get(i);
		}
		System.out.println(list.getClass().getSimpleName() + " :: " + (System.currentTimeMillis() - start + "ms"));
	}
	static void remove(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10_000; i++) {
			list.remove(0);
		}
		System.out.println(list.getClass().getSimpleName() + " :: " + (System.currentTimeMillis() - start + "ms"));
	}
	static void remove2(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i = 1_000_000; i >0 ; i--) {
			list.remove(i-1);
		}
		System.out.println(list.getClass().getSimpleName() + " :: " + (System.currentTimeMillis() - start + "ms"));
	}
	
	

}
