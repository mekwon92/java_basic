package lesson07_oop;

public class MarineMain {
	public static void main(String[] args) {
		Marine marine = new Marine();
		
		System.out.println(marine.hp); //여기서 out은 final.... system은 클래스...
		
		marine.hp -= 5 * 6;
		
		System.out.println(marine.hp);
		
		Marine.att++; //공업
	}
	
	int add(int a, int b) {
		return a+b;
	}
	double d() {
		return 0;
	}
}
