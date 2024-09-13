package memo;

public class PolyEx {
	public static void main(String[] args) {
		
		
		Parent p = new Child(); //자식객체로 생성된 부모 객체 p.. 컴파일러는 p를 부모객체로 인식
		
		p.run();
		p.walk();
		((Child) p).eat();
		
		//자식
		
		Child c = (Child)p;
		c.run();
		c.walk();
		c.eat();
		
	}
	
}


class Parent{
	String name;
	
	void walk() {
		System.out.println("부 - 걷");
	}
	
	void run() {
		System.out.println("부 - 뛰");
	}
}

class Child extends Parent{
	
	void run() {
		System.out.println("자 - 뛰");
	}
	
	void eat() {
		System.out.println("자 - 먹");
	}
	
}
