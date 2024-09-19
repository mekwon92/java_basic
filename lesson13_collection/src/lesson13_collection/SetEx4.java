package lesson13_collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx4 {
	public static void main(String[] args) {
		//내림차순..익명클래스를 이용... 
		Set<Integer> set = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
			
		});
		//람다식
		//<Integer> set = new TreeSet<Integer>((i1, i2)->{return i2-i1;});
		//<Integer> set = new TreeSet<Integer>((i1, i2)->i2 - i1);
		
		set.add(100);
		set.add(99);
		set.add(7);
		set.add(13);
		set.add(15);
		
		System.out.println(set);
	
		Set<String> set2 = new TreeSet<>();
		set2.add("홍길동");
		set2.add("고길똥");
		set2.add("새길똥");
		set2.add("개길똥");

		System.out.println(set2);

		Set<Object> set3 = new TreeSet<>();
		set3.add("홍길동");
		set3.add("고길똥");
		set3.add("새길똥");
		set3.add("개길똥");
	//  set3.add(1); //입력시 대소비교 불가능 타입이다름

	  //System.out.println(set3);
		
		//treeSet에 저장되기 위해서는!
		//1. Comparable 인터페이스를 구현한 객체(대소비교가능. String, Integer은 원래있음?!)
		//2. 혹인 Comparator를 별도로 지정
		
		//2.comparator 지정
		Set<Member> members = new TreeSet<>(new Comparator<Member>() {

			@Override
			public int compare(Member o1, Member o2) {
				// TODO Auto-generated method stub
				return o1.age-o2.age;
			}
			
		});
		
		members.add(new Member("홍길동", 40));
		members.add(new Member("홍길동", 30));
		members.add(new Member("홍길동", 20));
		members.add(new Member("홍길동", 35));
		
		System.out.println(members);
		
		//1.comparable 인터페이스 구현.. SetEx2로 가서 implements랑 override
		
		members = new TreeSet<Member>();
	//  람다식	
	//  members = new TreeSet<>((o1, o2) -> o1.name.compareTo(o2.name));
		
		members.add(new Member("홍길동", 40));
		members.add(new Member("고길동", 40));
		members.add(new Member("김길동", 40));
		members.add(new Member("새길동", 40));
		
		System.out.println(members);
		
		

	}
}
