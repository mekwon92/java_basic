package day2.ex2;
// 오버라이드는 instance에서만 가능
// bind: 관계 형성, 어떤 객체가 특정 멤버를 호출 시 대상을 지정 . 구속을 언제 할 것인가?
// 정적(static) 바인드 : 컴파일 시 지정, 오버라이딩 불가능
// 
// 동적(dynamic) 바인드 : 런타임 시 지정, 메서드 오버라이딩..

public class OverEx {
	public static void main(String[] args) {
		A obj = new B();
		System.out.println(obj.i); //정적 바인드
		obj.m(); //동적 바인드
		System.out.println(obj.si); //좋지않음
		obj.sm();
	}

}
class A{
	static int si = 1;
	int i = 2;
	static void sm() {
		System.out.println("A.sm()");
	}
	void m() {
		System.out.println("A.m()");
	}
	
}

class B extends A{
	static int si = 3;
	int i = 4;
	static void sm() {
		System.out.println("B.sm()");
	}
	void m() {
		System.out.println("B.m()");
	}
	
}
