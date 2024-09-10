package lesson08_extend.day2.ex2;
// 다형성
//
// 조상타입 객체 = new 자손생성자();
public class PolyEx {
	public static void main(String[] args) {
		
		Object o = 10; //Integer로 자동변환됨
		Object o2 = new String("abcd");
		
		Child c = new Child();
		c.walk(); //parent만 갖고있음
		c.run(); // 둘다 갖고있음
		c.eat(); // child만 갖고있음
		System.out.println(c);
		
		
		Parent p = new Child();
		p.walk(); // 
		p.run();  // 자식이 달린다... 중요한건 타입이 아니라 인스턴스가 중요하다.......!!!!! 런타임..과관련이....
	  //p.eat(); // 불가능입니다. 왜?! p의 타입이 Parent 이기 때문에 컴파일이 오류로 판단..
		((Child)p).eat(); //
		System.out.println(c);
		
		Parent p2 = new Parent();
	  //((Child)p2).eat(); //컴파일러가 체크 못하고 오류가 발생됨
							//원래 불가능하지만 상속관계라 체크를 못함...
		//p2 = p;
		//((Child)p2).eat();
		
		//Uncle u = new Child(); //상속관계가 아니라 불가능
		Uncle u = new Uncle();
		u.walk();
	  //((Child)u).walk(); 얘는 컴파일러도 막아줌. 관계가없응께
		
//instanceof 너는 누구의 instance냐? 형변환가능여부판단
	
		if(p2 instanceof Parent) {
			System.out.println("p2는 Parent의 인스턴스");
		}
		
		if(p2 instanceof Child) {
			System.out.println("p2는 Child의 인스턴스");
		}
	}
}
