package student_simple;

public class Student {
	int num;
	String name;
	int kor;
	int math;
	int eng;
	
//	public Student(int num, String name, int kor, int math, int eng) {
//		super();
//		this.num = num;
//		this.name = name;
//		this.kor = kor;
//		this.math = math;
//		this.eng = eng;	
	
	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + ", kor=" + kor + ", math=" + math + ", eng=" + eng + "]";
	}

}


