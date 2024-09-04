package lesson07_oop;

public class Member {
	String name;
	String tel;
	String addr;
	int age; //이 4가지를 한 객체로 사용
	
	int kor;
	int eng;
	int mat; //필드
	
	int total() { //메서드
		return kor + eng + mat;
	}
}
