package lesson12_api;
//학생예제 참고
//
//import student.Student;
//
//public class CloneEx {
//	Student s1 = new Student(1, "새똥이", 90, 80, 90);
//	//복제의 방법
//	//1. clone override
//	//(접근제어, 타입 , 예외, Cloneable 인터페이스)
//	//protected..오버라이드도 하고 형변환도하고 예외처리도해야됨;;;;
//	//Student s2 = s1.clone();//
//	
//	//하나씩해결.......ㅠㅠ
//	Student s2 = s1.clone();
//	Student s3 = s1.clone();
//	s1.setName("개똥이");
//	System.out.println(s1);
//	System.out.println(s2);		
//
//	//해쉬코드랑 사용해서 중복제거하기좋음
//	Student s4 = new Student(s1);
//	Student s5 = s1;
//	
//	System.out.println(s1 == s5);
//	System.out.println(s1.equals(s5));
//	System.out.println(s1 == s4);
//	System.out.println(s1.equals(s4));
//}
