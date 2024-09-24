package lesson10_inner;
//익명클래스
public class LocalTest {
	
	static MyInter create() {
		class MyClass implements MyInter{
			@Override
			public void run() {
				System.out.println("MyClass.()");
			}
		}
		return new MyClass();
	}
	
	
	static MyInter create2() {
		return new MyInter() {
			@Override
			public void run() {
				System.out.println("create2().run()");
			}
		};		
	}
	
	
	
	static MyInter create3() {
		return () -> System.out.println("lambda.run()");
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		MyInter mi = create();
		mi.run();
		create2().run();
		create3().run();
	}
}

interface MyInter {
	void run();
}