package lesson07_oop;
//오버로딩... 자료형이나 파라미터 갯수 등으로 구분함
public class Overloading {
	public static void main(String[] args) {
		new Operator().multiply(10,20);
	}
}


class Operator {
	int multiply(int x, int y) {
		return x * y;
	}
	int multiply(int z) {
		return z * z;
	}
	double multiply(double x, int y) {
		return x * y;
	}
	double multiply(int x, double y) {
		return x * y;
	}
}

