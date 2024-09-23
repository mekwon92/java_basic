package lesson09_interface;
//public static final
public class ComplexerMain {
	public static void main(String[] args) {//추상메서드라 객체생성이 안되는데..~?
		
		Complexer com = new Complexer();
		System.out.println(com);//안됨
		System.out.println(Complexer.INK);
		System.out.println(Printer.INK);
		
		System.out.println(Fax.FAX_NUMBER);
		com.print();
		com.scan();
		com.send("02-8765-4321");
		com.receive("02-8765-4321");
		
		//익명클래스
		Fax fax = new Fax() {
			
			@Override
			public void send(String msg) {
				System.out.println("fax 송신");
			}
			
			@Override
			public void receive(String msg) {
				System.out.println("fax 수신");
			}
		};
		fax.send("abcd");
		fax.receive("asdf");
		
		Complexer com2 = new Complexer() { //인스턴스만들면서 오버라이드
			public void scan() {
				System.out.println("com2의 스캔");
			}
		};
		com2.scan();

		
	}
}
