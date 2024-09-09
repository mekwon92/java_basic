package day2;
	//final : 클래스, 메서드, 필드에 위치 가능함..붙이는게 좋음. 마지막이라는 뜻
	//클래스 : 더이상 해당클래스를 상속할 수 없습니다.. 그 자체로 완벽하니까요.. 예) string 클래스
	//메서드 : 오버라이드(재정의)를 금지하겠습니다.
	//변수 : 다른 값으로 대입하지마세요.
public class SingletonTest {
	final int i;
	public SingletonTest(int i) {
		this.i = i;//뭔말
	}
	public static void main(String[] args) {
	
	
		
	//불가능 Singleton singleton = new SingletonTest();
	Singleton s1 = Singleton.getInstance(); //new는 못하겠지?
	Singleton s2 = Singleton.getInstance(); 
	Singleton s3 = Singleton.getInstance(); 
	
	System.out.println(s1);
	System.out.println(s1);
	System.out.println(s1); //다 같은 주소
	
	// 회원
	// 책
	// 구매(관계)
	
	}
}
