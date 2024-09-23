package lesson09_interface;

public class ComplexMain3 {
	public static void main(String[] args) {
		ComplexerInterface ci = new ComplexerInterface() {
			
			@Override
			public void scan() {
				System.out.println("익명scan");
			}
			
			@Override
			public void print() {
				System.out.println("익명print");
				
			}
			
			@Override
			public void send(String tel) {
				System.out.println("익명send");
				
			}
			
			@Override
			public void receive(String tel) {
				System.out.println("익명receive");
				
			}
		};
		
		ci.send("1234");
		ci.receive("1234");
		ci.print();
		ci.scan();
	}
}
