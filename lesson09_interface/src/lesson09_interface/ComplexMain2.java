package lesson09_interface;

public class ComplexMain2 {
	public static void main(String[] args) {
		Fax fax = new Fax() {
			
			@Override
			public void send(String tel) {
				System.out.println("익명구현객체 send");
			}
			@Override
			public void receive(String tel) {
				System.out.println("익명 구현객체 receive");
			}
		};
		
		fax.send("1234");
		fax.receive("3456");
		
	}
	
}
