package lesson4_operator;

public class Check {
	
	public static void main(String[] args) {
		
		//사과 123개 상자 당 10개씩 들어간다. 몇개의 상자가 필요한가?
	int apple = 123;
	int box = 19;
	
	int result2 = apple % box == 0 ? apple / box : apple / box + 1;
	
	int result3 = (apple + (box-1)) / box;
	
	System.out.println(result2);
	
	System.out.println(result2 + "개가 필요합니다.");
	System.out.println(result3 + "개가 필요합니다.");
	
	// 소수점 자르기 (반올림) : 셋째 자리로
	// 3.141592 
	// 3.142
	double pi = 3.141592;
	System.out.println((int)(pi * 1000) / 1000d);
	System.out.println((int)(pi * 1000 + 0.5) / 1000d);
	
	System.out.println();
	int num1 = 1_000_000 * 1_000_000 / 1_000_000;
	long num2 = 1_000_000L * 1_000_000 / 1_000_000;
	int num3 = 1_000_000 / 1_000_000 * 1_000_000;
	
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(num3);
	}
}
