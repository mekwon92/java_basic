package lesson13_collection;

import java.util.HashSet;
import java.util.Objects;//object를 관리
import java.util.Set;

public class SetEx2 {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<Object>();
		set.add("가");
		set.add("가"); // add false
		Member member = new Member("홍길동", 40);
		set.add(member);
		set.add(new Member("홍길동", 40));
		System.out.println(set);
		System.out.println("홍길동".hashCode());
		System.out.println(new String("홍길동").hashCode());
	}
}


class Member implements Comparable<Member>{
	String name;
	int age;
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//hashCode와 equals를 통해 위의 두 값을 동일하게 취급(중복제거)
	@Override
	public int hashCode() {
		//return name.hashCode()+age;
		return Objects.hash(name,age); // 더 안전한 방법
		
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Member)) {
			return false;
		}
		Member member = (Member)obj;
		return name.equals(member.name) &&age == member.age;
	}
		
	//name 내림차순으로..
	@Override
	public int compareTo(Member o) {
		return -name.compareTo(o.name);
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
}

