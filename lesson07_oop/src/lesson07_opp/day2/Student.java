package lesson07_opp.day2;

public class Student {
	int no; // 학번
	String name; // 이름
	
	Student() {} //이게없으면 기본생성자로 객체생성불가능함
	
	//생성자 이름은 클래스와 동일하며 오버로딩이 가능하다
	Student(int i, String s){
		//super(); 혹은 this();가 생략되어있음(상속) 인자호출구간
		no = i;
		name = s;
	}
	
	Student(String s, int i){
		this(s);//미래주소값을 알수있다......?!!
		//Student(s); 불가능
		no = i;
		
	}
	
	Student(String s) {
		name = s;
	}
	
	void printThis() {
		System.out.println(this);
	}
	
	Student returnThis() { //나의 인스턴스를 반환
		return this;
	}
	
	}


