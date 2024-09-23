package lesson18_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//객체를 통째로
public class ObjectOS {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		List<String> list = new ArrayList<String>(Arrays.asList("가","나","다"));
		List<Member> members = new ArrayList<Member>(Arrays.asList(new Member("홍길동", 40), new Member("김길동", 20)));
		System.out.println(members); //age 알고있음.
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));
//		oos.writeObject(list);
//		oos.writeObject(list);
		
		oos.writeObject(members);
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));
//		System.out.println(ois.readObject());
//		System.out.println(ois.readObject());
//		System.out.println(ois.readObject()); 불가능
		
		List<Member> result = (List<Member>) ois.readObject();
		result.forEach(System.out::println); //age 모름

	
		
	}	
}
//저장시점과 현재시점의 차이가 날 수 있다.. incompatible
//class 변수는 직렬화 대상이 아니다. instance만 대상이다.
//직렬화를 피한다..?  transient
class Member implements Serializable { //직렬화가능클래스입니다..(clonable처럼!)
	String name;
	transient int age;
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
}
//초기화가필요없다..??!!
