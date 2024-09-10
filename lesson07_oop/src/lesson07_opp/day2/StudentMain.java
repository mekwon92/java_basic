package lesson07_opp.day2;

public class StudentMain {
	public static void main(String[] args) {
		
		Student s = new Student(); //생성하지않으면 기본값 배정됨 0,null
		Student s2 = new Student(10, "길동이");
		
		
		System.out.println(s.no); //0
		System.out.println(s.name); //null

		System.out.println(s2.no);
		System.out.println(s2.name);
		
		Student s3 = new Student("소똥이",10);
		
		System.out.println(s); //패키지명.클래스명@해시값(구별값-실행할때배정)
		System.out.println(s2);
		System.out.println(s3);
		
		s.printThis(); 
		s2.printThis();
		s3.printThis();
		
		s.returnThis().returnThis().returnThis();
	}
}
