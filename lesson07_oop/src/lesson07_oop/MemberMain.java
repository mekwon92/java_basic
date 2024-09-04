package lesson07_oop;

public class MemberMain {
	Member member = new Member();
	int a = 10;
	
	public static void main(String[] args) {
		Member m = new Member(); //제품생성 . 클래스의 인스턴스
		m.age = 10;
		m.kor = 90;
		m.eng = 60;
		m.mat = 80;
		
		System.out.println(m.kor + m.eng + m.mat);
		System.out.println(m.total());
		
		
		Member m2 = new Member();
		m2.kor = 80;
		m2.eng = 100;
		m2.mat = 90;
		System.out.println(m2.total());
		
	/* Member m = new Member();
	 * new 는 인스턴스를 생성하는 연산자 ...... 해당 주소가 저장
	 * 인스턴스로 객체가 만들어짐 그 자료형이 Member
	 * 
	 * 클래스, 인터페이스, 배열 타입
	 * 객체(변수)
	 * =
	 * new Member() : 인스턴스
		*/
		
		Member m3 = m;
		
		
		
		if(m ==m2) {
			System.out.println("m, m2는 같은 객체");
		}
		else {
			System.out.println("m, m2는 다른 객체");
		}
		

		if(m ==m3) {
			System.out.println("m, m3는 같은 객체");
		}
		else {
			System.out.println("m, m3는 다른 객체");
		}
		
		MemberMain mm = new MemberMain();
	
	}
}
