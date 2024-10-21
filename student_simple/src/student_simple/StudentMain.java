package student_simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentMain {
	public static void main(String[] args) {
		Student student = new Student();
		student.name = "권미은";
		student.num = 1234;
		student.kor = 91;
		student.math = 50;
		student.eng = 42;
		// var s = {};
		
		System.out.println(student.total());
		
		//익명함수? 다 못적엇음.....흙....;;	
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 5, 4, 3, 2, 20));
		list.sort(new MyComp());
		System.out.println(list);
		Comparator<Integer> comp = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		};
		list.sort(comp);
		System.out.println(list);
		
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		});
		System.out.println(list);
		
		
	}
}

class MyComp implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2 - o1;
	}
}
	