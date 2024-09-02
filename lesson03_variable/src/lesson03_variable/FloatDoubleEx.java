package lesson03_variable;

public class FloatDoubleEx {
	public static void main(String[] args) {
		float f = 3.141592653589793f;
		double d = 3.141592653589793d;
		
		System.out.println("float : "+f);
		System.out.println("double : "+d);
		
		double d2 = 3.141592653589793f;
		double d3 = 3.141592653589793;
		
		System.out.println("double d2: "+d2);
		System.out.println("double d3: "+d3);
		
		double d4 = 10 / 4; // 2.0
		double d5 = 10 / 4d; // 2.5
		
		System.out.println("double d4: "+d4);
		System.out.println("double d5: "+d5);
		
	}
}
