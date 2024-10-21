package student_simple;

public class Student {
	int num;
	String name;
	
	{
		System.out.println(num); // 0
		num = 10;
		System.out.println(num); // 10
	}
	
	
	
	
	int total() {
		return kor+math+eng;
	}
	
	int kor;
	int math;
	int eng;
	
	
	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + ", kor=" + kor + ", math=" + math + ", eng=" + eng + "]";
	}

}


