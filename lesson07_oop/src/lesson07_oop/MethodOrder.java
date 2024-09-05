package lesson07_oop;

public class MethodOrder {
	public static void main(String[] args) {
		System.out.println("main start");
		MethodEx ex = new MethodEx();
		ex.one();
		System.out.println("main end");
	
	}
}

class MethodEx {
	void one(){
		System.out.println();
		System.out.println("one start");
		two(); //같은클래스에있어서 호출 가능함.. this.two() //this는 MethodEx의 인스턴스
		System.out.println("one end");
	}
	void two(){
		System.out.println("two start");
		three();
		System.out.println("two end");
	}
	void three() {
		System.out.println("three");
	}
}
