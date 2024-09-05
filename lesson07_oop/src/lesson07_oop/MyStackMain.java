package lesson07_oop;

public class MyStackMain {
	public static void main(String[] args) {
		MyStack ms = new MyStack();
		
		for(int i = 0 ; i < 100_000; i++) {
			ms.push(i);
		}
		
		
		
		
		ms.push(10);
		ms.push(20);
		System.out.println(ms.size());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		ms.push(30);
		System.out.println(ms.pop());
		System.out.println(ms.size()); //저장된값은 그대로~
	}
}
